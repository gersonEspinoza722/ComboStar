public class Principal extends Elemento{

    public Principal(int pC, int pP, String pN){
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
}