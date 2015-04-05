package net.rupj.diablo3.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class D3BNetHeroSkills {
	
	private List<D3BNetHeroActiveSkill> active;
	private List<D3BNetHeroPassiveSkill> passive;

	public List<D3BNetHeroPassiveSkill> getPassive() {
		return passive;
	}

	public List<D3BNetHeroActiveSkill> getActive() {
		return active;
	}

}
