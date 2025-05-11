package org.example.action.invoker;
import org.example.action.command.*;
import org.example.model.Position;

import java.util.*;

public class MoveInvoker {
    private List<MoveCommand> moveCommands;

    // Constructor now takes a char[] representing movements
    public MoveInvoker(char[] movements) {
        this.moveCommands = new ArrayList<>();
        createMoveCommands(movements);
    }

    // Method to create the MoveCommand list from char[] array
    private void createMoveCommands(char[] movements) {
        for (char movement : movements) {
            switch (movement) {
                case 'N':
                    moveCommands.add(new MoveNorthCommand());
                    break;
                case 'S':
                    moveCommands.add(new MoveSouthCommand());
                    break;
                case 'E':
                    moveCommands.add(new MoveEastCommand());
                    break;
                case 'O':
                    moveCommands.add(new MoveWestCommand());
                    break;
                default:
                    throw new IllegalArgumentException("Invalid movement: " + movement);
            }
        }
    }

    // Execute the list of commands
    public void executeMoves(Position position, char[][] map) {
        for (MoveCommand command : moveCommands) {
            command.execute(position, map);
        }
    }
}
