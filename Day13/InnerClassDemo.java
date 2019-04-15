class Outer{
	private int num=4;
	//内部类，相当于外部类中的一个成员
	class Inner{
		void show(){
		System.out.println(new Outer().num);
		}
	}
	public void method(){
		Inner in=new Inner();
		in.show();
	}
}

class InnerClassDemo{
	public static void main(String[] args){
		System.out.println();
	}
}