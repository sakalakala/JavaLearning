/*自定义异常
定义一个功能可以实现除法运算，但除数不可以为负数
*/
//描述负数为除数的问题
class FuShuException extends Exception{//只有继承于Exception才能可抛
	FuShuException(String message){
		
	}
}
class Demo{
	int div(int a,int b){
		if(b<0)
			throw new FuShuException("负数不可以作为除数");//自己定义一个异常
		if(b==0)
		return a/b;
	}
}
class ExceptionDemo5{
	public static void main(String[] args){
		Demo d = new Demo();
	}
}