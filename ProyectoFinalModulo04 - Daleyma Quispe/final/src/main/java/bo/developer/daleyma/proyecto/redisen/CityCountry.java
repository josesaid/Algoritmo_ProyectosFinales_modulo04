package bo.developer.daleyma.proyecto.redisen;

import bo.developer.daleyma.proyecto.modelo.Continent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Set;

public class CityCountry {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("district")
    private String district;

    @JsonProperty("population")
    private Integer population;

    @JsonProperty("countryCode")
    private String countryCode;

    @JsonProperty("alternativeCountryCode")
    private String alternativeCountryCode;

    @JsonProperty("countryName")
    private String countryName;

    @JsonProperty("continent")
    private Continent continent;

    @JsonProperty("countryRegion")
    private String countryRegion;

    @JsonProperty("countrySurfaceArea")
    private BigDecimal countrySurfaceArea;

    @JsonProperty("countryPopulation")
    private Integer countryPopulation;

    @JsonProperty("languages")
    private Set<Language> languages;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public void setAlternativeCountryCode(String alternativeCountryCode) {
        this.alternativeCountryCode = alternativeCountryCode;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

    public void setCountryPopulation(Integer countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public void setCountrySurfaceArea(BigDecimal countrySurfaceArea) {
        this.countrySurfaceArea = countrySurfaceArea;
    }

    public Integer getId() {
        return id;
    }

}
