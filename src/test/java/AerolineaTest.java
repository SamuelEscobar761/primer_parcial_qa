import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AerolineaTest{
    private Aerolinea aerolinea;

    @BeforeEach
    public void setUp(){
        aerolinea = new Aerolinea();
    }

    @Test
    public void reservaVuelo_PasajesDisponibles(){
        Aerolinea aerolineaMock = spy(aerolinea);
        doReturn(true).when(aerolineaMock).existePasajes(anyString(), anyInt());

        String resultado = aerolineaMock.reservaVuelo("La Paz", 2, 29, 2023, 5);

        assertEquals("El dia Lunes 2 de Enero del 2023 existen 2 pasajes para La Paz", resultado);
    }

    @Test
    public void reservaVuelo_PasajesNoDisponibles(){
        Aerolinea aerolineaMock = spy(aerolinea);
        doReturn(false).when(aerolineaMock).existePasajes(anyString(), anyInt());

        String resultado = aerolineaMock.reservaVuelo("La Paz", 2, 29, 2023, 5);

        asserEquals("No existen suficientes pasajes para La Paz", resultado);
    }
}