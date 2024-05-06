abstract class Base {
	abstract int getPointNum();
}

class Triangle extends Base {
	@Override
	int getPointNum() {
		return 3;
	}
}

class Square extends Base {
	@Override
	int getPointNum() {
		return 4;
	}
}

public class Shape {
	public static void main(String[] args) {
	Triangle t1 = new Triangle();
	Square s1 = new Square();
		System.out.println(t1.getPointNum());
		System.out.println(s1.getPointNum());
	}
}