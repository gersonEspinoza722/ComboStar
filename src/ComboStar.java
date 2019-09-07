public class ComboStar {


        private static ComboListImp combos = new ComboListImp("Combos predefinidos");
        private static ElementoListImp bebidas = new ElementoListImp("Bebidas");
        private static ElementoListImp adicionales = new ElementoListImp("Adicionales");
        private static ElementoListImp principales = new ElementoListImp("Principales");

    public static Combo.ComboBuilder getBuilder() {
        return builder;
    }

    private static Combo.ComboBuilder builder=new Combo.ComboBuilder();

    public static ComboListImp getCombos() {
        return combos;
    }

    public static ElementoListImp getBebidas() {
        return bebidas;
    }

    public static ElementoListImp getAdicionales() {
        return adicionales;
    }

    public static ElementoListImp getPrincipales() {
        return principales;
    }

    public ComboStar() {
        Bebida bebida1 = new Bebida(0, 800, "Gaseosa");
        Bebida bebida2 = new Bebida(1, 1000, "Cafe");
        Bebida bebida3 = new Bebida(2, 800, "Te");
        Bebida bebida4 = new Bebida(3, 1500, "Natural");
        Bebida bebida5 = new Bebida(4, 2000, "Frozen");
        Bebida bebida6 = new Bebida(0, 2500, "Batida");

        Adicional adicional1 = new Adicional(0, 800, "Papas");
        Adicional adicional2 = new Adicional(1, 1000, "Uvas");
        Adicional adicional3 = new Adicional(2, 1200, "Papatas");
        Adicional adicional4 = new Adicional(3, 1000, "Maiz");
        Adicional adicional5 = new Adicional(4, 2500, "Tres Leches");
        Adicional adicional6 = new Adicional(5, 1500, "Ensalada");
        Adicional adicional7 = new Adicional(7, 1500, "Puré");

        Principal principal1 = new Principal(0, 2000, "Hamburguesa");
        Principal principal2 = new Principal(1, 1500, "Sandwich");
        Principal principal3 = new Principal(2, 2500, "Pollo");
        Principal principal4 = new Principal(3, 2000, "Wrap");
        Principal principal5 = new Principal(4, 3000, "Pizza");
        Principal principal6 = new Principal(5, 1500, "Hot Dog");

        Combo combo1 = new Combo.ComboBuilder().setPrincipal(principal1.deepClone())
                .addBebida(bebida1.deepClone())
                .addAdicional(adicional1.deepClone()).build();
        Combo combo2 = new Combo.ComboBuilder().setPrincipal(principal6.deepClone())
                .addBebida(bebida1.deepClone())
                .addAdicional(adicional7.deepClone()).build();
        Combo combo3 = new Combo.ComboBuilder().setPrincipal(principal5.deepClone())
                .addBebida(bebida1.deepClone()).build();
        Combo combo4 = new Combo.ComboBuilder().setPrincipal(principal5.deepClone())
                .addBebida(bebida1.deepClone())
                .addAdicional(adicional6.deepClone())
                .addAdicional(adicional5.deepClone()).build();
        combos.addCombo(combo1);
        combos.addCombo(combo2);
        combos.addCombo(combo3);
        combos.addCombo(combo4);

        bebidas.addElemento(bebida1);
        bebidas.addElemento(bebida2);
        bebidas.addElemento(bebida3);
        bebidas.addElemento(bebida4);
        bebidas.addElemento(bebida5);
        bebidas.addElemento(bebida6);

        adicionales.addElemento(adicional1);
        adicionales.addElemento(adicional2);
        adicionales.addElemento(adicional3);
        adicionales.addElemento(adicional4);
        adicionales.addElemento(adicional5);
        adicionales.addElemento(adicional6);
        adicionales.addElemento(adicional7);

        principales.addElemento(principal1);
        principales.addElemento(principal2);
        principales.addElemento(principal3);
        principales.addElemento(principal4);
        principales.addElemento(principal5);
        principales.addElemento(principal6);

    }



}
