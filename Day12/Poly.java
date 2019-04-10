abstract class Animal{
	abstract void eat();
}
class Dog extends Animal{
	void eat(){
		System.out.println("骨头");
	}
	void lookHome(){
		System.out.println("看家");
	}
}
class Cat extends Animal{
	void eat(){
		System.out.println("鱼");
	}
	void Work(){
		System.out.println("抓老鼠");
	}
}
class Poly{
	public static void main(String[] args){
		Animal a=new Dog();//向上转型
		Animal a1=new Cat();
		method(a);
		method(a1);
		if(!(a1 instanceof Dog)){
			System.out.println("不匹配");
			return;
		}
		Dog d=(Dog)a1;
		d.eat();
		d.lookHome();
	}
	public static void method(Animal a){
		a.eat();//所有animal的子类对象都可以接收
	}
}