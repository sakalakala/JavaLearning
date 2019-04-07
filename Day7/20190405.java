class Test3
{
	public static void main(String[] args){
		/*1.转十六进制语句版(反，多零未解决）*/
		int num=26;
		for(int x=0;x<8;x++){
			int n=num&15;
			if(n>9)
				System.out.println((char)(n-10+'A'));
			else
				System.out.println(n);
			num=num>>>4;
		}
		/*2.数字三角形*/
		for(int lin=0;lin<=5;lin++){
			for(num=0;num+lin<5;num++)
				System.out.print(5-num);
			System.out.println( );
		}
		/*3.九九乘法表*/
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++)
				System.out.print(x+"*"+y+"="+x*y+"\t");//转义字符\t:制表符 \n:换行
			System.out.println( );
		}
		/*4.调用自定义的功能Draw画一个长方形*/
		Draw(4,5);
		/*5.调用相加功能*/
		System.out.println(Add(1,2));
		/*6.调用数组求和功能*/
		int[] arr={3,4,5};
		int add=Add(arr);
		System.out.println(add);
		/*7.调用数组求最大值*/
		System.out.println(Max(arr));
		/*8.转换数组为字符串*/
		System.out.println(ToString(arr));
		/*9.获取星期*/
		System.out.println(GetWeek(2));
		/*10.进制转换*/
		ToHex(26);
	}
	/*方法I.画一个长方形*/
	public static void Draw(int row,int col){
		if(row<0)
			return;
		for(int x=0;x<row;x++){
			for(int y=0;y<col;y++){
				System.out.print("+");
			}
			System.out.println();
		}
	}
	/*方法II.两数相加*/
	public static int Add(int a1,int a2){
		return a1+a2;
	}
	/*方法III.数组——多个数求和*/
	public static int Add(int[] arr){
		int sum=0;
		for(int x=0;x<arr.length;x++){
			sum=sum+arr[x];
		}
		return sum;
	}
	/*方法IIII.获取多个整数中最大值*/
	public static int Max(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++)
			if(max<arr[i+1])
				max=arr[i+1];
		return max;
	}
	/*方法V.将数组中的元素转成字符串*/
	public static String ToString(int[] arr){
		String s="{";
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1)
				s=s+arr[i]+",";
			else
				s=s+arr[i]+"}";
		}
		return s;
	}
	/*方法VI.查表法获取对应星期*/
	public static String GetWeek(int num){
		if(num>7||num<1)
			return "没有对应的星期";
		String[] weeks={" ","周一","���ڶ�","���ڶ�","周四","周五","周六","周日"};
		return weeks[num];
	}
	/*方法VII.转十六进制去0版*/
	public static void ToHex(int num){
		char[] chs=new char[8];
		int index=chs.length;
		while(num!=0){
			int temp=num&15;
			if(temp>9)
				chs[--index]=((char)(temp-10+'A'));
			else
				chs[--index]=((char)(temp+'0'));
			num=num>>>4;
		}
		for(int x=index;x<chs.length;x++)
			System.out.print(chs[x]);
	}
}