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
import util.NegociacoesApartamentos;

/**
 * Jersey REST client generated for REST
 * resource:NegociacoesApartamentosFacadeREST [util.NegociacoesApartamentos]<br>
 * USAGE:
 * <pre>
 *        NegociacaoApartamentosClient client = new NegociacaoApartamentosClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Leandro
 */
public class NegociacaoApartamentosClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://www.portalaraguaia.com.br/AraguaiaAdminWeb-1.0/webresources";
    private GenericType<List<NegociacoesApartamentos>> type = new GenericType<List<NegociacoesApartamentos>>() {
    };

    public NegociacaoApartamentosClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("util.NegociacoesApartamentos");
    }

    public List<NegociacoesApartamentos> findNegociacoesApartamentosJson() throws ClientErrorException {
        List<NegociacoesApartamentos> lista = webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(type);
        close();
        return lista;
    }

    public List<NegociacoesApartamentos> findNegociacoesApartamentosXml() throws ClientErrorException {
        List<NegociacoesApartamentos> lista = webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(type);
        close();
        return lista;
    }

    private void close() {
        client.close();
    }

}
