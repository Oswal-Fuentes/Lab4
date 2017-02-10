package prueba_lab4;

import java.awt.Color;

public class Caballero extends Pieza {

    public Caballero() {
    }

    public Caballero(String color, String material) {
        super(color, material);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return "C-" + getColor() + "  ";
    }

    public void Mover(int X, int Y) {

    }
}
