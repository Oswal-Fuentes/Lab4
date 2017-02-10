package prueba_lab4;

import java.awt.Color;

/**
 *
 * @author Oswal
 */
public class Mago extends Pieza {

    public Mago() {
    }

    public Mago(String color, String material) {
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
        return "M-" + getColor() + "  ";

    }

    public void Mover(int X, int Y) {

    }
}
