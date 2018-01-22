package objekts;

import enums.LootType;

public class Armor extends Loot {
	private int defense;
	private int rating;
	private int agilityMod;

	public Armor() {
		super(LootType.ARMOR, (int) (Math.random() * 1490) + 10);
		agilityMod = (int) (Math.random() * -6);
		defense = (int) (Math.random() * 10);
		rating = (int) (Math.random() * 8) + 9;
	}

	public int getAgilityMod() {
		return agilityMod;
	}

	public int getDefense() {
		return defense;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return type.toString() + ", " + getValue() + " gold, " + getDefense() + " points of damage reduction, "
				+ getRating() + " points blocked, " + agilityMod + " points off agility.";
	}
}
