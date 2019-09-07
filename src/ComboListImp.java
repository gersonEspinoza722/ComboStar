import java.util.ArrayList;
import java.util.List;

public class ComboListImp implements IPrototype<ComboListImp>{

    private String comboListName;
    private List<Combo> combos = new ArrayList<Combo>();


    public ComboListImp(String comboListName) {
        this.comboListName = comboListName;
    }

    public String getComboListName() {
        return comboListName;
    }

    public void setComboListName(String comboListName) {
        this.comboListName = comboListName;
    }

    public List<Combo> getCombos() {
        return combos;
    }

    public void setCombos(List<Combo> combos) {
        this.combos = combos;
    }

    public void addCombo(Combo combo){
        combos.add(combo);
    }

    @Override
    public ComboListImp clone() {
        return null;
    }

    @Override
    public ComboListImp deepClone() {
        List<Combo> cloneCombos = new ArrayList<>();
        for (Combo combo: this.combos){
            Combo cloneCombo = combo.deepClone();
            cloneCombos.add(cloneCombo);
        }
        ComboListImp clone = new ComboListImp(this.comboListName);
        clone.setCombos(cloneCombos);
        return clone;
    }
}
