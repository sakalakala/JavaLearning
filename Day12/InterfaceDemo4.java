interface Inter1{
	void show1();
}
interface Inter2 extends Inter1,InterA{
	void show2();
}
interface InterA{
	void showA();
}
class Demo implements Inter2{
	public void show1(){}
	public void show2(){}
	public void showA(){}
}
interface Inter{
	void show1();
	void show2();
	void show3();
}
/*����һ����ɽӿ��е����з���ȫ����ʵ��,���෽�������壬��Ϊ������*/
abstract class Demo0 implements Inter{
	void show1();
	void show2();
	void show3();
}
class DemoA extends Demo0{
	public void show1(){
		System.out.println("Demoa show1");
	}
}

class InterfaceDemo4{
	public static void main(String[] args){
		DemoA a=new Demoa();
		a.show1();
	}
}