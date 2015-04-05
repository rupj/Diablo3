package net.rupj.diablo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class D3BNetHeroSkillRune extends D3BNetHeroSkillBase {

    private Integer order;

    public Integer getOrder() {
        return order;
    }
}
