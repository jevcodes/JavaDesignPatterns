/**
 * 
 */
package factorypattern;

/**
 * @author Jevic
 *
 */
public class AnimalFactory {

	private static AnimalFactory af = new AnimalFactory();
	
	private AnimalFactory() {
		
	}
	
	public static AnimalFactory getInstance() {
		return af;
	}
	
	public  Animal getAnimal(String name, String animal) {
		if("Cat".equalsIgnoreCase(animal)) {
			return new Cat(name);
		}
		else if ("Dog".equalsIgnoreCase(animal)) {
			return new Dog(name);
		}
		else if ("Lion".equalsIgnoreCase(animal)) {
			return new Lion(name);
		}
		else {
			return new Animal(name);
		}
		
	}
	
}
