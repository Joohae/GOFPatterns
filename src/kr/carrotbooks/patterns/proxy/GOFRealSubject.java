package kr.carrotbooks.patterns.proxy;

public class GOFRealSubject implements IGOFProxySubject {
	private String _imagePath;

	GOFRealSubject(String imagePath) {
		this._imagePath = imagePath;
		this.loadingImage();
	}
	
	private void loadingImage() {
		System.out.println("Loading image: " + this._imagePath);
	}

	@Override
	public void displayImage() {
		System.out.println("Display image: " + this._imagePath);
	}

}
