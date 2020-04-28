package hacker.practice;

public class AddElementsWithOutTemp {
	
	public static void main(String args[]){
		
		AddElementsWithOutTemp addElementsWithOutTemp = new AddElementsWithOutTemp();
		
		addElementsWithOutTemp.addElements(5,8);
	
	}
	
    private void addElements(int i,int j) {
		
		i = i+j;
		j= i-j;
		i =  i-j;
		
		System.out.println("i "+ i + " j " + j);
		
	}

}
