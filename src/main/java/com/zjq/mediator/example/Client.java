package com.zjq.mediator.example;

public class Client {
	
	
	
	public static void main(String[] args) {
		
		//1.创建一个中介者-------主板对象
		MotherMediator mediator = new MotherMediator();
		//2.创建同事类
		CPU cpu = new CPU(mediator);
		SoundCard soundCard = new SoundCard(mediator);
		VedioCard vedioCard = new VedioCard(mediator);
		CDDrivor cdDrivor = new CDDrivor(mediator);
		//3.让中介者知道所有的同事
		mediator.setCdDrivor(cdDrivor);
		mediator.setCpu(cpu);
		mediator.setSoundCard(soundCard);
		mediator.setVedioCard(vedioCard);
		//4.
		cdDrivor.readCD();
	}

}
