ref: http://copynull.tistory.com/140

Observer Pattern
	- 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 자동으로 전달된다.
	- 일대다(one-to-many) 의존성을 정의한다.
	- 신문 구독 서비스에 비유하면 쉽게 이해할 수 있다.
 
Subject: 관찰대상
	- 관찰자 목록을 관리한다
		- attach	: 관찰자를 추가한다
		- detach	: 관찰자를 제거한다
	- 상태가 변경되면 관찰자들에게 상태가 변했음을 통지해 준다.
		- broadcast (Note. 원래는 notify 겠지만, 자바에서는 그 이름이 다른 용도로 쓰임)
Observer: 관찰자
	- 관찰을 한다, 라기 보다는 신호가 올 때 까지 무한정 기다린다.
		- onUpdate 	: 신호를 받는 콜백
		
Note. Loose Coupling. 아주 일반적인 상식이다. 객체간의 결합도가 높아질 수록 수정,
	유지보수는 아주 힘든 작업이 된다. 그래서 MVC 패턴도 그렇지만 일단 객체간의
	결합도는 낮추는게 일반론이다. 느슨한 결합의 장점은 아래와 같다.
	- 옵저버를 언제든지 추가할 수 있다.
	- 새로운 형식의 옵저버를 추가하려고 할 때도 주제를 전혀 변경할 필요 없다.
	- 주제와 옵저버를 서로 독립적으로 재사용할 수 있다.
	- 주제나 옵저버가 바뀌더라도 서로에게 영향을 미치지 않는다.

IGOFSubject, GOFConcreteSubject, IGOFObserver, GOFConcreteObserver - 직접 구현한 Observer Pattern
ObservableSubject, ObservableObserver - Observable, Observer 를 사용해서 구현한 Observer Pattern
