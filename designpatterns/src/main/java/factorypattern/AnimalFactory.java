/**
 * 
 */
package factorypattern;

/**
 * @author Jevic
 *
 */
public class AnimalFactory {

	public static Animal getAnimal(String name, String animal) {
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
