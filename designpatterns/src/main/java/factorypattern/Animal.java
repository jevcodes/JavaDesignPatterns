package factorypattern;

public  class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String speak() {
		return "My name is " + this.name 
				+ ". I am a " + getClass().getSimpleName() + ".";
	}
	
}
