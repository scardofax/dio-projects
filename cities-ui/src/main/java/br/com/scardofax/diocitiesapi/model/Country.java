package br.com.scardofax.diocitiesapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {

    @Id
    private Integer id;
    private String nome;
    private String nome_pt;
    private String sigla;
    private String bacen;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNome_pt() {
        return nome_pt;
    }

    public String getSigla() {
        return sigla;
    }

    public String getBacen() {
        return bacen;
    }
}
