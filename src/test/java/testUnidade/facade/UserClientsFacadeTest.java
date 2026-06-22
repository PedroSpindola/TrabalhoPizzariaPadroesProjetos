package testUnidade.facade;

import org.example.departament.TaxDepartament;
import org.example.user.UserClients;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserClientsFacadeTest {
    @Test
    void deveRetornarPendenciaDepartamentoFiscal() {
        UserClients client = new UserClients("Teste1");

        TaxDepartament.getInstance().addUserPendente(client);

        assertFalse(client.verificarPendencias());
    }

    @Test
    void deveRetornarClienteSemPendencias() {

        UserClients client = new UserClients("Teste2");

        assertTrue(client.verificarPendencias());
    }
}
