package com.zjq.mediator.example;

public class MotherMediator implements Mediator{
	
	//需要知道交互的同事类--光驱类
	private CDDrivor cdDrivor = null;
	//需要知道交互的同事类--CPU类
	private CPU cpu = null;
	//需要知道交互的同事类--显卡类
	private VedioCard vedioCard = null;
	//需要知道交互的同事类--声卡类
	private SoundCard soundCard = null;

	
	public void setCdDrivor(CDDrivor cdDrivor) {
		this.cdDrivor = cdDrivor;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setVedioCard(VedioCard vedioCard) {
		this.vedioCard = vedioCard;
	}
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
	@Override
	public void changes(Colleague colleague) {
		if(colleague == cdDrivor) {
			//表示光驱读取数据了
			this.opeCDDriverReadData((CDDrivor) colleague);
		}else if(colleague == cpu) {
			//表示CPU处理完了
			this.opeCPU((CPU) colleague);
		}
	}
	/**
	 * 处理光驱读取数据之后，与其他同事对象交互
	 * @param cd 光驱同事对象
	 */
	private void opeCDDriverReadData(CDDrivor cd) {
		//1.先获取光驱读取的数据
		String data = cd.getData();
		//2.交给cpu处理
		this.cpu.excuteData(data);
	}
	/**
	 * 处理cpu处理完的数据后与其他对象交互
	 * @param cpu cpu同事类
	 */
	private void opeCPU(CPU cpu) {
		//1.先获取cpu处理后的数据
		String soundData = cpu.getSoundData();
		String videoData = cpu.getVideoData();
		//2.将这些数据交给声卡和显卡
		this.soundCard.soundData(soundData);
		this.vedioCard.showData(videoData);
	}

}
