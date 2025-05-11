package org.example.mapreader.impl;

import org.example.mapreader.MapReader;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileMapReader implements MapReader {

    private final String path;

    public FileMapReader(String path) {
        this.path = path;
    }

    @Override
    public char[][] readMap() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        char[][] map = new char[lines.size()][];

        for (int i = 0; i < lines.size(); i++) {
            map[i] = lines.get(i).toCharArray();
        }
        return map;
    }
}
