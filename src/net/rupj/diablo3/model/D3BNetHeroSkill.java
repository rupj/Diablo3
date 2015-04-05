package net.rupj.diablo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class D3BNetHeroSkill {
	
	private String name;
	private String level;
	
	public String getName() {
		return name;
	}
	public String getLevel() {
		return level;
	}
}
