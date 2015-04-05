package net.rupj.diablo3;

import java.util.List;

import net.rupj.diablo3.model.D3BNetHero;
import net.rupj.diablo3.model.D3BNetHeroBase;
import net.rupj.diablo3.service.D3BNetServiceV2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component 
public class Diablo3Runner {
	
	public Diablo3Runner() {
		System.out.println("Creating bean Diablo3Runner");
	}
	
	public void run2() {
		String profileId = "rupj-1941";
		
		List<D3BNetHeroBase> heroes = d3BNetServiceV2.retrieveProfileById(profileId).getHeroes();
		for(D3BNetHeroBase baseHero : heroes) {
			 D3BNetHero hero = d3BNetServiceV2.retrieveHeroById(profileId, baseHero.getId());
			System.out.println(hero.toString());
		}
		System.out.println("end");
		
		//System.out.println(d3BNetServiceV2.retrieveHeroById(profileId, heroId).toString());
	}
	
	@Autowired
	private D3BNetServiceV2 d3BNetServiceV2;
}
