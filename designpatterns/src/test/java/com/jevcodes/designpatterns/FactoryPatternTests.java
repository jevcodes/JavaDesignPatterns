package com.jevcodes.designpatterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import factorypattern.Animal;
import factorypattern.AnimalFactory;
import factorypattern.Cat;
import factorypattern.Dog;
import factorypattern.Lion;

public class FactoryPatternTests {

	 Animal grumpyCat;
	Animal clifford;
	Animal simba;
	
	@Before
	public  void setup() {
		System.out.println("Setup starting...");
		 grumpyCat = AnimalFactory.getInstance().getAnimal("Grumpy Cat","Cat");
		 clifford = AnimalFactory.getInstance().getAnimal("Clifford","Dog");
		 simba = AnimalFactory.getInstance().getAnimal("Simba","Lion");
	}
	
	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testCat() {
		System.out.println("FactoryPattern::testCat::started");
		
		assertEquals(Cat.class, grumpyCat.getClass());
		
		assertEquals(Animal.class, grumpyCat.getClass().getSuperclass());
		
		assertNotEquals(Dog.class, grumpyCat.getClass());
	}
	
	@Test
	public void testDog() {
		
		System.out.println("FactoryPattern::testDog::started");
		
		
		
		assertEquals(Dog.class, clifford.getClass());
		
		assertEquals(Animal.class, clifford.getClass().getSuperclass());
		
		assertNotEquals(Lion.class, clifford.getClass());
	}
	
	@Test
	public void testLion() {
		System.out.println("FactoryPattern::testLion::started");
		
		
		
		assertEquals(Lion.class, simba.getClass());
		
		assertEquals(Animal.class, simba.getClass().getSuperclass());
		
		assertNotEquals(Cat.class, simba.getClass());
	}
	
	@Test
	public void testAnimalSpeak() {
		Animal mufasa = AnimalFactory.getInstance().getAnimal("Mufasa", "Lion");
		
		System.out.println(mufasa.speak());
		
		String mufasasSpeach = "My name is Mufasa. I am a Lion. Roar!";
		
		assertEquals(mufasasSpeach, mufasa.speak());
		
		String cliffordSpeech = "My name is Clifford. I am a Dog. Woof!";
		 
		assertEquals(cliffordSpeech, clifford.speak());
		 	
		String grumpyCatSpeech = "My name is Grumpy Cat. I am a Cat. Meow!";
	
		assertEquals(grumpyCatSpeech, grumpyCat.speak());
	}
	
	

}
