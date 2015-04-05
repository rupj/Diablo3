package net.rupj.diablo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class D3BNetHeroBase {

	private Integer id;
	private String name;
	@JsonProperty("class")
	private String klass;
	private Integer level;
	private Integer paragonLevel;
	private Boolean hardcore;
	private Boolean dead;
	private Integer gender;
	private Boolean seasonal;
	@JsonProperty("last-updated")
	private Integer lastUpdated;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getKlass() {
		return klass;
	}
	
	public Integer getLevel() {
		return level;
	}

	public Integer getParagonLevel() {
		return paragonLevel;
	}

	public Boolean getHardcore() {
		return hardcore;
	}
	
	public Boolean getDead() {
		return dead;
	}
	
	public Integer getGender() {
		return gender;
	}
	
	public Boolean getSeasonal() {
		return seasonal;
	}
	
	public Integer getLastUpdated() {
		return lastUpdated;
	}
	
	@Override
	public String toString() {

		return "Hero:" +
	     "\n\tid: " + this.id +
	     "\n\tname: " + this.name +
	     "\n\tclass: " + this.klass +
	     "\n\tlevel: " + this.level +
	     "\n\tparagonLevel: " + this.paragonLevel +
	     "\n\thardcore: " + this.hardcore +
	     "\n\tdead: " + this.dead +
	     "\n\tgender: " + this.gender +
	     "\n\tseasonal: " + this.seasonal +
	     "\n\tlastUpdated: " + this.lastUpdated
	     ;
	}
}
