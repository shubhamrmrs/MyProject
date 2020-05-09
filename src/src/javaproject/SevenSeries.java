package src.javaproject;

public class SevenSeries extends BMW {
	int parkAssist(){
		int a = 4;
		int b = 5;
		return a+b;
		
	}
	
	void series(){System.out.println("hello");}
	void seven(){System.out.println("world");}

	public static void main(String[] args) {
		SevenSeries obj =new SevenSeries();
		obj.model();
		obj.speed();
		obj.feature();
		obj.wheel();
		obj.auto();
		System.out.println(obj.parkAssist());
		
	}
}
