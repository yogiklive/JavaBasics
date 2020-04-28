package ploymorphismExamples;

import java.util.ArrayList;
import java.util.List;

public class TestPolymorphism {
	
	List<Animal> animalList = new ArrayList<Animal>();
	
	public static void main(String args[]){
		TestPolymorphism test = new TestPolymorphism();
		test.addElements();
		test.retrieveElements();
		
	}

	private void retrieveElements() {
		
		for(Animal a : animalList){
			
		     //Dog d = a; The compile does not know that the thing returned is actually a dog object. So it wont let u to assign it to a Dog referenece
			
			Dog d = (Dog) a;
			d.bark();
			
		}
		
	}

	private void addElements() {
       Dog d = new Dog();
       animalList.add(d);
       Cat c = new Cat();
       animalList.add(c);
		
	}

}
