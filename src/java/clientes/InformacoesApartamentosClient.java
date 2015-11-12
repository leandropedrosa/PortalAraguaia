/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.util.List;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import util.InformacoesApartamentos;

/**
 * Jersey REST client generated for REST
 * resource:InformacoesApartamentosFacadeREST [util.InformacoesApartamentos]<br>
 * USAGE:
 * <pre>
 *        InformacoesApartamentosClient client = new InformacoesApartamentosClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Leandro
 */
public class InformacoesApartamentosClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://www.portalaraguaia.com.br/AraguaiaAdminWeb-1.0/webresources";
    private GenericType<List<InformacoesApartamentos>> type = new GenericType<List<InformacoesApartamentos>>() {
    };

    public InformacoesApartamentosClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("util.InformacoesApartamentos");
    }

    public List<InformacoesApartamentos> findInformacoesApartamentosJson() throws ClientErrorException {
        List<InformacoesApartamentos> lista = webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(type);
        close();
        return lista;
    }

    public List<InformacoesApartamentos> findInformacoesApartamentosXml() throws ClientErrorException {
        List<InformacoesApartamentos> lista = webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(type);
        close();
        return lista;
    }

    private void close() {
        client.close();
    }
}
