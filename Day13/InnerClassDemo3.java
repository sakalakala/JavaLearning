/*�����ڲ���*/
abstract class Demo{
	abstract void show();
}
class Outer{
	private int num=4;
	/*
	class Inner extends Demo{
		//��д
		public void show(){
			System.out.println("show.."+num);
		}
	}
	*/
	public void method(){
//		new Inner().show();
		new Demo(){
			//����demo�еĳ��󷽷�
			public void show(){
				System.out.println(" ..."+num);
			}
		}.show();//����ֱ��new����
	}
}
class InnerClassDemo3{
	public static void main(String[] args){
		new Outer().method();
	}
}