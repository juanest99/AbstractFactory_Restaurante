public class MenuGourmet implements Menu{
    @Override

    public Entrada crearEntrada() {
        return new EntradaGourmet();
    }
    @Override

    public Principal crearPlato() {
        return new PrincipalGourmet();
    }
    @Override

    public Bebida crearBebida() {
        return new BebidaGourmet();
    }
    @Override

    public Postre crearPostre() {
        return new PostreGourmet();
    }
}
