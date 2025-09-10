public class MenuSaludable implements Menu {
    public Entrada crearEntrada() {
        return new EntradaSaludable();
    }
    public Principal crearPlato() {
        return new PrincipalSaludable();
    }
    public Bebida crearBebida() {
        return new BebidaSaludable();
    }
    public Postre crearPostre() {
        return new PostreSaludable();
    }
}
