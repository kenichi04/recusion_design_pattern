package com.example.prototype.stamps;

public class PeaceStamp extends GenericStamp {
    private final static String TITLE = "Peace";
    private final static String RENDER = "☮";

    public PeaceStamp(String color) {
        this.title = PeaceStamp.TITLE;
        this.render = PeaceStamp.RENDER;
        this.color = color;
    }

    public PeaceStamp(Stamp stamp) {
        this.title = PeaceStamp.TITLE;
        this.render = PeaceStamp.RENDER;
        this.color = stamp.getColor();
    }

    @Override
    public Stamp clone() {
        return new PeaceStamp(this);
    }
}
