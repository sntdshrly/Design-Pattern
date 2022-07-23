// Nama Program: Observer Pattern
// Nama/NRP: 2072025/Sherly Santiadi

import model.GenerateNumber;
import observers.PrintObserverResult;

public class Main {

	public static void main(String[] args) {
		// generate number buat trigger ke observer
		GenerateNumber numberGenerator = new GenerateNumber();
		callObserver(numberGenerator);
		numberGenerator.generateRandomNumber();
	}

	// panggil observer
	private static void callObserver(GenerateNumber numberGenerator) {
		// kita lihat hasil observer, kalau ada trigger, maka akan print status berubah
		PrintObserverResult printstatus = new PrintObserverResult();
		numberGenerator.addObserver(printstatus);
	}

}