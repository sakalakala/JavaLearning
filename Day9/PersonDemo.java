class Person{
	private String name;
	private int age;
	//���캯��
	Person(){
		name = "δ֪";
		age = 0;
	}
	Person(String n,int a){
		name = n;
		age = a;
	}
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	//������ʾ��������ķ���
	public void show(){
		System.out.println("name="+name+",age="+age);
	}
}

class PersonDemo{
	public static void main(String[] args){
		//����һ��Person�����������������ʵ�������һ�����������������䣨�Զ�����г�ʼ����
		Person p=new Person("hh",22);
		Person w=new Person();
		w.show();
	}
}