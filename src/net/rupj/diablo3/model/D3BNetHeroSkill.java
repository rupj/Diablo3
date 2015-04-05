package net.rupj.diablo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class D3BNetHeroSkill extends D3BNetHeroSkillBase {

    private String icon;

    public String getIcon() {
        return icon;
    }
}
