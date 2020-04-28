package designpattern.singleton;

public class StaticBlockSingleton{
	
	private static StaticBlockSingleton instance = null;
	
	private StaticBlockSingleton(){		
	}
	
	static{
		instance = new StaticBlockSingleton();
	}
	
	public static StaticBlockSingleton getInstance(){
		return instance;
	}

}
