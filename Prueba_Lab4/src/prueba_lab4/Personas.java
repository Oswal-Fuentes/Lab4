
package prueba_lab4;

import javax.swing.JOptionPane;

public class Personas {
    private String Nombre;
    private String Usuario;
    private int Puntos;
    private String LugarNacimiento;
    private int Edad;
    private String Sexo;

    public Personas() {
    }

    public Personas(String Nombre, String Usuario, int Puntos, String LugarNacimiento, int Edad, String Sexo) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Puntos = Puntos;
        this.LugarNacimiento = LugarNacimiento;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    public String getLugarNacimiento() {
        return LugarNacimiento;
    }

    public void setLugarNacimiento(String LugarNacimiento) {
        this.LugarNacimiento = LugarNacimiento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        if (Edad > 0) {
           this.Edad = Edad; 
        }
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        if (Sexo.equalsIgnoreCase("Femenino") || Sexo.equalsIgnoreCase("Masculino")) {
            this.Sexo = Sexo;
        } else{
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar Femenino o Masculino.");
        }
    }

    @Override
    public String toString() {
        return "Personas {" + "Nombre: " + Nombre + ", Usuario: " + Usuario + ", Puntos: " + Puntos + ", Lugar de Nacimiento: " + LugarNacimiento + ", Edad: " + Edad + ", Sexo: " + Sexo + "'}'\n";
    }
    
}