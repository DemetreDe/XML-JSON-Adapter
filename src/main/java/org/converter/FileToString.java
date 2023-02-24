package org.converter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileToString {
        private final String directory;

    public FileToString(String directory) {
        this.directory = directory;
    }

    private final StringBuilder sb = new StringBuilder();

    public String readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(directory))) {
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
        return sb.toString();
    }
}






