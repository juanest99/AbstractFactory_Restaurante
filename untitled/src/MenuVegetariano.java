public class MenuVegetariano implements Menu {

    @Override
    public Entrada crearEntrada() {
        return new EntradaVegetariana();
    }
    @Override
    public Principal crearPlato() {
        return new PrincipalVegetariano();
    }
    @Override
    public Bebida crearBebida() {
        return new BebidaVegetariana();
    }
    @Override
    public Postre crearPostre() {
        return new PostreVegetariano();
    }


}
