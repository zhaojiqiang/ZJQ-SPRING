package com.zjq.mediator.example;
//显卡，一个同事类
public class VedioCard extends Colleague{

	public VedioCard(Mediator mediator) {
		super(mediator);
	}
	
	public void showData(String data) {
		System.out.println("您正在观看的是：" + data);
	}

}
