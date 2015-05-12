package kr.carrotbooks.patterns.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class GOFConcreateSubject implements IGOFSubject {

	private ArrayList<IGOFObserver> _observers;

	public GOFConcreateSubject () {
		this._observers = new ArrayList<IGOFObserver>();
	}
	
	/*
	 * IGOFSubject Implementation Section
	 */
	@Override
	public boolean attach(IGOFObserver o) {
		return this._observers.add(o);
	}

	@Override
	public boolean detach(IGOFObserver o) {
		return this._observers.remove(o);
	}

	@Override
	public void broadcast() throws Exception {
		Iterator<IGOFObserver> observers = this._observers.iterator();
		while(observers.hasNext()) {
			IGOFObserver o = observers.next();
			o.onUpdate();
		}
	}

}
