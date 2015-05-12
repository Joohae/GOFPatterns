http://en.wikipedia.org/wiki/Proxy_pattern
http://copynull.tistory.com/133

Proxy Pattern
	- 대리자에게 일을 맟기면 그 일을 처리하고 완료 결과를 알려주는 패턴
	- 웹의 프록시 처럼 캐싱을 위해 사용되기도 한다.
	- 프록시 패턴의 잘 알려진 예로는 참조 횟수 스마트 포인터가 있다.
	- 복합적인 객체들의 복사본이 여럿이 필요한 상황에서, 메모리 사용량을 줄이기 위해
	  플라이 웨이트 패턴과 결합된 형태로 나올 수 도 있다.
	
Subject
	- 프록시 처리를 할 대상
	
Real Subject
	- 실제 일 처리를 수행하는 객체

Proxy
	- 일 처리를 위임받는 객체
	- 내부에서 Real Subject를 이용한 처리를 수행한다.