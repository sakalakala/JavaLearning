class Test3
{
	public static void main(String[] args)
	{
		//1.三元运算符
		int x=1,y;
		y=x>1?100:200;
		System.out.println("y="+y);
		//2.找三个数的最大值和最小值
		int a=4,b=8,c=20;
		y=(a>b?a:b)>(b>c?b:c)?(a>b?a:b):(b>c?b:c);
		x=(a<b?a:b)<(b<c?b:c)?(a<b?a:b):(b<c?b:c);
		System.out.println("Max="+y+"Min="+x);
		//3.if格式一
		if(x>1){
			System.out.println("yes");
		}
		System.out.println("over");
		//4.if格式二
		if(a>1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		//5.if格式三，里面只有一个块执行的一个语句，控制单条语句时可以省略，多条则不可以省略
		int i=3;
		if(i>1){
			System.out.println("a");
		}
		else if(i>2){
			System.out.println("b");
		}
		else if(i>3){
			System.out.println("c");
		}
		else{
			System.out.println("d");
		}
		/*6.需求：if练习，根据给定的数值输出相应的星期
			思路：
			1.获取数值，用变量存储
			2.判断
			3.显示，输出语句
			步骤：
			1.定义变量，记录数据	
			2.通过判断结构语句if对变量进行判断
			3.根据条件显示结果
			*/
		int week=3;
		if(week==1){
		System.out.println("星期一");}
		else if(week==2){
		System.out.println("星期二");}
		else if(week==3){
		System.out.println("星期三");}
		else if(week==4){
		System.out.println("星期四");}
		else if(week==5){
		System.out.println("星期五");}
		else if(week==6){
		System.out.println("星期六");}
		else if(week==7){
		System.out.println("星期日");}
		else
			System.out.println("错误");
		//7.switch语句
		int w=2;
		switch(w){
			case 1:
			case 3:
			System.out.println("b");//w为1或3时输出均为b
			break;
			default:
			System.out.println("c");
			break;
		}
		/*while练习
		需求：计算1到10和
		*/
		int r=1,sum=0;
		while(r<11){
			sum+=r;
			r++;
		}System.out.println(sum);
		/*for练习，1——100间6的倍数的个数
		 思路：
		 1.个数未知，所以定义变量
		 2.6的倍数，只要能被6整除无余数则成立
		 3.1——100都要判断，是则自增
		 4.循环
		 步骤：
		 1.定义变量，记录个数
		 2.定义循环，遍历1-100
		 3.1——100进行判断
		 4.满足条件变量自增
		*/
		int count=0;
		for(int p=1;p<=100;p++){
			if(p%6==0)
				count++;
		}
		System.out.println(count);
		/*for嵌套练习
		需求：在屏幕显示*****
						****
						***
						**
						*
		思路：1.五行
			  2.每行多个星星
			  3.循环内循环
		步骤：1.for嵌套循环
			  2.外循环控制行数，内循环控制个数
			  */
		for(int line=0;line<5;line++){
			for(int star=5;star-line>0;star--)
				System.out.print('*');
			System.out.println( );	
		}
		/*需求：对给定的整数26，获取其十六进制表现形式
		思路：二进制的四位为一位十六进制，与运算，获取下四位可对原数据进行无符号右移操作
		1.定义一个变量记录整数
		2.对该变量进行与运算
		3.对原数据进行无符号右移四位*/
		int num=26;
		int n1=num&15;
		System.out.println("n1="+(char)(n1-10+'a'));//16进制转换，char强行输出字符
		num=num>>>4;
		int n2=num&15;
		System.out.println("n2="+n2);
		
	}
}	