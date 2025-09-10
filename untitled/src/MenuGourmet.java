public class MenuGourmet implements Menu{
    public Entrada crearEntrada() {
        return new EntradaGourmet();
    }
    public Principal crearPlato() {
        return new PrincipalGourmet();
    }
    public Bebida crearBebida() {
        return new BebidaGourmet();
    }
    public Postre crearPostre() {
        return new PostreGourmet();
    }
}
