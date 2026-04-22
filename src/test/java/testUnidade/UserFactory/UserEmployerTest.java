package testUnidade.UserFactory;

import org.example.user.Users;
import org.example.user.methodFactory.UserFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserEmployerTest
{
    @Test
    public void shouldReturnClientLoged()
    {
        Users user = UserFactory.getUser("Employers");
        assertEquals("Empregador logado", user.logar());
    }

    @Test
    public void shouldReturnClientLogout()
    {
        Users user = UserFactory.getUser("Employers");
        assertEquals("Empregador Saiu", user.sair());
    }

}
