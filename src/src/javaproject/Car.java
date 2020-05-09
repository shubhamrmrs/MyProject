package src.javaproject;

public abstract class Car implements Automobile,FourWheeler {
	void model(){ System.out.println("sedan car");}
	void feature(){System.out.println("convertible");}

	@Override
	public void wheel() {
		System.out.println("4 wheels");
		
	}

	@Override
	public void auto() {
		System.out.println("luxury auto");
		
	}
	
}
