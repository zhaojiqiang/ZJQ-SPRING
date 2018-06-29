package com.zjq.mediator.example;
//cd驱动一个同事类
public class CDDrivor extends Colleague{

	public CDDrivor(Mediator mediator) {
		super(mediator);
	}
	
	//光驱读取的数据
	private String data = "";
	public String getData() {
		return data;
	}
	
	public void readCD() {//业务方法，也是和中介者交互的方法
		//逗号前是视频数据，后边是声音数据
		this.data = "设计模式,值得好好研究";
		this.getMediator().changes(this);
	}

	
}
