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
@XmlRootElement(name = "InformacoesApartamentosLista")
public class InformacoesApartamentosLista implements Serializable {

    private static final long serialVersionUID = 1L;

    List<InformacoesApartamentos> lista;

    public List<InformacoesApartamentos> getLista() {
        return lista;
    }

    public void setLista(List<InformacoesApartamentos> lista) {
        this.lista = lista;
    }

}
