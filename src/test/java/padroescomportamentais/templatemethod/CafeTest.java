package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void devePrepararCafeCorretamente() {
        Bebida cafe = new Cafe();
        cafe.prepararBebida();
        assertEquals("Café", cafe.getTipo());
    }

    @Test
    void deveAdicionarIngredienteCafe() {
        assertDoesNotThrow(() -> {
            Cafe cafe = new Cafe();
            cafe.prepararBebida();
        });
    }

    @Test
    void deveRetornarTipoCafe() {
        Cafe cafe = new Cafe();
        assertEquals("Café", cafe.getTipo());
    }
}
