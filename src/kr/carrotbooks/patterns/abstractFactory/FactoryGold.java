package kr.carrotbooks.patterns.abstractFactory;

public class FactoryGold implements IGOFAbstractFactory {

	@Override
	public IGOFAbstractProduct createRingMold() {
		return new RingGolden();
	}

}
