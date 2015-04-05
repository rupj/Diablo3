package net.rupj.diablo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class D3BNetHeroPassiveSkill {
    private D3BNetHeroSkill skill;

    public D3BNetHeroSkill getSkill() {
        return skill;
    }
}
