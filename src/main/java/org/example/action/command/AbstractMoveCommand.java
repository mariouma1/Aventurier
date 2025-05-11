package org.example.action.command;

import org.example.model.Position;

public abstract class AbstractMoveCommand implements MoveCommand{
    // Template Method
    @Override
    public final void execute(Position position, char[][] map) {
        Position simulatedPosition = simulateMovement(position);


        if (checkSimulatedPosition(simulatedPosition, map)) {
            updatePosition(position,simulatedPosition);
        }
    }

    // Step 1: Simulate the movement (calculation of new position)
    protected abstract Position simulateMovement(Position position);

    // Step 2: Check if the simulated position is valid
    private boolean checkSimulatedPosition(Position position, char[][] map) {

        int x = position.getX();
        int y = position.getY();
        return y >= 0 && y < map.length && x >= 0 && x < map[y].length && map[y][x] != '#';
    }

    // Step 3: Update the position if valid
    private void updatePosition(Position position,Position simulatedPosition) {
    position.setX(simulatedPosition.getX());
    position.setY(simulatedPosition.getY());
    }
}
