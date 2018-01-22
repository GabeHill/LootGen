package day01;

import enums.Gender;
import lib.ConsoleIO;
import objekts.PrayingMantis;

public class F {
	private static PrayingMantis generateMantis(boolean def) {
		if (def) {
			return new PrayingMantis();
		} else {
			String name = "";
			for (int i = 0; i < 5; i++) {
				name += (char) (Math.random() * 93) + 34;
			}

			return new PrayingMantis(name, Gender.values()[(int) (Math.random() * 2)], (int) (Math.random() * 12),
					Math.round((Math.random() * 15) * 100) / 100);

		}
	}

	public static void run() {
		boolean run = true;
		boolean firstRun = true;
		do {
			if (firstRun) {
				System.out.println(generateMantis(false));
				firstRun = false;
			}

			int select = ConsoleIO
					.promptForMenuSelection(new String[] { "Create random mantis", "Create default mantis" }, true);
			if (select == 1) {
				System.out.println(generateMantis(false));
			} else if (select == 2) {
				System.out.println(generateMantis(true));
			} else {
				run = false;
			}

		} while (run);
	}

}
