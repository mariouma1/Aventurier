package org.example.action.command;
import org.example.model.Position;

public interface MoveCommand {
    void execute(Position position, char[][] map);
}
