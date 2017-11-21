//60171629 김지우
public class Circle extends Shape { //Shape를 상속받는 자식클래스 Circle
	double radius;

	//Shape클래스에서 상속받아 사용할 수 있는 x와 y에 대해 클래스 전체에서의 x와 y가 Rectangle(double x, double y, ...)의 x,y가 되도록 설정
	//클래스 전체에서 radius가 Rectangle(..., double radius)의 radius가 되도록 설정
	Circle (double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	//원의 넓이 재정의
	@Override
	public double getArea() {
		area = Math.PI*radius*radius;
		return area;
	}
	
	//원의 둘레 재정의
	@Override
	public double getLength() {
		length = Math.PI*2*radius;
		return length;
	}
	
	//draw메소드 재정의
	@Override
	public void draw() {
		System.out.println("Rectangle (" + x + ", " + y + ")-(" + radius + ")");
	}
}