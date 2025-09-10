public class MenuVegetariano implements Menu {
    public Entrada crearEntrada() {
        return new EntradaVegetariana();
    }
    public Principal crearPlato() {
        return new PrincipalVegetariano();
    }
    public Bebida crearBebida() {
        return new BebidaVegetariana();
    }
    public Postre crearPostre() {
        return new PostreVegetariano();
    }


}
