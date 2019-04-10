class Fu{
	int num =4;
}
class Zi extends Fu{
	int num=5;
	void show(){
		int num=6;
		System.out.println(super.num);
		//System.out.println("this:"+this);
		//System.out.println(super);//编译失败要加.  但一般不会出现子父类同名变量的情况
	}
}
 class ExtendsDemo2{
	 public static void main(String[] args){
		 new Zi().show();
	 }
 }