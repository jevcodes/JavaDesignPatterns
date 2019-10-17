/**
 * 
 */
package factorypattern;

/**
 * @author Jevic
 *
 */
public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public String speak() {
		return super.speak() + " Woof!";
	}
	
	
}
