package org.example.movementReader.impl;

import org.example.movementReader.MovementReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMovementReader implements MovementReader {private final String path;

    public FileMovementReader(String path) {
        this.path = path;
    }

    @Override
    public int[] readInitialPosition() throws IOException {
        // Lecture de la première ligne pour obtenir la position initiale
        String positionLine = Files.readAllLines(Paths.get(path)).get(0); // La première ligne contient la position
        String[] positionParts = positionLine.split(",");
        int x = Integer.parseInt(positionParts[0]);
        int y = Integer.parseInt(positionParts[1]);
        return new int[] {x, y};
    }

    @Override
    public char[] readMovements() throws IOException {
        // Lecture de la deuxième ligne pour obtenir les mouvements
        String movementLine = Files.readAllLines(Paths.get(path)).get(1); // La deuxième ligne contient les mouvements
        return movementLine.toCharArray();
    }
}