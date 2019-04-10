class Single{
	//创建一个本类对象
	private static Single s = new Single();
	//构造函数私有化
	private Single(){}
	//定义一个方法返回该对象，让其程序可以获得到
	public static Single getInstance(){
		return s;
	}
}
/*
//另一种形式:延迟加载方式，不在初始化时就创建对象S
class Single{
	private static Single s =null;
	private Single(){}
	public static Single getInstance(){
		if(s==null)
			s=new Single();
		return s;
	}
} 
*/
class SingleDemo{
	public static void main(String[] args){
		//Single s1=Single.getInstance();
		//Single s2=Single.getInstance();
		//Single s3=Single.s;//甚至可以不要写方法直接调用s，但是有返回函数可以有助于判断是否返回
		//System.out.println(s1==s2);
		/*SuperMan s1=new SuperMan("蓝猫");
		s1.getName();
		SuperMan s2=new SuperMan("光头");
		s2.getName();*/
		SuperMan s1=SuperMan.getInstance();
		s1.getName();
		SuperMan s2=SuperMan.getInstance();
		s2.setName("英雄");
		s2.getName();
	}
}
class SuperMan{//对类进行单例化
	private String name;
	private static SuperMan man = new SuperMan("克拉克");
	private SuperMan(String name){
		this.name=name;
	}
	public static SuperMan getInstance(){
		return man;
	}
	public void setName(String name){
		this.name=name;
	}
	public void getName(){
		System.out.println( this.name);
	}
}