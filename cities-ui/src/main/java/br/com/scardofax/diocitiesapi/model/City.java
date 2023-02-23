package br.com.scardofax.diocitiesapi.model;

import br.com.scardofax.diocitiesapi.utils.PointType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

    @Id
    private Integer id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private State uf;

    private Integer ibge;

    // 1st
    @Column(name = "lat_lon")
    private String geolocation;

    // 2nd
    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;

    private Double latitude;
    private Double longitude;
    private Integer cod_tom;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public State getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public Point getLocation() {
        return location;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Integer getCod_tom() {
        return cod_tom;
    }
}
