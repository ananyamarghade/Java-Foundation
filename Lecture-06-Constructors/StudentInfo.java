public class Student {
	private String id;
	private String name;
	private int age;
	private char gender;

	public Student(String id, String name, int age, char gender){
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}
}

