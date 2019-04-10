class ExtendsDemo3{
	public static void main(String[] args){
		NewPhone p=new NewPhone();
		p.show();
	}
}
//描述手机，来电显示、打电话、发短信
class Phone{
	public void call(){}
	public void sendMsg(){}
	public void show(){
		System.out.println("number");
	}
}
//新手机继承自旧手机
class NewPhone extends Phone{
	public void show(){
		super.show();//调用父类的show
		System.out.println("number name pic");
	}
}