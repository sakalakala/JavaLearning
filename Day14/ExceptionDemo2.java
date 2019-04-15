class Demo{
	int div(int a,int b)throws Exception{//有错误时才抛Exception
		if(b==0)
			throw new ArithmeticException("除数是0啊");//throw无s
		return a/b;
	}
}
class ExceptionDemo2{
	public static void main(String[] args){//throws Exception{声明异常
		Demo d=new Demo();
		try{
			int num=d.div(4,0);
			System.out.println("num="+num);//连锁反应的代码全部放进去
		}
		catch(Exception e){//抛什么处理什么
			System.out.println("异常");
			System.out.println(e.getMessage());//异常原因
			System.out.println(e.toString());//异常名称+异常位置
			e.printStackTrace();//名字+信息+位置，jvm默认处理收到异常就是调用此方法
		}
		System.out.println("over");
	}
}