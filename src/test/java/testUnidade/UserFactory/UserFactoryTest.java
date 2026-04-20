package testUnidade.UserFactory;

import org.example.user.UserClients;
import org.example.user.Users;
import org.example.user.methodFactory.UserFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class UserFactoryTest
{
    UserFactory userFactory;

    @BeforeEach
    void setup()
    {
        userFactory = new UserFactory();
    }


    @Test
    public void shouldReturnInexistentUser()
    {
        try{
            Users user = userFactory.getUser("");
            fail();
        }catch (Exception e){
            assertEquals("Usuario inexistente", e.getMessage());
        }
    }

    @Test
    public void shouldReturnInvalidUser()
    {
        try{
            Users user = userFactory.getUser("Owner");
            fail();
        }catch (Exception e){
            assertEquals("Usuario inválido", e.getMessage());
        }
    }
}
