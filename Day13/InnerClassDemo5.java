class Outer{
//class Inner extends Object{
//	
//}
	public void method(){
		new Object(){
			public void show(){
			System.out.println("show run");
			}
		}.show();
		Object obj=new Object(){//Pbject objָ�����Լ���������󣬶�������Ϊ��Object���Ͳ��ܵ����������з���
			public void show(){
				System.out.println("show run");
			}
		};
	//	obj.show();
		
	}
}
class InnerClassDemo5{
	public static void main(String[] args){
	}	
}