package loot;

import java.util.ArrayList;

import enums.LootType;
import lib.ConsoleIO;
import objekts.Armor;
import objekts.Loot;
import objekts.Potion;
import objekts.Weapon;

public class LootGen {

	private static ArrayList<Loot> loots = new ArrayList<>();

	private static Loot genLootItem(LootType t) {
		switch (t) {
		case SIMPLE:
			return new Loot();

		case ARMOR:
			return new Armor();

		case POTION:
			return new Potion();

		case WEAPON:
			return new Weapon();

		default:
			return null;
		}

	}

	private static LootType genType() {
		return LootType.values()[(int) (Math.random() * 4)];
	}

	public static void run() {
		int selection;
		boolean quit = false;
		do {

			selection = ConsoleIO.promptForMenuSelection(
					new String[] { "Generate one loot", "Generate some loots", "Generate n loots" }, true);
			switch (selection) {
			case 1:
				loots.add(genLootItem(genType()));
				break;
			case 2:
				int r = (int) (Math.random() * 10);
				for (int i = 0; i < r; i++) {
					loots.add(genLootItem(genType()));
				}
				break;
			case 3:
				int n = ConsoleIO.promptForInt("How many loots to generate?", 1, Integer.MAX_VALUE);

				for (int i = 0; i < n; i++) {
					loots.add(genLootItem(genType()));
				}
				break;
			default:
				quit = true;
				break;
			}

			for (Loot loot : loots) {
				System.out.println(loot);
			}
			loots.removeAll(loots);

		} while (!quit);
	}

}
