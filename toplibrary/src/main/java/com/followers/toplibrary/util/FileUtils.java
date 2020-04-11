package com.followers.toplibrary.util;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.Formatter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 文件操作相关工具类
 *
 * @author
 * @since 2016/4/21
 */
public class FileUtils {
    public static final String MOODS_DIR="缓存/";
    /**
     * 是否存在SD卡
     *
     * @return
     */
    public static boolean hasSDCard() {
        boolean flag = Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())
                && Environment.getExternalStorageDirectory().exists();
        String cacheFile ="";
        try{
            cacheFile = Utils.getContext().getExternalCacheDir().getPath();

        }catch (Exception e){


        }

        return flag && !cacheFile.equals("");
    }

    /**
     * 获取手机可用空间大小字符串
     * 存在内存卡则返回为内存卡数据，否则为手机内存数据
     *
     * @param context 上下文
     * @return
     */
    public static String getLeftMemorySizeStr(Context context) {
        String memory;
        if (hasSDCard()) {
            // 获得sd卡的内存状态
            File sdcardFileDir = Environment.getExternalStorageDirectory();
            memory = getMemoryInfo(context, sdcardFileDir);
        } else {
            // 获得手机内部存储控件的状态
            File dataFileDir = Environment.getDataDirectory();
            memory = getMemoryInfo(context, dataFileDir);
        }
        return memory;
    }
    public static String getMoodsDir(){
        File dir = new File(getDefaultPath()+MOODS_DIR);
        if (!dir.exists()){
            dir.mkdirs();
        }
       return getDefaultPath()+MOODS_DIR;
    }

    /**
     * 根据路径获取内存状态
     *
     * @param context 上下文
     * @param path    磁盘路径
     * @return
     */
    private static String getMemoryInfo(Context context, File path) {
        // 获得一个磁盘状态对象
        StatFs stat = new StatFs(path.getPath());
        long blockSize = stat.getBlockSize();   // 获得一个扇区的大小
        long totalBlocks = stat.getBlockCount();    // 获得扇区的总数
        long availableBlocks = stat.getAvailableBlocks();   // 获得可用的扇区数量
        // 总空间
        String totalMemory = Formatter.formatFileSize(context, totalBlocks * blockSize);
        // 可用空间
        String availableMemory = Formatter.formatFileSize(context, availableBlocks * blockSize);
        return "可用空间: " + availableMemory + "/总空间: " + totalMemory;
    }

    /**
     * 转换文件大小
     *
     * @param context 上下文
     * @param fileS   目标文件
     * @return
     */
    public static String formatFileSize(Context context, long fileS) {
        String fileSizeString = Formatter.formatFileSize(context, fileS);
        return fileSizeString;
    }

    /**
     * 默认存储的路径
     */
//    private static final String NAME = AppInfoUtils.getAPPName(AppContextUtils.getAppContext());

    /**
     * 获取文件默认存储路径
     *
     * @return
     */
    public static String getDefaultPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(hasSDCard() ? Environment.getExternalStorageDirectory().getAbsolutePath() : Utils.getContext().getFilesDir().getAbsolutePath());
        sb.append(File.separator);
        sb.append(AppUtil.getAPPName(Utils.getContext()));
        sb.append(File.separator);

        String path = sb.toString();
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Throwable e) {
                path = "";
                e.printStackTrace();
            }
        }
        return path;
    }

    /**
     * 获取目录下所有文件不包含文件夹(按时间排序)
     *
     * @param path
     * @return
     */
    public static List<File> listFileSortByModifyTime(String path) {
        List<File> list = getFilesWithoutDir(path);
        if (list != null && list.size() > 0) {
            Collections.sort(list, new Comparator<File>() {
                public int compare(File file, File newFile) {
                    if (file.lastModified() > newFile.lastModified()) {
                        return -1;
                    } else if (file.lastModified() == newFile.lastModified()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            });
        }
        return list;
    }
    /**
     *
     * 获取目录下所有文件不包含 文件夹 与.nomedia
     *
     * @param realpath
     * @return
     */
    public static List<File> getFilesWithoutDir(String realpath) {
        List<File> files =new ArrayList<>();
        File realFile = new File(realpath);
        if (realFile.exists()&&realFile.isDirectory()) {
            File[] subfiles = realFile.listFiles();
            for (File file : subfiles) {
                if (!file.isDirectory()&&!file.getName().contains("nomedia")) {
                    files.add(file);
                }
            }
        }
        return files;
    }
    /**
     *
     * 获取目录下所有文件
     *
     * @param realpath
     * @param files
     * @return
     */
    public static List<File> getFiles(String realpath, List<File> files) {
        File realFile = new File(realpath);
        if (realFile.exists()&&realFile.isDirectory()) {
            File[] subfiles = realFile.listFiles();
            for (File file : subfiles) {
                if (file.isDirectory()) {
                    getFiles(file.getAbsolutePath(), files);
                } else {
                    files.add(file);
                }
            }
        }
        return files;
    }
    /**
     * 删除文件
     *
     * @param file
     */
    public static void deleteFile(File file) {
        if (file != null) {
            if (file.exists()) {
                if (file.isFile()) {
                    file.delete();
                } else if (file.isDirectory()) {
                    File files[] = file.listFiles();
                    for (int i = 0; i < files.length; i++) {
                        deleteFile(files[i]);
                    }
                }
                file.delete();
            }
        }
    }

    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else {
                String[] filePaths = file.list();
                for (String path : filePaths) {
                    deleteFile(filePath + File.separator + path);
                }
                file.delete();
            }
        }
    }

    /**
     * 文件拷贝
     *
     * @param from
     * @param to
     * @return
     */
    public static boolean copyFile(String from, String to) {
        boolean result = false;

        int size = 1024;

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(from);
            out = new FileOutputStream(to);
            byte[] buffer = new byte[size];
            int bytesRead = -1;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            out.flush();
            result = true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
            }
        }
        return result;
    }
}
