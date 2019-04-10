interface InterA{
	void show1;
	void show();
}
interface InterB{
	void show2;
	void show();
}
class SubInter implements InterA,InterB{
	public void show(){
		System.out.println("inter show1");
	}
	public void show(){
		System.out.println("inter show2");
	}
}
class InterfaceDemo2{
	public static void main(String[] args){
		SubInter in =new SubInter();
		in.show();
	}
}