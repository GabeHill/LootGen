package objekts;

import enums.Gender;

public class PrayingMantis {

	public final Gender gen;

	private String name = "Mantis";
	private int ageInMonths = 1;
	private double lengthInCentimeters = 38d;

	public PrayingMantis() {
		gen = Gender.OTHER;
	}

	public PrayingMantis(String name, Gender gen, int age, double length) {
		setName(name);
		this.gen = gen;
		setAgeInMonths(age);
		setLengthInCentimeters(length);
	}

	public int getAgeInMonths() {
		return ageInMonths;
	}

	public double getLengthInCentimeters() {
		return lengthInCentimeters;
	}

	public String getName() {
		return name;
	}

	public void setAgeInMonths(int ageInMonths) {
		if (ageInMonths > -1 && ageInMonths < 13) {
			this.ageInMonths = ageInMonths;
		}
	}

	public void setLengthInCentimeters(double lengthInCentimeters) {
		if (lengthInCentimeters > 0) {
			this.lengthInCentimeters = lengthInCentimeters;
		}
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	@Override
	public String toString() {
		return name + ", " + gen + ", " + ageInMonths + " months old, " + lengthInCentimeters + " centimeters long.";
	}

}
