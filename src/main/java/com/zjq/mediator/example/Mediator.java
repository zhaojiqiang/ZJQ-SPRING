package com.zjq.mediator.example;

public interface Mediator {
	
	/**同事对象在自身改变的时候来通知中介者对象
	 * 让中介者去负责相应的与其他同事对象的交互
	 * colleague：同事对象的本身。好让中介者对象通过对象的实例来同事对象的状态
	 */
	public void changes(Colleague colleague);

}
