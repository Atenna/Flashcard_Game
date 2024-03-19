package com.ivankaelde.newproject.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DictionaryHandler {

    private static List<String> dictionaryLines;

    public static void loadDictionary() throws IOException {
        String filePath = "src/main/data.txt";
        dictionaryLines = Files.readAllLines(Paths.get(filePath));
    }

    public static List<String> getDictionaryLines() {
        return dictionaryLines;
    }
}
