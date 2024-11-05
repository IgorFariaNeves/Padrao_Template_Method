package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChaTest {

    @Test
    void devePrepararChaCorretamente() {
        Bebida cha = new Cha();
        cha.prepararBebida();
        assertEquals("Chá", cha.getTipo());
    }

    @Test
    void deveAdicionarIngredienteCha() {
        assertDoesNotThrow(() -> {
            Cha cha = new Cha();
            cha.prepararBebida();
        });
    }

    @Test
    void deveRetornarTipoCha() {
        Cha cha = new Cha();
        assertEquals("Chá", cha.getTipo());
    }
}
