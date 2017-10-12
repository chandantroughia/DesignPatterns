package Adapter;

public class PlayVlc implements AdvanceMP{

	public void playVlc(String filename){
		System.out.println("Playing : " + filename);
	}
	
	public void playMp4(String filename){
		//Do nothing
	}

}
