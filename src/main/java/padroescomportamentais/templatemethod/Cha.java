package padroescomportamentais.templatemethod;

public class Cha extends Bebida {

    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando chá...");
    }

    @Override
    public String getTipo() {
        return "Chá";
    }
}
