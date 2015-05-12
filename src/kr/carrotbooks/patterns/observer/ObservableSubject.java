package kr.carrotbooks.patterns.observer;

import java.util.Observable;

public class ObservableSubject extends Observable {
	public void broadcast() {
		this.setChanged();		// 상태가 바뀌었음을 표시
		this.notifyObservers();
	}
	
	public String getMessage() {
		return "This message will be taken by observer";
	}
}
