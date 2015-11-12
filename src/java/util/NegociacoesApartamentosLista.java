/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Leandro
 */
@XmlRootElement(name = "NegociacoesApartamentosLista")
public class NegociacoesApartamentosLista implements Serializable {

    private static final long serialVersionUID = 1L;

    List<NegociacoesApartamentos> lista;

    public List<NegociacoesApartamentos> getLista() {
        return lista;
    }

    public void setLista(List<NegociacoesApartamentos> lista) {
        this.lista = lista;
    }

}
