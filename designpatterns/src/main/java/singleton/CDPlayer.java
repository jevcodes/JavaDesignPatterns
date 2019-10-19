package singleton;

/**
 * @author Jevic
 *
 */
public class CDPlayer {

	private static CDPlayer rp = new CDPlayer();
	
	
	private CDPlayer() {
		
	}
	
	public static CDPlayer getInstance() {
		return rp;
	}
	
	public String playSong(CD cd,int trackNumber) {
		if(trackNumber>cd.getSongs().length || trackNumber <0) {
			return "Track not available";
		}
		else {
			return cd.getSongs()[trackNumber];
		}
	}
	
	
	
	
	
	
	
	
}
