package com.jevcodes.designpatterns;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import singleton.CD;
import singleton.CDPlayer;

public class SingletonPatternTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	CD cd;
	String[] songs =new String[]{"Staying Alive","Hakuna Matata","Closing Time","I will survive"};
	
	@Before
	public void setup() {
		cd = new CD(songs);
	}
	
	@Test
	public void instanceCreated() {
		CDPlayer c = CDPlayer.getInstance();
		
		assertEquals(CDPlayer.class, c.getClass());
		assertEquals(c, CDPlayer.getInstance());
	}
	
	@Test
	public void cDPlayerPlaysCorrectSong() {
		
		
		assertEquals("Hakuna Matata",CDPlayer.getInstance().playSong(cd, 1));
		assertEquals(songs[0],CDPlayer.getInstance().playSong(cd, 0));
		
	}
	
	@Test
	public void trackNotAvailbleShoudReturnNotAvailable() {
		int outOfBounds = songs.length+1;
		
		assertEquals("Track not available", CDPlayer.getInstance().playSong(cd, outOfBounds));
		assertEquals("Track not available", CDPlayer.getInstance().playSong(cd, -1));
	}
	
	
}
