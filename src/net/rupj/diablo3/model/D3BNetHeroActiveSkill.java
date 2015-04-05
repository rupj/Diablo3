package net.rupj.diablo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class D3BNetHeroActiveSkill {

	private D3BNetHeroSkill skill;
	private D3BNetHeroSkillRune rune;

	public D3BNetHeroSkill getSkill() {
		return skill;
	}
	public D3BNetHeroSkillRune getRune() {
		return rune;
	}

}
