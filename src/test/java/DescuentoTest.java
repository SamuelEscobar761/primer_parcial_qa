import static org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParametrizedTest;
import org.junit.jupiter.params.provider.CSVSource;

public class DescuentoTest {
    @ParameterizedTest
    @CsvSource({
            "1500, 1500",
            "2200, 2090",
            "4000, 3400"
    })
    public void testCalcularDescuentos(int salario, int descuentoEsperado){
        Descuentos descuentos = new Descuentos();
        int descuentoCalculado = descuentos.calcularDescuento();
        Assertions.assertEquals(descuentoEsperado, descuentoCalculado, "Error, el salario calculado con el descuento es incorrecto!");
    }

    @Test
    public void testSalarioNoValido(){
        int salarioInvalido = -1000;
        Descuentos descuentos = new Descuentos();
        assertThrows(IllegalArgumentException.class, () -> {
            descuentos.calcularDescuentos(salarioInvalido);
        });
    }
}