public class MenuSaludable implements Menu {
    @Override

    public Entrada crearEntrada() {
        return new EntradaSaludable();
    }
    @Override

    public Principal crearPlato() {
        return new PrincipalSaludable();
    }
    @Override

    public Bebida crearBebida() {
        return new BebidaSaludable();
    }
    @Override

    public Postre crearPostre() {
        return new PostreSaludable();
    }
}
