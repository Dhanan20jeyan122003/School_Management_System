package com.SchoolManagement.School_Management.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    private static final String UPLOAD_DIR = "uploads/";

    public static String saveFile(byte[] fileBytes, String filename) throws IOException {
        Path uploadPath = Paths.get(UPLOAD_DIR);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        Path filePath = uploadPath.resolve(filename);
        Files.write(filePath, fileBytes);
        return filePath.toString();
    }

    public static boolean deleteFile(String filepath) {
        File file = new File(filepath);
        return file.exists() && file.delete();
    }
}