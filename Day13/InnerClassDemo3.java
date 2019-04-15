/*匿名内部类*/
abstract class Demo{
	abstract void show();
}
class Outer{
	private int num=4;
	/*
	class Inner extends Demo{
		//复写
		public void show(){
			System.out.println("show.."+num);
		}
	}
	*/
	public void method(){
//		new Inner().show();
		new Demo(){
			//覆盖demo中的抽象方法
			public void show(){
				System.out.println(" ..."+num);
			}
		}.show();//匿名直接new父类
	}
}
class InnerClassDemo3{
	public static void main(String[] args){
		new Outer().method();
	}
}