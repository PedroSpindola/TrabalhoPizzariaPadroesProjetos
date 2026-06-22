package testUnidade.OrderStrategyTest;

import org.example.order.Order;
import org.example.user.UserClients;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderStrategyTest
{
    @Test
    public void shouldReturnPriorityDeliveryValue()
    {
        UserClients user = new UserClients();
        user.fecharPedidoEntregaPrioritaria(new Order());
        assertEquals(15, user.getValorTotalUltimaEntrega());
    }

    @Test
    public void shouldReturnDefaultDeliveryValue()
    {
        UserClients user = new UserClients();
        user.fecharPedidoEntregaPadrao(new Order());
        assertEquals(5, user.getValorTotalUltimaEntrega());
    }
}
