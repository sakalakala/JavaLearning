class Fu{
	int num=4;
	void show(){
		System.out.println("fu show");
	}
	void staticMethod(){
		System.out.println("fu staticmethod");
	}
}
class Zi extends Fu{
	int num=6;
	void show(){
		System.out.println("zi show");
	}
	void staticMethod(){
		System.out.println("zi staticmethod");
	}
}
class PolyDemo3{
	public static void main(String[] args){
		/*��Ա����Fu f=new Zi();
		System.out.println(f.num);*/
		/*��Ա����Fu f=new Fu();
		f.show();
		Zi z=new Zi();
		z.show();
		Fu f=new Zi();
		f.show();//��ʾzi show*/
		/*��̬����*/
		Fu f=new Zi();
		f.staticMethod();
		Zi z=(Zi)f;
		z.staticMethod();
		
	}
}