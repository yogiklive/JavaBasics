package encapsulationExample;


public class Person {
	
	public int height;
	
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight <0){
			weight =0;
		}else{
			this.weight = weight;
		}
		
	}
	
	public static void main(String args[]){
		
		Person p = new Person();
		p.height=-200;//With out encapsulation there is a risk of assigning wrong values to the data
		p.setWeight(-200);
		System.out.println("Value of weigth " + p.getWeight());
		System.out.println("Value of heigth " + p.height);
	}

}
