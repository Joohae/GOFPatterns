package kr.carrotbooks.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ObservableObserver implements Observer {
	private String _name;
	
	public ObservableObserver(String name) {
		this._name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof ObservableSubject){ 
			System.out.println(this._name + " has updated with " + ((ObservableSubject) o).getMessage() + "\n");
		}
	}

}
