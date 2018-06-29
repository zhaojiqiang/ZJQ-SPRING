package com.zjq.mediator.example;
/**
 * 同事类抽象父类
 * @author zjq
 *
 */
public abstract class Colleague {
	
	private Mediator mediator;//持有中介着对象，每个同事类都需要知道他的中介者对象

	//构造方法，传入中介者对象
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;//获取当前同事类的终结者对象
	}
}
