class Person{
	private int age;
	public void setAge(int a){
		if(a<0||a>130){//可以对数据进行控制
			throw new RuntimeException(a+"数值错误");//抛出异常
		}else{
		age=a;
		}
	}
	public int getAge(){
		return age;
	}
	void speak(){
		System.out.println("age="+age);
	}
	}
class PersonDemo{
	public static void main(String[] args){
		Person p=new Person();
		p.setAge(-20);
		p.speak();
	}
}