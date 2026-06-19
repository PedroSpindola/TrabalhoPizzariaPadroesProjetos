package testUnidade.UserFlyweight;

import org.example.adress.AdressDB;
import org.example.adress.AdressFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserFlyweightTest
{
    @Test
    public void shouldReturnCorrectUsers()
    {
        AdressDB db = new AdressDB();
        db.cadastrarUser("Roger", "Juiz de fora", "JF");
        db.cadastrarUser("Marina", "Matias", "MT");
        db.cadastrarUser("Jonas", "Juiz de fora", "JF");

        List<String> saida = Arrays.asList(
                "User{nome='Roger', cidade='Juiz de fora', uf='JF'}",
                "User{nome='Marina', cidade='Matias', uf='MT'}",
                "User{nome='Jonas', cidade='Juiz de fora', uf='JF'}");

        assertEquals(saida,db.obterUsers());
    }

    @Test
    public void shouldReturnTheCorrectNumberOfAdresses(){
        AdressDB db = new AdressDB();
        db.cadastrarUser("Roger", "Juiz de fora", "JF");
        db.cadastrarUser("Marina", "Matias", "MT");
        db.cadastrarUser("Jonas", "Juiz de fora", "JF");

        assertEquals(2, AdressFactory.getTotalAdresses());
    }
}
