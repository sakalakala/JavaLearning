class Person extends Object{
	private int age;
	private String name;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){//Object obj=p2;-->Object obj =new Person();
	//提高效率，如果两个引用指向同一个对象，不用再转换并比较内容，可以直接判断地址
	if(this==obj)
		return true;
	//Object中无age属性，想要使用子类对象的特有属性或行为必须进行向下转型,此时需要类型判断；
	if(!(obj instanceof Person))
		throw new ClassCastException("类型错误");
	Person p=(Person)obj;
	return this.age.equals(p.age)&&this.name.equals(p.name);
	}
}
class Demo{
	
}
class ObjectDemo{
	public static void main(String[] args){
		Person p1=new Person();
		Person p2=new Person();
		System.out.println(p1.toString);//比较内容
	}
}