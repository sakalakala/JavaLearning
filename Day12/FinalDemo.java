final class Fu{
	void show(){
		
	}
}
class Zi extends Fu{
	void show(){
		
	}
}
class FinalDemo{
	public static void main(String[] args){
		
	}
}
class Single{
	private static  final Single SINGLE_INSTANCE=new Single();
	private Single(){}
	public static Single getInstance(){
		return SINGLE_INSTANCE;
	}
}