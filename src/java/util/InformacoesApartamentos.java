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
@XmlRootElement(name = "informacoesApartamentos")
@XmlType(name = "", propOrder = {"tipo", "contador"})
public class InformacoesApartamentos implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tipo;

    private Integer contador;

    @XmlElement(name = "tipo", nillable = true)
    public String getTipo() {
        return tipo;
    }

    @XmlElement(name = "contador", nillable = true)
    public Integer getContador() {
        return contador;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

}
