package net.rupj.diablo3.service;

import net.rupj.diablo3.model.D3BNetHero;
import net.rupj.diablo3.model.D3BNetProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class D3BNetServiceV2 {
	
	public D3BNetServiceV2() {
		System.out.println("Creating bean D3BNetServiceV2");
	}

	public D3BNetProfile retrieveProfileById(String profileId) {
		String urlString = String.format(
				"http://us.battle.net/api/d3/profile/%s/", 
				profileId);
		
		D3BNetProfile profile = restTemplate.getForObject(urlString, D3BNetProfile.class);
		return profile;
	}
	
	public D3BNetHero retrieveHeroById(String profileId, Integer heroId) {
		String urlString = String.format(
				"http://us.battle.net/api/d3/profile/%s/hero/%d", 
				profileId, 
				heroId);
		
        D3BNetHero hero = restTemplate.getForObject(urlString, D3BNetHero.class);
        return hero;
	}
	
	@Autowired
	private RestTemplate restTemplate;
}
