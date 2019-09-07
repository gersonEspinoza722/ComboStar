public class Adicional extends Elemento {

    public Adicional(int pC, int pP, String pN){
        super(pC, pP, pN);

    }
    public String toString() {
        try
        {
            String result =  "NOMBRE: ("+ this.nombre + "), PRECIO:" + this.precio + ", CODIGO:" + this.codigo;
            return result + "\n";
        }
        catch(Exception e){
            return "";
        }
    }

    @Override
    public Adicional clone() {
        return null;
    }

    @Override
    public Adicional deepClone() {
        return new Adicional(this.codigo, this.precio, this.nombre);
    }
}
