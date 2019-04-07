class Person{
	private String name;
	private int age;
	static String country="CN";
	Person(){
		name = "未知";
	}
	private Person(String n){
		name = n;
	}
	Person(String n,int a){
		this(n);
		age = a;
	}
	Person(int age){
		age = age;//局部变量age赋值给局部变量，成员变量未赋值
		this.age=age;//此时局部变量age赋值给该对象的变量age
	}
	public void show(){
		System.out.println("name="+name+",age="+age);
	}
	//判断是否为同龄人
	  public boolean equalsAge(Person pp){
		  return pp.age ==this.age;
	  }
	  //判断是否为同一个人
	  public boolean equalsPerson(Person pp){
		  return pp==this;
	  }
	  public static void sleep(){
		  System.out.println("呼呼");
	  }
}
class ThisDemo{
	public static void main(String[] args){
		/*Person p=new Person("tom",21);
		Person p1=new Person("amy",21);
		boolean b=p.equalsAge(p1);
		System.out.println(b);*/
		Person.sleep();//如果只调用了sleep则未使用对象中的数据，则该对象的建立是没有意义的，则该方法可以用类名的方式来调用
		System.out.println(Person.country);
	}	
}