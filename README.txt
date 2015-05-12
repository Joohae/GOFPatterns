Abstract Factory Pattern
	References:
		http://en.wikipedia.org/wiki/Abstract_factory_pattern
		http://donxu.tistory.com/89 (영문 위키 번역)
		http://copynull.tistory.com/130

	- 객체의 구현을 인터페이스로 부터 분리하기 위함, 
	   즉, 사용하는 방법은 통일 하되 그 반응을 다른 형태로 하려는 경우에 사용된다.
	   예로, 버튼은 '클릭한다' 라는 동작을 인터페이스로 하지만 체크 버튼의 경우에는 현재 체크 상태가
	   변경되고, 라디오 버튼의 경우에는 동일 그룹내의 다른 버튼의 선택이 제거된다.
	   또 다른 예로는, UI의 테마가 있다. 테마를 변경하면, 동작은 동일하지만 그 디자인이나 반응 방식이
	   변경된다.
	- 만들어지는 '종류' 가 변경 되는 것이므로 대상이 되는 '종류'들을 섞어서 생성하는 것은 기본 디자인
	   패턴에는 맞지 않다. 

Builder Pattern
	References:
		http://en.wikipedia.org/wiki/Builder_pattern
		http://donxu.tistory.com/90 (영문 위키 번역)
		http://copynull.tistory.com/131
		
	- 객체의 생성이 복잡한 경우, 생성 루틴을 객체로 부터 분리해 내는 패턴
	- 분리된 생성 루틴은 같은 구조를 갖는 다른 객체를 생성하는 데에도 사용될 수 있다.

Factory Method Pattern
	References:
		http://en.wikipedia.org/wiki/Factory_method_pattern
		http://donxu.tistory.com/88 (영문 위키 번역)
		http://copynull.tistory.com/129

	- 실제 생성에 사용되는 클래스를 지정하지 않고도 객체를 생성하도록 한다. 
	- 툴킷과 프레임워크 에서 일반적으로 사용됨
	- 객체를 사용하는 데에는 궂이 필요하지 않은 공통된 생성 코드나 다른 객체와의 연결에 필요한 코드가
	   중복되지 않을 수 있도록 한다.
	-   

		