class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int current = numberToCheck;
		int numberDigits = String.valueOf(current).length();
		if (numberDigits == 1) return true;
		int sum = 0;
		while (current > 10) {
			sum += Math.pow(current % 10, numberDigits);
			current = current / 10;
		}
		sum += Math.pow(current, numberDigits);
		return sum == numberToCheck;
	}
}
