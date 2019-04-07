class Person{
	private String name;
	private int age;
	//构造函数
	Person(){
		name = "未知";
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
	//用于显示姓名年龄的方法
	public void show(){
		System.out.println("name="+name+",age="+age);
	}
}

class PersonDemo{
	public static void main(String[] args){
		//创建一个Person对象，描述事物符合现实生活，对象一建立就有姓名和年龄（对对象进行初始化）
		Person p=new Person("hh",22);
		Person w=new Person();
		w.show();
	}
}