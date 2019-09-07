import java.util.ArrayList;
import java.util.List;

public class ElementoListImp implements IPrototype<ElementoListImp> {

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
