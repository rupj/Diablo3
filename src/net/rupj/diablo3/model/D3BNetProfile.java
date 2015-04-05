package net.rupj.diablo3.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class D3BNetProfile {
	
	private List<D3BNetHeroBase> heroes;

	public List<D3BNetHeroBase> getHeroes() {
		return heroes;
	}

}
