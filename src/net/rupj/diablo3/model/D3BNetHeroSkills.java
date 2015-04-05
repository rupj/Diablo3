package net.rupj.diablo3.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class D3BNetHeroSkills {
	
	private List<D3BNetHeroActiveSkill> active;
	// private List<T> passive;

	public List<D3BNetHeroActiveSkill> getActive() {
		return active;
	}

}
