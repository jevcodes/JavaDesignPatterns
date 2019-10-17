/**
 * 
 */
package factorypattern;

/**
 * @author Jevic
 *
 */
public class Lion extends Animal {

	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String speak() {
		return super.speak() + " Roar!";
	}
	
}
