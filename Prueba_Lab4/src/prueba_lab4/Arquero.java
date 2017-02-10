package prueba_lab4;

import java.awt.Color;


/**
 *
 * @author Oswal
 */


public class Arquero extends Pieza {

    public Arquero() {
    }

    public Arquero(String color, String material) {
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

    @Override

    public String toString() {
        return "A-" + getColor() + "  ";
    }

    public void Mover(int X, int Y) {
    
    }
    

}
