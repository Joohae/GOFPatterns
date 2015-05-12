package kr.carrotbooks.patterns.observer;

public interface IGOFSubject {
	boolean attach(IGOFObserver o);
	boolean detach(IGOFObserver o);
	void broadcast() throws Exception;	//	컨셉상의 이름은 notify 이지만, 자바에선 다른 용도로 쓰지
}
