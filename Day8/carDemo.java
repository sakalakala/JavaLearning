//������
class Car{
	int num;
	String color;
	void run(){
		System.out.println(num+":"+color);
	}
}
//����ʵ��
class carDemo
{
	public static void main(String[] args){
		Car c1=new Car();//�������� ������=��ʼ��ֵ������һ��car���͵ı���cָ����car���͵Ķ���
		Car c2=new Car();
		show(c1);
		show(c2);
	}
	public static void show(Car c){
		c.num=4;
		c.color="red";
		c.run();
	}
}
