package org.example.model;

public class PositionResult extends Position{


    public boolean wasSwitched() {
        return switched;
    }


    public final boolean switched;

    public PositionResult(int x, int y, boolean switched) {
        super(x,y);
        this.switched = switched;
    }
}
