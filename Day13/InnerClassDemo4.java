interface Inter{
	void show1();
	void show2();
}
class Outer{
	private int num=2;
	/*������
	class Inner implements Inter{
		public void show1(){};
		public void show2(){};
	}*/
	//ת��Ϊ������
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
		in.show2();//�½�һ������
	}
}
class InnerClassDemo4{
	public static void main(String[] args){
		new Outer().method();
	}
}