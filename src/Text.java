//60171629 ������
public class Text implements Drawable{
	String string;
	
	//Ŭ���� ��ü������ string�� Text(String string)�� string�� �ǵ��� ����
	Text (String string) {
		this.string = string;
	}
	
	//draw�޼ҵ� ������
	@Override
	public void draw() {
		//ShapeTest1���� ������ ���ڿ��� ���
		System.out.println(string);
	}
}