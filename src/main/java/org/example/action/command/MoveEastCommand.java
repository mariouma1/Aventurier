package org.example.action.command;

import org.example.model.Position;

public class MoveEastCommand extends AbstractMoveCommand {


    @Override
    protected Position simulateMovement(Position position) {
        return new Position(position.getX() + 1, position.getY());
    }
}
