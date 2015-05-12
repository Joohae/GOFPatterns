package kr.carrotbooks.patterns.observer;

public class GOFConcreteObjerver implements IGOFObserver {
	private String _name;

	public GOFConcreteObjerver(String name) {
		this._name = name;
	}
	
	@Override
	public boolean onUpdate() {
		System.out.println(this._name + " has updated\n");
		return true;
	}

}
