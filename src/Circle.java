//60171629 ������
public class Circle extends Shape { //Shape�� ��ӹ޴� �ڽ�Ŭ���� Circle
	double radius;

	//ShapeŬ�������� ��ӹ޾� ����� �� �ִ� x�� y�� ���� Ŭ���� ��ü������ x�� y�� Rectangle(double x, double y, ...)�� x,y�� �ǵ��� ����
	//Ŭ���� ��ü���� radius�� Rectangle(..., double radius)�� radius�� �ǵ��� ����
	Circle (double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	//���� ���� ������
	@Override
	public double getArea() {
		area = Math.PI*radius*radius;
		return area;
	}
	
	//���� �ѷ� ������
	@Override
	public double getLength() {
		length = Math.PI*2*radius;
		return length;
	}
	
	//draw�޼ҵ� ������
	@Override
	public void draw() {
		System.out.println("Rectangle (" + x + ", " + y + ")-(" + radius + ")");
	}
}