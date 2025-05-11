package org.example.action.command;

import org.example.model.Position;

public class MoveSouthCommand extends AbstractMoveCommand{

    @Override
    protected Position simulateMovement(Position position) {
        return new Position(position.getX(), position.getY() + 1);
    }
}
