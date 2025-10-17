package bo.developer.daleyma.proyecto.redisen;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Language {

    @JsonProperty("language")
    private String language;

    @JsonProperty("isOfficial")
    private Boolean isOfficial;

    @JsonProperty("percentage")
    private BigDecimal percentage;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public void setIsOfficial(Boolean official) {
        isOfficial = official;
    }
}
