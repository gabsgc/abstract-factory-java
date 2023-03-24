import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveComprarCamaModerna() {
        FabricaAbstrata fabrica = new FabricaModerna();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Cama moderna.", cliente.comprarCama());
    }

    @Test
    void deveComprarCamaClassica() {
        FabricaAbstrata fabrica = new FabricaClassica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Cama clássica.", cliente.comprarCama());
    }

    @Test
    void deveComprarGuardaRoupaClassico() {
        FabricaAbstrata fabrica = new FabricaClassica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Guarda-Roupa clássico.", cliente.comprarGuardaRoupa());
    }

    @Test
    void deveComprarGuardaRoupaModerno() {
        FabricaAbstrata fabrica = new FabricaModerna();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Guarda-Roupa moderno.", cliente.comprarGuardaRoupa());
    }
}