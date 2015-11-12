/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import clientes.InformacoesApartamentosClient;
import clientes.NegociacaoApartamentosClient;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import util.InformacoesApartamentos;
import util.NegociacoesApartamentos;

/**
 *
 * @author Leandro
 */
@ViewScoped
@ManagedBean(name = "negociacaoControle")
public class NegociacaoControle implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<NegociacoesApartamentos> listaNegApts;
    private List<InformacoesApartamentos> InfApts;

    @PostConstruct
    private void iniciar() {
        try {
            listaNegApts = retornaListNegociacoesApartamentos();
            InfApts = retornaListInformacoesApartamentos();
        } catch (Exception ex) {
            Logger.getLogger(NegociacaoControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<NegociacoesApartamentos> getListaNegApts() {
        return listaNegApts;
    }

    public void setListaNegApts(List<NegociacoesApartamentos> listaNegApts) {
        this.listaNegApts = listaNegApts;
    }

    public List<InformacoesApartamentos> getInfApts() {
        return InfApts;
    }

    public void setInfApts(List<InformacoesApartamentos> InfApts) {
        this.InfApts = InfApts;
    }

    private List<NegociacoesApartamentos> retornaListNegociacoesApartamentos() {
        NegociacaoApartamentosClient cliente = new NegociacaoApartamentosClient();
        return cliente.findNegociacoesApartamentosXml();
    }

    private List<InformacoesApartamentos> retornaListInformacoesApartamentos() {
        InformacoesApartamentosClient cliente = new InformacoesApartamentosClient();
        return cliente.findInformacoesApartamentosXml();
    }

}
