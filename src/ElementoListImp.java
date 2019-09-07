import java.util.ArrayList;
import java.util.List;

public class ElementoListImp implements IPrototype<ElementoListImp> {

    private String elementoListName;
    private List<Elemento> elementos = new ArrayList<>();

    public ElementoListImp(String elementoListName) {
        this.elementoListName = elementoListName;
    }

    public Elemento buscar(int i) {
        for (int x = 0; x < elementos.size(); x++) {
            if (elementos.get(x).getCodigo() == i) {
                return elementos.get(x);
            }
        }
        return null;
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