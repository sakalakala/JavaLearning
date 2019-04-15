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
		/*成员变量Fu f=new Zi();
		System.out.println(f.num);*/
		/*成员函数Fu f=new Fu();
		f.show();
		Zi z=new Zi();
		z.show();
		Fu f=new Zi();
		f.show();//显示zi show*/
		/*静态函数*/
		Fu f=new Zi();
		f.staticMethod();
		Zi z=(Zi)f;
		z.staticMethod();
		
	}
}