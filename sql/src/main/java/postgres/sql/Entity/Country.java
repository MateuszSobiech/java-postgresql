package postgres.sql.Entity;

import com.sun.istack.NotNull;
import jdk.jfr.Name;

import javax.persistence.*;

@Entity
@Table(name = "countries", schema = "public")
public class Country {

    @Id
    @Name("country_id")
    private String countryId;

    @Name("country_name")
    private String countryName;

    @Name("region_id")
    @NotNull
    private Integer regionId;

    public Country() {
    }

    public Country(String country_id, String country_name, Integer region_id) {
        this.countryId = country_id;
        this.countryName = country_name;
        this.regionId = region_id;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
}
