package com.zjq.mediator;

public class ConcreteMediator implements Mediator{
	//持有并维护同事A
	private ConcreteColleagueA concreteColleagueA;
	//持有并维护同事B
	private ConcreteColleagueB concreteColleagueB;

	//设置中介者需要了解并维护的同事A对象
	public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
		this.concreteColleagueA = concreteColleagueA;
	}

	//设置中介者需要了解并维护的同事B对象
	public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
		this.concreteColleagueB = concreteColleagueB;
	}

	//
	@Override
	public void changes(Colleague colleague) {
		//某个同事类发生变化，通常需要与其他同事类交互
		//具体协调相应的同事对象来实现写作行为
	}

}
