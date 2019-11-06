package _01_getters_and_setters;

public class Person {
	private String name;
	private String superpower;
	Person(String name, String superpower){
		this.name = name;
		this.superpower = superpower;
		System.out.println(name + " has mad " + superpower + " skills");
		System.out.println(toString());
		
	}
	void setName(String name) {
		this.name = name;
	}
	void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	void getName(String name) {
		this.name = name;
	}
	void getSuperpower(String superpower) {
		this.superpower = superpower;
	}
}
