package kr.carrotbooks.patterns.abstractFactory;

public class FactorySilver implements IGOFAbstractFactory {

	@Override
	public IGOFAbstractProduct createRingMold() {
		return new RingSilver();
	}

}
