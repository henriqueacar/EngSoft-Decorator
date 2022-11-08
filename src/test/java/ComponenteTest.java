import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComponenteTest {

    @Test
    void deveRetornarPlacaMae(){
        Componente componente = new PlacaMae();
        assertEquals("Placa Mãe com ", componente.getConfiguracaoComputador());
    }

    @Test
    void deveRetornarPlacaMaeAMD(){
        Componente componente = new CPU(new PlacaMae(),"AMD");
        assertEquals("Placa Mãe com AMD", componente.getConfiguracaoComputador());
    }

    @Test
    void deveRetornarPlacaMaeNvidia(){
        Componente componente = new GPU(new PlacaMae(),"Nvidia");
        assertEquals("Placa Mãe com Nvidia", componente.getConfiguracaoComputador());
    }

    @Test
    void deveRetornarPlacaMaeIntelRadeon(){
        Componente componente = new GPU(new CPU(new PlacaMae(), "AMD"), "Radeon");
        assertEquals("Placa Mãe com AMDRadeon", componente.getConfiguracaoComputador());
    }


    @Test
    void deveRetornarPlacaMaeIntelNvidia(){
        Componente componente = new GPU(new CPU(new PlacaMae(), "Intel"), "Nvidia");
        assertEquals("Placa Mãe com IntelNvidia", componente.getConfiguracaoComputador());
    }

}