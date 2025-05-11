package org.example;

import java.io.*;
import java.nio.file.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException{

        if (args.length != 2) {
            System.err.println("Usage: java Aventurier <carte.txt> <deplacement.txt>");
            return;
        }

        List<String> carte = Files.readAllLines(Paths.get(args[0]));
        List<String> mouvements = Files.readAllLines(Paths.get(args[1]));

        String[] start = mouvements.get(0).split(",");
        int x = Integer.parseInt(start[0]);
        int y = Integer.parseInt(start[1]);
        String directions = mouvements.get(1);

        int hauteur = carte.size();
        int largeur = carte.get(0).length();

        for (char dir : directions.toCharArray()) {
            int nx = x, ny = y;
            switch (dir) {
                case 'N': ny--; break;
                case 'S': ny++; break;
                case 'E': nx++; break;
                case 'O': nx--; break;
            }

            if (nx >= 0 && nx < largeur && ny >= 0 && ny < hauteur) {
                if (carte.get(ny).charAt(nx) == ' ') {
                    x = nx;
                    y = ny;
                }
            }
        }

        System.out.println("Position finale : (" + x + "," + y + ")");

        }

}