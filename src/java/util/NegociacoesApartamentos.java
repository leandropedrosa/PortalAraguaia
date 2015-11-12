/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Leandro
 */
@XmlRootElement(name = "negociacoesApartamentos")
@XmlType(name = "", propOrder = {"idNegociacao", "tipoNegociacao", "valorNegociacao", "quantidadeDeQuartos", "titularEmail", "titularNome", "telefoneNumero", "apartamentoNumero"})
public class NegociacoesApartamentos implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idNegociacao;

    private String tipoNegociacao;

    private Float valorNegociacao;

    private Integer quantidadeDeQuartos;

    private String titularEmail;

    private String titularNome;

    private String telefoneNumero;

    private String apartamentoNumero;

    @XmlElement(name = "idNegociacao")
    public Integer getIdNegociacao() {
        return idNegociacao;
    }

    @XmlElement(name = "tipoNegociacao", nillable = true)
    public String getTipoNegociacao() {
        return tipoNegociacao;
    }

    @XmlElement(name = "valorNegociacao", nillable = true)
    public Float getValorNegociacao() {
        return valorNegociacao;
    }

    @XmlElement(name = "quantidadeDeQuartos", nillable = true)
    public Integer getQuantidadeDeQuartos() {
        return quantidadeDeQuartos;
    }

    @XmlElement(name = "titularEmail", nillable = true)
    public String getTitularEmail() {
        return titularEmail;
    }

    @XmlElement(name = "titularNome", nillable = true)
    public String getTitularNome() {
        return titularNome;
    }

    @XmlElement(name = "telefoneNumero", nillable = true)
    public String getTelefoneNumero() {
        return telefoneNumero;
    }

    @XmlElement(name = "apartamentoNumero", nillable = true)
    public String getApartamentoNumero() {
        return apartamentoNumero;
    }

    public void setIdNegociacao(Integer idNegociacao) {
        this.idNegociacao = idNegociacao;
    }

    public void setTipoNegociacao(String tipoNegociacao) {
        this.tipoNegociacao = tipoNegociacao;
    }

    public void setValorNegociacao(Float valorNegociacao) {
        this.valorNegociacao = valorNegociacao;
    }

    public void setQuantidadeDeQuartos(Integer quantidadeDeQuartos) {
        this.quantidadeDeQuartos = quantidadeDeQuartos;
    }

    public void setTitularEmail(String titularEmail) {
        this.titularEmail = titularEmail;
    }

    public void setTitularNome(String titularNome) {
        this.titularNome = titularNome;
    }

    public void setTelefoneNumero(String telefoneNumero) {
        this.telefoneNumero = telefoneNumero;
    }

    public void setApartamentoNumero(String apartamentoNumero) {
        this.apartamentoNumero = apartamentoNumero;
    }

}
