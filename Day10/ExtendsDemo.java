//��ѧ���͹��˵Ĺ���������ϳ�ȡ��һ�����Ե�������
class Person {
	String name;
	int age;
}
class Student extends Person{
	void study(){
		System.out.println(name+"ѧϰ");
	}
}
class Worker extends Person{
	void work(){
		System.out.println("����");
	}
}
class ExtendsDemo{
	public static void main(String[] args){
		Student s1=new Student();
		s1.name="С��";
		s1.study();
	}
}