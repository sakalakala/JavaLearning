abstract class Animal{
	abstract void eat();
}
class Dog extends Animal{
	void eat(){
		System.out.println("��ͷ");
	}
	void lookHome(){
		System.out.println("����");
	}
}
class Cat extends Animal{
	void eat(){
		System.out.println("��");
	}
	void Work(){
		System.out.println("ץ����");
	}
}
class Poly{
	public static void main(String[] args){
		Animal a=new Dog();//����ת��
		Animal a1=new Cat();
		method(a);
		method(a1);
		if(!(a1 instanceof Dog)){
			System.out.println("��ƥ��");
			return;
		}
		Dog d=(Dog)a1;
		d.eat();
		d.lookHome();
	}
	public static void method(Animal a){
		a.eat();//����animal��������󶼿��Խ���
	}
}