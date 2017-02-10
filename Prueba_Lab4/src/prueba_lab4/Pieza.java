package prueba_lab4;

import java.awt.Color;

public abstract class Pieza implements Movimiento {

    protected String color;
    protected String material;

    public Pieza() {
    }

    public Pieza(String color, String material) {
        this.color = color;
        this.material = material;
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

}
