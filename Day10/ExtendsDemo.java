//将学生和工人的共享代码向上抽取到一个共性的类型中
class Person {
	String name;
	int age;
}
class Student extends Person{
	void study(){
		System.out.println(name+"学习");
	}
}
class Worker extends Person{
	void work(){
		System.out.println("工作");
	}
}
class ExtendsDemo{
	public static void main(String[] args){
		Student s1=new Student();
		s1.name="小明";
		s1.study();
	}
}