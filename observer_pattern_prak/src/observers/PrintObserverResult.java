// Nama Program: Observer Pattern
// Nama/NRP: 2072025/Sherly Santiadi

package observers;

import interfaces.Observer;

public class PrintObserverResult implements Observer {

	@Override
	public void statusBerubah(int num) {
		System.out.println("Status berubah!");
	}
}