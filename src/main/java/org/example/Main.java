package org.example;

import org.example.action.invoker.MoveInvoker;
import org.example.mapreader.MapReader;
import org.example.mapreader.impl.FileMapReader;
import org.example.model.PositionResult;
import org.example.movementReader.MovementReader;
import org.example.movementReader.impl.FileMovementReader;
import org.example.validator.PositionValidationStrategy;
import org.example.validator.impl.DefaultPositionValidator;

import javax.xml.validation.Validator;
import java.io.*;
import java.nio.file.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.err.println("Usage: java Aventurier <carte.txt> <deplacement.txt>");
            return;
        }



        // Read
        MapReader mapReader = new FileMapReader(args[0]);
        MovementReader movementReader = new FileMovementReader(args[1]);

        // Lecture de la carte et des mouvements
        char[][] carte = mapReader.readMap();
        int[] initialPosition = movementReader.readInitialPosition();
        char[] directions = movementReader.readMovements();




        // Validation de la position initiale
        PositionValidationStrategy validator = new DefaultPositionValidator();
        PositionResult result = validator.validate(carte, initialPosition[0], initialPosition[1]);






        // Create MoveInvoker and execute the moves
        MoveInvoker moveInvoker = new MoveInvoker(directions);
        moveInvoker.executeMoves(result, carte);

        int x=result.getX();
        int y=result.getY();
        if (result.wasSwitched()) {
            int temp = x;
            x = y;
            y = temp;
        }

        System.out.println("✅ Position finale : (" + x + "," + y + ")");
    }



    
}