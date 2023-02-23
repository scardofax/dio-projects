package br.com.scardofax.diocitiesapi.model;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import javax.persistence.*;
import java.util.List;

@TypeDef(
        name = "json", typeClass = JsonType.class
)
@Entity
@Table(name = "estado")
public class State {

    @Id
    private Integer id;
    private String nome;
    private String uf;
    private Integer ibge;

    @ManyToOne
    @JoinColumn(name = "pais",referencedColumnName = "id")
    private Country country;

    @Type(type = "json")
    @Column(name = "ddd", columnDefinition = "json")
    private List<Integer> ddd;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public Country getCountry() {
        return country;
    }

    public List<Integer> getDdd() {
        return ddd;
    }
}
