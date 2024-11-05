package padroescomportamentais.templatemethod;

public abstract class Bebida {

    public final void prepararBebida() {
        ferverAgua();
        adicionarIngrediente();
        servir();
    }

    protected abstract void adicionarIngrediente();

    private void ferverAgua() {
        System.out.println("A água está fervendo...");
    }

    private void servir() {
        System.out.println("Servindo a bebida...");
    }

    public abstract String getTipo();
}
