public abstract class Elemento {
    protected int codigo;
    protected int precio;
    protected String nombre;

    public Elemento(int pC, int pP, String pN){

        this.codigo=pC;
        this.precio=pP;
        this.nombre=pN;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
