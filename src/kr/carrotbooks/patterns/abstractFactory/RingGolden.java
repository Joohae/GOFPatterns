package kr.carrotbooks.patterns.abstractFactory;

public class RingGolden implements IGOFAbstractProduct {

	@Override
	public void produce() {
		System.out.println("A shiny yellow goden ring.");
	}

}
