package testUnidade.singleton;

import org.example.departament.TaxDepartament;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTaxDepartamentTest {
    @Test
    public void deveRetornarNomeDepartamento(){
        TaxDepartament.getInstance().setNome("teste1");
        assertEquals("teste1", TaxDepartament.getInstance().getNome());
    }
    @Test
    public void deveRetornarIdDepartamento(){
        TaxDepartament.getInstance().setId("Id1");
        assertEquals("Id1", TaxDepartament.getInstance().getId());
    }
}
