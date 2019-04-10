/*
阶段一：笔记本电脑运行，笔记本中有一个运行功能；
阶段二：想使用一个鼠标，又有一个功能使用鼠标，并多了一个鼠标对象；
阶段三：还想使用一个键盘功能，又要多一个功能；
*/
//1.先定义规则
interface USB{
	/*设备开启*/
	public void open();
	/*设备关闭*/
	public void close();
}
//描述笔记本
class NoteBook{
	/*运行*/
	public void run(){
		System.out.println("book run");
	}
	/*使用符合规则的外围设备*/
	public void useUSB(USB usb){//定义一个接口类型的引用
		if(usb!=null){
			usb.open();
			usb.close();
		}
	}
}
//有了鼠标
class MouseByUSB implements USB{
	public void open(){
		System.out.println("mouse open");
	}
	public void close(){
			System.out.println("mouse close");
	}
}
//键盘
class KeyByUSB implements USB{
	public void open(){
		System.out.println("key open");
	}
	public void close(){
			System.out.println("key close");
	}
}
class USBTest{
	public static void main(String[] args){
		NoteBook book=new NoteBook();
		book.run();
		book.useUSB(null);
		book.useUSB(new MouseByUSB());//USB usb=new MouseByUSB()
		book.useUSB(new KeyByUSB());
	}
}