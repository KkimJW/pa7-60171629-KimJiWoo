//60171629 ������
public class ShapeTest1 {
	public static void main(String[] args) {
		
		//���̰� 3�� Shape �迭 ����
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		
		//���� �迭�� �ִ� �������� ���̿� ���� ���
		for(Shape s: shapes) {
		/* %.lf: �Ҽ� ù°¥������ �ݿø��ؼ� ǥ��
		   \n: �ٹٲ� */
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getLength());
		}
		
		//���̰� 4�� Drawable�迭 ����
		Drawable[] drawables = new Drawable[4];
		//�迭�� 1,2,3��°�� Shape�� draw�� ����
		for(int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		
		//�迭�� 4��°�� Text�� draw�� ����
		drawables[3] = new Text("Simple Text");
		//Drawable�迭�� ���� draw�޼ҵ� ����
		for(Drawable d: drawables) {
			d.draw(); //
		}
	}
}

