class Person{
	private String name;
	private int age;
	static String country="CN";
	Person(){
		name = "δ֪";
	}
	private Person(String n){
		name = n;
	}
	Person(String n,int a){
		this(n);
		age = a;
	}
	Person(int age){
		age = age;//�ֲ�����age��ֵ���ֲ���������Ա����δ��ֵ
		this.age=age;//��ʱ�ֲ�����age��ֵ���ö���ı���age
	}
	public void show(){
		System.out.println("name="+name+",age="+age);
	}
	//�ж��Ƿ�Ϊͬ����
	  public boolean equalsAge(Person pp){
		  return pp.age ==this.age;
	  }
	  //�ж��Ƿ�Ϊͬһ����
	  public boolean equalsPerson(Person pp){
		  return pp==this;
	  }
	  public static void sleep(){
		  System.out.println("����");
	  }
}
class ThisDemo{
	public static void main(String[] args){
		/*Person p=new Person("tom",21);
		Person p1=new Person("amy",21);
		boolean b=p.equalsAge(p1);
		System.out.println(b);*/
		Person.sleep();//���ֻ������sleep��δʹ�ö����е����ݣ���ö���Ľ�����û������ģ���÷��������������ķ�ʽ������
		System.out.println(Person.country);
	}	
}