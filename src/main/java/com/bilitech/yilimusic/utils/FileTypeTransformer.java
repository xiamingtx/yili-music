package com.bilitech.yilimusic.utils;

import com.bilitech.yilimusic.enums.FileType;

/**
 * @author 夏明
 * @version 1.0
 */
public class FileTypeTransformer {

    public static FileType getFileTypeFromExt(String ext) {
        if (isAudio(ext)) {
            return FileType.AUDIO;
        }

        if (isImage(ext)) {
            return FileType.IMAGE;
        }

        if (isVideo(ext)) {
            return FileType.VIDEO;
        }

        return FileType.OTHER;
    }

    private static Boolean isVideo(String ext) {
        String[] videoExt = {"vob", "mp4", "avi",
                "flv", "f4v", "wmv", "mov", "rmvb",
                "mkv", "mpg", "m4v", "webm", "rm",
                "mpeg", "asf", "ts", "mts"};
        for (String perExt : videoExt) {
            if (perExt.equals(ext))
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private static Boolean isAudio(String ext) {
        String[] audioExt = {"mp3", "wav"};
        for (String perExt : audioExt) {
            if (perExt.equals(ext))
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }


    private static Boolean isImage(String ext) {
        String[] imageExt = {"png", "jpg", "jpeg"};
        for (String perExt : imageExt) {
            if (perExt.equals(ext))
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
