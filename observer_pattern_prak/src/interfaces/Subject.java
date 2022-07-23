// Nama Program: Observer Pattern
// Nama/NRP: 2072025/Sherly Santiadi

package interfaces;

public interface Subject {
	// ada 2 method
	void addObserver(Observer observer); // add nanti dia return int ke send notif
	void sendNotifToObserver(int num);
}