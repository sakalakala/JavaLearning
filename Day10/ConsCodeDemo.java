class Person{
	private int age=8;//��ʾ��ʼ��
	{//�������飬�����ж�����г�ʼ��
		System.out.println("constructor code run");
		cry();
	}
	Person(){
		System.out.println("person run");
	}
	Person(int age){
		this.age=age;
		System.out.println("Person(age) run");
	}
	public void cry(){
		System.out.println("������");
	}
}
class ConsCodeDemo{
	public static void main(String[] args){
		int x =3;
		Person p = new Person();
		Person p1=new Person(2);
		{//�ֲ������
			
			System.out.println("hehe"+x);
		}
		System.out.println(x);
	}
}