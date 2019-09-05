import java.util.ArrayList;
import java.util.List;

public class Combo implements IPrototype<Combo>{
    private int costoTotal; //Se sumará el costo de todos los elementos al hacer build();
    private List<Adicional> adicionales;
    private List<Bebida> bebidas;
    private Principal principal;

    private Combo(Principal principal, List<Bebida> bebidas, List<Adicional> adicionales) {
        this.adicionales=adicionales;
        this.bebidas=bebidas;
        this.principal=principal;

        this.costoTotal=0;

        for (int i=0;i<bebidas.size();i++){
            costoTotal+=bebidas.get(i).getPrecio();
        }
        for (int i=0;i<adicionales.size();i++){
            costoTotal+=adicionales.get(i).getPrecio();
        }
        costoTotal+=principal.getPrecio();
    }

    @Override
    public Combo deepClone() {
        List<Bebida> listBebidas = new ArrayList<>();
        for (Bebida bebida: this.bebidas){
            listBebidas.add((Bebida) bebida.clone());
        }
        List<Adicional> listAdicionales = new ArrayList<>();
        for (Adicional adicional: this.adicionales){
            listAdicionales.add((Adicional) adicional.clone());
        }
        return new Combo((Principal) this.principal.clone(), listBebidas, listAdicionales);
    }

    @Override
    public Combo clone() {
        return new Combo((Principal) this.principal.clone(), this.bebidas, this.adicionales);
    }

    public static class ComboBuilder implements IBuilder<Combo>{
        private final List<Adicional> adicionalesB = new ArrayList<>();;
        private final List<Bebida> bebidasB = new ArrayList<>();;
        private Principal principalB;


        public ComboBuilder() {   }

        @Override
        public Combo build() {
            return new Combo(principalB,bebidasB,adicionalesB);
        }

        public ComboBuilder setPrincipal(Principal principal) {
            this.principalB = principal;//Sacarlo clonado de algún lado, mandarlo de entrada completo
            return this;
        }
        public ComboBuilder addAdicional(Adicional adicional) {
            this.adicionalesB.add(adicional);//Sacarlo clonado de algún lado, mandarlo de entrada completo
            return this;
        }
        public ComboBuilder addBebida(Bebida bebida) {
            this.bebidasB.add(bebida);//Sacarlo clonado de algún lado, mandarlo de entrada completo
            return this;
        }

    }
}
