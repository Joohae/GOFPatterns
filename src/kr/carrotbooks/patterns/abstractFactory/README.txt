Abstract Factory Pattern
	- 기본적인 개념의 이해는 root의 README.txt를 읽어 볼 것
	- 물건을 생산하려고 할 때 공장을 지정해서 생산한다는 개념으로 접근
	   예제에서 사용한 개념은 다음과 같다.
	  	- 'Ring'을 생산하려고 한다.
	  	- 'Gold'를 사용하는 factory 가 있고, 'Silver'를 사용하는 factory가 있다.
	  	- 공장을 지정해둔다.
	  	- 생산 요청을 하면, 미리 지정해 둔 공장에 따라 다른 재질의 물건이 만들어진다. 

IGOFAbstractFactory	- 팩토리 인터페이스 (인터페이스가 없는 C++이라면 추상 클래스를 사용해야 겠지?)
	- FactoryGold
	- FactorySilver
IGOFAbstractProduct	- 프로덕트 인터페이스
	- RingGolden
	- RingSilver
AbstractFactoryClient - 동작을 수행할 클라이언트 클래스

Note. 각 클래스들에 대한 연계동작은 kr.carrotbooks.patterns.GOFAbstractFactoryTest를 참조