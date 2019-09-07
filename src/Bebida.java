public class Bebida extends Elemento {

    public Bebida(int pC, int pP, String pN) {
        super(pC, pP, pN);

    }

    public String toString() {
        try {
            String result = "NOMBRE: (" + this.nombre + "), PRECIO:" + this.precio + ", CODIGO:" + this.codigo;
            return result + "\n";
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public Bebida clone() {
        return null;
    }

    @Override
    public Bebida deepClone() {
        return new Bebida(this.codigo, this.precio, this.nombre);
    }
}