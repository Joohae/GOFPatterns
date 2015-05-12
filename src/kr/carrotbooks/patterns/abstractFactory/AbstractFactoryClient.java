package kr.carrotbooks.patterns.abstractFactory;

public class AbstractFactoryClient {
	IGOFAbstractFactory _factory = null;
	IGOFAbstractProduct _mold = null;
	
	public AbstractFactoryClient(IGOFAbstractFactory factory) {
		this._factory = factory;
		this._mold = this._factory.createRingMold();
	}
	
	public void produceItem(int count) {
		for (;count > 0; count--) {
			this._mold.produce();
		}
	}
}
