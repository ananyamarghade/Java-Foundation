public class Main {
	public static void main(String[] args) {
		Human human = new Human("ABC", 65);
		System.out.println(human.name);
		System.out.println(human.age);
		
	}
}

class Human {
	
	String name;
	int age;
	
	Human(String name, int age){
		this.age=age;
		this.name= name;
	}
	
}
