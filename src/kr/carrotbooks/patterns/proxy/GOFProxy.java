package kr.carrotbooks.patterns.proxy;

public class GOFProxy implements IGOFProxySubject {
	private String _filePath;
	private GOFRealSubject _subject;
	
	public GOFProxy(String filepath) {
		this._filePath = filepath;
	}
	
	@Override
	public void displayImage() {
		if (this._subject == null) {
			this._subject = new GOFRealSubject(this._filePath);
		}
		this._subject.displayImage();
	}

}
