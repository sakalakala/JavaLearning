//汽车类
class Car{
	int num;
	String color;
	void run(){
		System.out.println(num+":"+color);
	}
}
//汽车实体
class carDemo
{
	public static void main(String[] args){
		Car c1=new Car();//数据类型 变量名=初始化值，创建一个car类型的变量c指向了car类型的对象
		Car c2=new Car();
		show(c1);
		show(c2);
	}
	public static void show(Car c){
		c.num=4;
		c.color="red";
		c.run();
	}
}
