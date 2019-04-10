class Fu{
	int num = 4;
	/*Fu(){
		System.out.println("fu run"+num);
	}*/
	Fu(int x){
		System.out.println("fu run"+x);
	}
}
class Zi extends Fu{
	Zi(){
		super(4);
		System.out.println("zi run");
	}
	Zi(int x){
		super(x);//显示定义super语句
		System.out.println("zi"+x);
	}
}
class ExtendsDemo4{
	public static void main(String[] args)
	{
		Zi z=new Zi(5);
	    System.out.println(z.num);
	}
}