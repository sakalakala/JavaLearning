class Fu{
	int num=5;
	void show(){
		System.out.println("num="+this.num);
	}
}
class Zi extends Fu{
	int num=6;
}
class PolyTest{
	public static void main(String[] args){
		Fu f =new Zi();
		f.show();
	}
}