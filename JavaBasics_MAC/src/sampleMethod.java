class Persons {

	String name;
	int age;

	void methd() {
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is " + name + "and my age is " + age);
		}

	}

	void Hello() {
		System.out.println("My name is " + name + "and my age is " + age);

	}
}

public class sampleMethod {

	public static void main(String[] args) {

		Persons p = new Persons();
		p.name = "James Bond";
		p.age = 35;
		System.out.println(p.name + p.age);
		p.methd();

		Persons p1 = new Persons();
		p1.name = "MacBook";
		p1.age = 28;
		System.out.println(p1.name + p1.age);
		p1.Hello();

	}

}
