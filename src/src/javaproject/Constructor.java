package src.javaproject;

public class Constructor {
	
	int id;
	String name;
	
	Constructor(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	void method (){
		System.out.println(id+"  "+name);
		}
	
	public static void main(String[] args) {
		Constructor c1 =new Constructor(101,"rahul");
		Constructor c2 =new Constructor(102,"rohit");
		Constructor c3 =new Constructor(103,"shub");
		 c1.method();
		 c2.method();
		 c3.method();
		
		
	}
	

}
