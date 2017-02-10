package prueba_lab4;

import java.awt.Color;

public class Dragon extends Pieza{

    public Dragon() {
    }

    public Dragon(String color, String material) {
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

    public void Mover(int X, int Y) {
        
    }

    public String toString() {
        return "F-" + getColor() + "  ";
    }

}
