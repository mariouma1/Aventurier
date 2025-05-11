package org.example.validator.impl;

import org.example.model.PositionResult;
import org.example.validator.PositionValidationStrategy;

import java.util.Optional;

public class DefaultPositionValidator implements PositionValidationStrategy {
    @Override
    public PositionResult validate(char[][] carte, int x, int y)  throws Exception {
        if (isValid(carte, x, y)) {
            return  new PositionResult(x, y, false); // pas de switch
        } else if (isValid(carte, y, x)) {
            return new PositionResult(y, x, true); // switch effectué
        } else {
            throw new Exception("Position initiale invalide.");
        }
    }


    public boolean isValid(char[][] carte, int x, int y) {
        return y >= 0 && y < carte.length && x >= 0 && x < carte[y].length && carte[y][x] != '#';
    }
}
