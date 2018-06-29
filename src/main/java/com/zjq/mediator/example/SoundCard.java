package com.zjq.mediator.example;
//声卡类，一个同事类
public class SoundCard extends Colleague{

	public SoundCard(Mediator mediator) {
		super(mediator);
	}
	
	public void soundData(String data) {
		System.out.println("您正在收听的是：" + data);
	}

}
