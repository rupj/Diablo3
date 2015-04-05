package net.rupj.diablo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class D3BNetHeroSkillBase {

	private String name;
	private String level;
	private String description;
	private String simpleDescription;
	private String skillCalcId;

	public String getDescription() {
		return description;
	}

	public String getSimpleDescription() {
		return simpleDescription;
	}

	public String getSkillCalcId() {
		return skillCalcId;
	}

	public String getName() {
		return name;
	}

	public String getLevel() {
		return level;
	}
}
