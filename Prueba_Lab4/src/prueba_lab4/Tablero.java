package prueba_lab4;

import java.util.ArrayList;

public class Tablero {

    public Pieza[][] Tablero() {
        ArrayList<Pieza> blancas = new ArrayList();
        blancas.add(new Caballero("Blanco", "Madera"));
        blancas.add(new Dragon("Blanco", "Madera"));
        blancas.add(new Arquero("Blanco", "Madera"));
        blancas.add(new Rey("Blanco", "Madera"));
        blancas.add(new Mago("Blanco", "Madera"));
        blancas.add(new Arquero("Blanco", "Madera"));
        blancas.add(new Dragon("Blanco", "Madera"));
        blancas.add(new Caballero("Blanco", "Madera"));
        blancas.add(new Duende("Blanco", "Madera"));
        blancas.add(new Arquero("Blanco", "Madera"));
        blancas.add(new Duende("Blanco", "Madera"));
        blancas.add(new Caballero("Blanco", "Madera"));
        blancas.add(new Dragon("Blanco", "Madera"));
        blancas.add(new Duende("Blanco", "Madera"));
        blancas.add(new Arquero("Blanco", "Madera"));
        blancas.add(new Duende("Blanco", "Madera"));
        //Negras
        ArrayList<Pieza> negras = new ArrayList();
        negras.add(new Duende("Negro ", "Metal"));
        negras.add(new Arquero("Negro ", "Metal"));
        negras.add(new Duende("Negro ", "Metal"));
        negras.add(new Dragon("Negro ", "Metal"));
        negras.add(new Caballero("Negro ", "Metal"));
        negras.add(new Duende("Negro ", "Metal"));
        negras.add(new Arquero("Negro ", "Metal"));
        negras.add(new Duende("Negro ", "Metal"));
        negras.add(new Caballero("Negro ", "Metal"));
        negras.add(new Dragon("Negro ", "Metal"));
        negras.add(new Arquero("Negro ", "Metal"));
        negras.add(new Mago("Negro ", "Metal"));
        negras.add(new Rey("Negro ", "Metal"));
        negras.add(new Arquero("Negro ", "Metal"));
        negras.add(new Dragon("Negro ", "Metal"));
        negras.add(new Caballero("Negro ", "Metal "));
        Pieza[][] tablero = new Pieza[10][10];
        //Posiciones iniciales de las piezas
        //Blancas
        tablero[0][0] = blancas.get(0);
        tablero[0][2] = blancas.get(1);
        tablero[0][3] = blancas.get(2);
        tablero[0][4] = blancas.get(3);
        tablero[0][5] = blancas.get(4);
        tablero[0][6] = blancas.get(5);
        tablero[0][7] = blancas.get(6);
        tablero[0][9] = blancas.get(7);
        tablero[1][0] = blancas.get(8);
        tablero[1][2] = blancas.get(9);
        tablero[1][3] = blancas.get(10);
        tablero[1][4] = blancas.get(11);
        tablero[1][5] = blancas.get(12);
        tablero[1][6] = blancas.get(13);
        tablero[1][7] = blancas.get(14);
        tablero[1][9] = blancas.get(15);
        //Negras
        tablero[8][0] = negras.get(0);
        tablero[8][2] = negras.get(1);
        tablero[8][3] = negras.get(2);
        tablero[8][4] = negras.get(3);
        tablero[8][5] = negras.get(4);
        tablero[8][6] = negras.get(5);
        tablero[8][7] = negras.get(6);
        tablero[8][9] = negras.get(7);
        tablero[9][0] = negras.get(8);
        tablero[9][2] = negras.get(9);
        tablero[9][3] = negras.get(10);
        tablero[9][4] = negras.get(11);
        tablero[9][5] = negras.get(12);
        tablero[9][6] = negras.get(13);
        tablero[9][7] = negras.get(14);
        tablero[9][9] = negras.get(15);
        Espacio s = new Espacio("bla", "bla");
        tablero[0][1] = s;
        tablero[0][8] = s;
        tablero[1][1] = s;
        tablero[1][8] = s;
        tablero[8][1] = s;
        tablero[8][8] = s;
        tablero[9][1] = s;
        tablero[9][8] = s;
        for (int i = 2; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = s;
            }
        }
        return tablero;
    }
}