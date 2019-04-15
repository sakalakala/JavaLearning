interface Inter{
	void show1();
	void show2();
}
class Outer{
	private int num=2;
	/*有名类
	class Inner implements Inter{
		public void show1(){};
		public void show2(){};
	}*/
	//转化为匿名类
	public void method(){
		/*
		Inner in=new Inner();
		in.show1();
		in.show2();*/
		Inter in=new Inter(){
			public void show1(){}
			public void show2(){}
		}
		in .show1();
		in.show2();//新建一个对象
	}
}
class InnerClassDemo4{
	public static void main(String[] args){
		new Outer().method();
	}
}