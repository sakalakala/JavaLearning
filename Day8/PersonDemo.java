class Person{
	private int age;
	public void setAge(int a){
		if(a<0||a>130){//���Զ����ݽ��п���
			throw new RuntimeException(a+"��ֵ����");//�׳��쳣
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