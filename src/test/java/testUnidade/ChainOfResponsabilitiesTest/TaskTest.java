package testUnidade.ChainOfResponsabilitiesTest;

import org.example.tasks.AddPizzaMenuTask;
import org.example.tasks.Task;
import org.example.tasks.VerifyInvoiceTask;
import org.example.user.UserPizzaEmployer;
import org.example.user.UserTaxEmployer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest
{
    UserPizzaEmployer pizza;
    UserTaxEmployer tax;

    @BeforeEach
    public void setUp()
    {
        pizza = new UserPizzaEmployer(null);
        tax = new UserTaxEmployer(pizza);
    }

    @Test
    public void shouldReturnPizzaToAddPizza(){
        assertEquals("Pizza Employer", tax.executeTask(new Task(AddPizzaMenuTask.getTask())));
    }

    @Test
    public void shouldReturnTaxToVerifyEnvoice(){
        assertEquals("Tax Employer", tax.executeTask(new Task(VerifyInvoiceTask.getTask())));
    }
}
