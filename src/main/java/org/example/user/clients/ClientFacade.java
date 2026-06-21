package org.example.user.clients;

import org.example.departament.TaxDepartament;

public class ClientFacade {
    public static boolean verificarPendencias(UserClients clients) {
        if (TaxDepartament.getInstance().verificarUserComPendencia(clients)) {
            return false;
        }

        return true;
    }
}
