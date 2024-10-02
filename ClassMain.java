package Assignment6;

class A {
	public static void sum() {
		System.out.println("Parent");
	}
}

class B extends A {
	public static void add() {
		System.out.println("Child");
	}
}

public class ClassMain {
	public static void main(String[] args) {
		A obj = new B();
		A.sum();
		B.add();
	}
}
