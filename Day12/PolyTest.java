class 毕姥爷{
	public void 讲课(){
		System.out.println("管理");
	}
	public void 钓鱼(){
		System.out.println("钓鱼");
	}
}
class 毕老师 extends 毕姥爷{
	public void 讲课(){
		System.out.println("技术")；
	}
	public void 看电影(){
		System.out.println("看电影")；
	}
}
class PolyTest{
	public static void main(String[] args){
		毕姥爷 x = new 毕老师();//向上转型
		x.讲课();//输出管理
		x.钓鱼();
		毕老师 y=(毕老师)x;
		y.看电影();
		y.钓鱼();//转型过程中自始至终只有子类对象在坐着类型的变化
	}
}