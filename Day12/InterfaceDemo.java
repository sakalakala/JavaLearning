//定义接口
interface Inter{
	public static final int NUM=4;
	public abstract void show1();
	public abstract void show2();
}
class Demo implements/*实现*/ Inter{
	public void show1();
	public void show2();
}
class InterfaceDemo{
	public static void main(String[] args){
		Demo d=new Demo();
	}
}