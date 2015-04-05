package net.rupj.diablo3.model;

public class D3BNetHero extends D3BNetHeroBase {
	
	private D3BNetHeroSkills skills;
	
	public D3BNetHeroSkills getSkills() {
		return skills;
	}
	
	@Override
	public String toString() {
		String s = super.toString() + "\n\tskills / runes: ";
		
		int i = 0;
		for(D3BNetHeroActiveSkill activeSkill : skills.getActive()) {
			D3BNetHeroSkill skill = activeSkill.getSkill();
			D3BNetHeroSkill rune = activeSkill.getRune();
			s += "\n\t\t" + i + ".) ";
			if (skill != null) {
				 s += skill.getName() + " / ";
				 if (rune != null) {
					 s += rune.getName();
				 }
			}
			++i;
		}
		
		return s;
	}
}
