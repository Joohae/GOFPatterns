package kr.carrotbooks.patterns.abstractFactory;

public class RingSilver implements IGOFAbstractProduct {

	@Override
	public void produce() {
		System.out.println("A shiny white silver ring.");
	}

}
