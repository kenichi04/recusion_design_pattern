package com.example.prototype.stamps;

public interface Stamp extends Prototype<Stamp> {
    String getTitle();
    String getRender();
    String getColor();
    @Override
    Stamp clone();
}
