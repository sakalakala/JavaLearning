class Person{
	private int age=8;//显示初始化
	{//构造代码块，给所有对象进行初始化
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
		System.out.println("哇哇哇");
	}
}
class ConsCodeDemo{
	public static void main(String[] args){
		int x =3;
		Person p = new Person();
		Person p1=new Person(2);
		{//局部代码块
			
			System.out.println("hehe"+x);
		}
		System.out.println(x);
	}
}