package objekts;

import enums.GenericLoot;
import enums.LootType;

public class Loot {
	private String name;
	private int value = (int) (Math.random() * 25);

	public final LootType type;

	public Loot() {
		type = LootType.SIMPLE;
		name = GenericLoot.values()[(int) (Math.random() * 8)].toString();
	}

	public Loot(LootType t, int value) {
		type = t;
		this.value = value;
		this.name = t.toString();

	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		if (type == LootType.SIMPLE) {
			return type.toString() + ", " + value + " gold, " + name + ".";
		} else {
			return type.toString() + ", " + value + " gold.";
		}

	}

}
