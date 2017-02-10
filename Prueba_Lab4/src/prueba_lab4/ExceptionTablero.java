package prueba_lab4;

public class ExceptionTablero extends Exception {
    private int Codigo;

    public ExceptionTablero() {
    }
    
    public ExceptionTablero(int Codigo, String Mensaje) {
        super(Mensaje);
        this.Codigo = Codigo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
} // Fin class ExceptionTablero