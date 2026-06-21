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
        Users user = UserFactory.getUser("PizzaEmployer");
        assertEquals("Empregado Pizza logado", user.logar());
    }

    @Test
    public void shouldReturnClientLogout()
    {
        Users user = UserFactory.getUser("PizzaEmployer");
        assertEquals("Empregador Pizza Saiu", user.sair());
    }

}
