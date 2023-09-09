package com.example.prototype.stamps;

public class GenericStamp implements Stamp {
    private final static String TITLE = "Generic Stamp";
    private final static String Render = "❔";

    protected String title;
    protected String render;
    protected String color;

    public GenericStamp(){};

    public GenericStamp(String color) {
        this.title = GenericStamp.TITLE;
        this.render = GenericStamp.Render;
        this.color = color;
    }

    public GenericStamp(Stamp stamp) {
        this.title = GenericStamp.TITLE;
        this.render = GenericStamp.Render;
        this.color = stamp.getColor();
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getRender() {
        return this.render;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Stamp clone() {
        return new GenericStamp(this);
    }

    @Override
    public String toString() {
        return this.title + " - " + this.render + " (" + this.color + ")";
    }
}
