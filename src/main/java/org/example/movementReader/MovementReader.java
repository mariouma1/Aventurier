package org.example.movementReader;

import java.io.IOException;

public interface MovementReader {
    int[] readInitialPosition() throws IOException;
    char[] readMovements() throws IOException;

}
