class Person{
	private String name;
	private int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
class Student extends Person{
	Student(String name,int age){
		super(name,age);//调用父类已有的构造函数
	}
	void study(){
		System.out.println("study");
	}
}
class Woker extends Person{
	Woker(String name,int age){
		super(name,age);
	}
	void woker(){
		System.out.println("woker"+super.getName());
	}
}
class ExtendsDemo5{
	public static void main(String[] args){
		Woker w=new Woker("张三",23);
		w.woker();
	}
}