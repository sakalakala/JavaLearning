abstract class Woo{
	abstract void Woo();//������
}
class Dog extends Woo{
	void Woo(){
		System.out.println("����");
	}
}
class Wolf extends Woo{
	void Woo(){
		System.out.println("��");
	}
	
}
class AbstractDemo{
	public static void main(String[] args){
		Dog d=new Dog();
		d.Woo();
	}
}