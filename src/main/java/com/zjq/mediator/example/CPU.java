package com.zjq.mediator.example;
//cpu一个同事类
public class CPU extends Colleague{

	public CPU(Mediator mediator) {
		super(mediator);
	}
	//分解出来的视频数据
	private String videoData = "";
	//分解出来的声音数据
	private String soundData = "";
	//获取分解出来的视频数据
	public String getVideoData() {
		return videoData;
	}
	//获取分解出来的声音数据
	public String getSoundData() {
		return soundData;
	}
	//处理数据，把数据分成音频，和视频数据
	public void excuteData(String data) {
		//前边是视频，后边是音频
		String[] ss = data.split(",");
		this.videoData = ss[0];
		this.soundData = ss[1];
		//通知主板，cpu的工作完成
		this.getMediator().changes(this);
	}
	

}
