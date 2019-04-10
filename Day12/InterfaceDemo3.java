class Fu{
	void show(){
		System.out.println("fu show");
	}
}
interface Inter{
	void show1();
}
class Zi extends Fu implements Inter{
	public void method(){
		System.out.println("zi method");
	}
	public void show1(){
		System.out.println("zi show1");
	}
}
class InterfaceDemo3{
	public static void main(String[] args){
		Zi z=new Zi();
		z.show1();
	}
}