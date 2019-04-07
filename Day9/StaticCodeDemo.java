//¾²Ì¬´úÂë¿é
class StaticCode{
	static{
		System.out.println("A");
	}
	static void show(){
		System.out.println("show");
	}
}
class StaticCodeDemo{
	static{
		System.out.println("B");
	}
	public static void main(String[] args){
		StaticCode.show();
		StaticCode.show();
	}
	static{
		System.out.println("C");
	}
}