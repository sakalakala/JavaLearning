abstract class Woo{
	abstract void Woo();//³éÏóÀà
}
class Dog extends Woo{
	void Woo(){
		System.out.println("ÍôÍô");
	}
}
class Wolf extends Woo{
	void Woo(){
		System.out.println("à»à»");
	}
	
}
class AbstractDemo{
	public static void main(String[] args){
		Dog d=new Dog();
		d.Woo();
	}
}