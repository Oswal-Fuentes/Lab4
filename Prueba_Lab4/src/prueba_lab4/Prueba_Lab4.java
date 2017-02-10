package prueba_lab4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Prueba_Lab4 {

    public static void main(String[] args) {
        Tablero t = new Tablero();
        Pieza[][] tablero = t.Tablero();
        String Nombre, Usuario, LugarNacimiento, Sexo;
        int Puntos, Edad;
        ArrayList Jugadores = new ArrayList();
        int Opcion = 0;
        while (Opcion != 4) {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a Personas: \n"
                    + "Menú Personas\n"
                    + "1.- Agregar Personas\n"
                    + "2.- Eliminar Personas\n"
                    + "3.- Listar Personas\n"
                    + "4.- Salir\n"
                    + "Eliga una de las opciones: "));

            switch (Opcion) {
                case 1:

                    Nombre = JOptionPane.showInputDialog("Nombre: ");
                    Usuario = JOptionPane.showInputDialog("Usuario: ");
                    Puntos = 0;
                    LugarNacimiento = JOptionPane.showInputDialog("Lugar de nacimiento: ");
                    Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
                    Sexo = JOptionPane.showInputDialog("Sexo (Femenino o Masculino): ");
                    Jugadores.add(new Personas(Nombre, Usuario, Puntos, LugarNacimiento, Edad, Sexo));

                    break;
                case 2:

                    int Posicion = Integer.parseInt(JOptionPane.showInputDialog(Jugadores + "\n"
                            + "Eliga la posicion del jugador a eliminar: "));
                    Jugadores.remove(Posicion);
                    JOptionPane.showMessageDialog(null, "Se ha eliminado al jugador exitosamente");

                    break;

                case 3:

                    JOptionPane.showMessageDialog(null, Jugadores);

                    break;
            } // Fin switch
        }
        ImprimirTablero(tablero);
    }

    public static void ImprimirTablero(Pieza[][] tablero) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }
}
