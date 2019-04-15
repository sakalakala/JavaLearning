class Demo{
	int div(int a,int b)//throws Exception{//有错误时才抛Exception
		if(b==0)
			throw new ArithmeticException("除数是0啊");//throw无s，抛Exception（父类）也可以
		return a/b;
	}
}
class ExceptionDemo2{
	public static void main(String[] args)throws Exception{声明异常
		Demo d=new Demo();
		int num=d.div(4,0);
		System.out.println("num="+num);//连锁反应的代码全部放进去
		System.out.println("over");
	}
}