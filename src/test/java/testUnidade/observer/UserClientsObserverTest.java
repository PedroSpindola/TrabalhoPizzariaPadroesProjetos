package testUnidade.observer;

import org.example.order.Order;
import org.example.order.OrderStatePendent;
import org.example.user.UserClients;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UserClientsObserverTest {
    @Test
    void deveNotificarUmCliente() {
        Order order = new Order();
        order.setOrderState(OrderStatePendent.getInstance()); // Adiciona o estado ao memento para o toString() funcionar

        UserClients client = new UserClients("Pedro");
        client.addOrder(order);

        order.avisarVaga();

        String mensagemEsperada = "Pedro, Situação atual é:O estado do seu pedido é " + order.getEstados();
        assertEquals(mensagemEsperada, client.getUltNotificacao());
    }

    @Test
    void deveNotificarClientes() {
        Order order = new Order();
        order.setOrderState(OrderStatePendent.getInstance());

        UserClients client1 = new UserClients("teste1");
        UserClients client2 = new UserClients("teste2");

        client1.addOrder(order);
        client2.addOrder(order);

        order.avisarVaga();

        assertEquals(client1.getNome()+", Situação atual é:O estado do seu pedido é " + order.getEstados(), client1.getUltNotificacao());
        assertEquals(client2.getNome()+", Situação atual é:O estado do seu pedido é " + order.getEstados(), client2.getUltNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Order order = new Order();
        UserClients client = new UserClients("teste3");

        order.avisarVaga();

        assertNull(client.getUltNotificacao());
    }

    @Test
    void deveNotificarApenasClienteInscritoNoPedidoA() {
        Order orderA = new Order();
        orderA.setOrderState(OrderStatePendent.getInstance());
        Order orderB = new Order();

        UserClients client1 = new UserClients("teste4");
        UserClients client2 = new UserClients("teste5");

        client1.addOrder(orderA);
        client2.addOrder(orderB);

        orderA.avisarVaga();

        assertEquals(client1.getNome()+", Situação atual é:O estado do seu pedido é " + orderA.getEstados(), client1.getUltNotificacao());
        assertNull(client2.getUltNotificacao());
    }
}
