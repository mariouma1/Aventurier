package org.example.validator;
import org.example.model.PositionResult;

import java.util.Optional;

public interface PositionValidationStrategy {
   PositionResult validate(char[][] map, int x, int y) throws Exception;
}
