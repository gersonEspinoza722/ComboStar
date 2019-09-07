import java.util.ArrayList;
import java.util.List;

public class Combo implements IPrototype<Combo>{
    private int costoTotal; //Se sumará el costo de todos los elementos al hacer build();
    private List<Adicional> adicionales;
    private List<Bebida> bebidas;

    public int getCostoTotal() {
        return costoTotal;
    }

    private Principal principal;
    private ComboStar comboStar;

    private Combo(Principal pprincipal, List<Bebida> pbebidas, List<Adicional> padicionales) {
        this.adicionales=padicionales;
        this.bebidas=pbebidas;
        this.principal=pprincipal;

        this.costoTotal=0;

        for (int i=0;i<bebidas.size();i++){
            costoTotal+=bebidas.get(i).getPrecio();
        }
        for (int i=0;i<adicionales.size();i++){
            costoTotal+=adicionales.get(i).getPrecio();
        }
        costoTotal+=principal.getPrecio();
    }

    public List<Adicional> getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(List<Adicional> adicionales) {
        this.adicionales = adicionales;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
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
        private List<Adicional> adicionalesB = new ArrayList<>();;
        private List<Bebida> bebidasB = new ArrayList<>();;
        private Principal principalB;


        public ComboBuilder() {   }

        @Override
        public Combo build() {
            List<Adicional> adic=new ArrayList<>();
            List<Bebida> beb=new ArrayList<>();
            for(int i=0;i<adicionalesB.size();i++){
                Adicional adicEl = new Adicional(adicionalesB.get(i).getCodigo(), adicionalesB.get(i).getPrecio(), adicionalesB.get(i).getNombre());
                adic.add(adicEl);
            }

            for(int i=0;i<bebidasB.size();i++){
                Bebida bebEl = new Bebida(bebidasB.get(i).getCodigo(), bebidasB.get(i).getPrecio(), bebidasB.get(i).getNombre());
                beb.add(bebEl);
            }
            Combo c = new Combo(principalB,beb,adic);
            this.clean();
            return c;
        }

        public ComboBuilder clean(){this.adicionalesB.clear(); this.bebidasB.clear(); this.principalB=null; return this;}

        public ComboBuilder setPrincipal(Principal principal) {
            this.principalB = (Principal) principal.deepClone();//Sacarlo clonado de algún lado, mandarlo de entrada completo
            return this;
        }
        public ComboBuilder addAdicional(Adicional adicional) {
            Adicional escogido=adicional.deepClone();
            this.adicionalesB.add(escogido);//Sacarlo clonado de algún lado, mandarlo de entrada completo
            return this;
        }
        public ComboBuilder addBebida(Bebida bebida) {
            this.bebidasB.add(bebida.deepClone());//Sacarlo clonado de algún lado, mandarlo de entrada completo
            return this;
        }
        public ComboBuilder setBebidas(Combo combo) {
            this.bebidasB=combo.bebidas;//Sacarlo clonado de algún lado, mandarlo de entrada completo
            return this;
        }
        public ComboBuilder setAdicionals(Combo combo) {
            this.adicionalesB=combo.getAdicionales();//Sacarlo clonado de algún lado, mandarlo de entrada completo
            return this;
        }

    }
}
