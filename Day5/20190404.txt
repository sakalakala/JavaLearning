class Test2
{
	public static void main(String[] args)
	{
		//1.最有效率的2*8计算（位运算完成）
		System.out.println(2<<3);
		//2.对两个整数变量值进行互换（不需要第三方变量）
		int a=3,b=7;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"b="+b);
	}
}