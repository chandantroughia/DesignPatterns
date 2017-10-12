package Adapter;

public class MediaAdapter implements MediaPlayer{
	AdvanceMP mp;

	@Override
	public void play(String type, String filename) {
		if(type.equalsIgnoreCase("vlc")) mp.playVlc(filename);
		else if(type.equalsIgnoreCase("mp4")) mp.playMp4(filename);
	}

	public void MediaAdapter(String type){
		if(type.equalsIgnoreCase("vlc")) mp = new PlayVlc();
		else if(type.equalsIgnoreCase("mp4")) mp = new PlayMp4();
	}
	
}
