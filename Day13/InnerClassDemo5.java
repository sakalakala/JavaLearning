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
		Object obj=new Object(){//Pbject obj指向了自己的子类对象，对象提升为了Object，就不能调用子类特有方法
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