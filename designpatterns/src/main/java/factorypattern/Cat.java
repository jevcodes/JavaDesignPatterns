/**
 * 
 */
package factorypattern;

/**
 * @author Jevic
 *
 */
public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String speak() {
		return super.speak() + " Meow!";
	}
	
}
