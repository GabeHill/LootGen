package objekts;

import enums.LootType;

public class Potion extends Loot {
	private int heal;

	public Potion() {
		super(LootType.POTION, (int) (Math.random() * 90) + 10);
		heal = (int) (Math.random() * 90) + 10;
	}

	public int healAmt() {
		return heal;
	}

	@Override
	public String toString() {
		return type.toString() + ", " + getValue() + " gold, " + healAmt() + " points of restoration.";
	}

}
