class Person extends Object{
	private int age;
	private String name;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){//Object obj=p2;-->Object obj =new Person();
	//���Ч�ʣ������������ָ��ͬһ�����󣬲�����ת�����Ƚ����ݣ�����ֱ���жϵ�ַ
	if(this==obj)
		return true;
	//Object����age���ԣ���Ҫʹ�����������������Ի���Ϊ�����������ת��,��ʱ��Ҫ�����жϣ�
	if(!(obj instanceof Person))
		throw new ClassCastException("���ʹ���");
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
		System.out.println(p1.toString);//�Ƚ�����
	}
}