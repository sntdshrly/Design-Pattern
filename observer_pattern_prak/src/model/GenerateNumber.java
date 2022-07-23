// Nama Program: Observer Pattern
// Nama/NRP: 2072025/Sherly Santiadi

package model;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class GenerateNumber implements Subject {

	private List<Observer> numberList;

	public GenerateNumber() {
		this.numberList = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		numberList.add(observer);
	}

	@Override
	public void sendNotifToObserver(int num) {
		for(Observer observer: numberList){
			observer.statusBerubah(num);
		}
	}

	public void generateRandomNumber(){
		sendNotifToObserver(((int) Math.floor((Math.random()))));
	}

}