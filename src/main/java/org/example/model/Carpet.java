package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private PaintColor paintColor;
    private int width;
    private int height;


    public Carpet(PaintColor paintColor, int width, int height) {
        this.paintColor = paintColor;
        this.width = width;
        this.height = height;
    }

    public PaintColor getPaintColor() {
        return paintColor;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void lying() {
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "paintColor=" + paintColor +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
