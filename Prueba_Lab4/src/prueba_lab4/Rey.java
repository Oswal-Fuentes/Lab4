package prueba_lab4;

import java.awt.Color;

/**
 *
 * @author Oswal
 */
public class Rey extends Pieza {

    public Rey() {
    }

    public Rey(String color, String material) {
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
        return "R-" + getColor() + "  ";
    }

    public void Mover(int X, int Y) {

    }
}
