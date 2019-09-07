import java.util.ArrayList;
import java.util.List;

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

    @Override
    public Principal clone() {
        return null;
    }

    @Override
    public Principal deepClone() {
        return new Principal(this.codigo, this.precio, this.nombre);
    }

    public static class ElementoListImp implements IPrototype<ElementoListImp> {

        private String elementoListName;
        private List<Elemento> elementos = new ArrayList<>();

        public ElementoListImp(String elementoListName) {
            this.elementoListName = elementoListName;
        }

        public String getElementoListName() {
            return elementoListName;
        }

        public void setElementoListName(String elementoListName) {
            this.elementoListName = elementoListName;
        }

        public List<Elemento> getElementos() {
            return elementos;
        }

        public void setElementos(List<Elemento> elementos) {
            this.elementos = elementos;
        }

        public void addElemento(Elemento elemento){
            elementos.add(elemento);
        }

        @Override
        public ElementoListImp clone() {
            return null;
        }

        @Override
        public ElementoListImp deepClone() {
            List<Elemento> cloneElementos = new ArrayList<>();
            for (Elemento elemento: this.elementos) {
                Elemento cloneElemento = elemento.deepClone();
                cloneElementos.add(cloneElemento);
            }
            ElementoListImp clone = new ElementoListImp(this.elementoListName);
            clone.setElementos(cloneElementos);
            return clone;
        }
    }
}
