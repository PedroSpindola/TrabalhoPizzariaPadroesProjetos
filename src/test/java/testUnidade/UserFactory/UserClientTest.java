package testUnidade.UserFactory;

import org.example.user.Users;
import org.example.user.methodFactory.UserFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserClientTest
{
    @Test
    public void shouldReturnClientLoged()
    {
        Users user = UserFactory.getUser("Clients");
        assertEquals("Cliente logado", user.logar());
    }

    @Test
    public void shouldReturnClientLogout()
    {
        Users user = UserFactory.getUser("Clients");
        assertEquals("Cliente Saiu", user.sair());
    }
}
