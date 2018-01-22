package objekts;

import enums.LootType;

public class Weapon extends Loot {

	private int damageMin;
	private int damageMax;

	public Weapon() {
		super(LootType.WEAPON, (int) (Math.random() * 499) + 1);
		damageMin = (int) (Math.random() * 90);
		damageMax = (int) (Math.random() * 10) + damageMin;
	}

	public int getDamage() {
		int d = (int) (Math.random() * 100);
		while (d > damageMax || d < damageMin) {
			d = (int) (Math.random() * 100);
		}
		return d;
	}

	@Override
	public String toString() {
		return type.toString() + ", " + getValue() + " gold, " + damageMin + " points of min damage, " + damageMax
				+ " points of max damage.";
	}
}
