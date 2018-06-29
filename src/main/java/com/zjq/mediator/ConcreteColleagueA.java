package com.zjq.mediator;

public class ConcreteColleagueA extends Colleague{

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}
	
	public void someOperation() {
		getMediator().changes(this);
	}

}



