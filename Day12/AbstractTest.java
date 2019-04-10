/*需求：公司中国程序员有姓名，工号，薪水，工作内容；
		项目经理除了有姓名，工号，薪水，还有奖金，工作内容；
		对给出需求进行数据建模
  分析：
		程序员
			属性：姓名，工号，薪水
			行为：工作内容
		项目经理
			属性：姓名，工号，薪水，还有奖金
			行为：工作内容
		两者不存在所属关系，但是有共性内容，可以向上抽取
		两者共性：雇员
		雇员
			属性：姓名，工号，薪水
			行为：工作内容
*/
class Employee{
	private String name;
	private String id;
	private double pay;
	Employee(String name,String id,double pay){
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	/*工作内容*/
	public abstract void work();
}
class Programmer extends Employee{
	Programmer(String name,String id,double pay){
		super(name,id,pay);
	}
	public void work(){
		System.out.println("code");
	}
}
class Manager extends Employee{
	private double bonus;
	Manager(String name,String id,double pay,double bonus){
		super(name,id,pay);
		this.bonus=bonus;
	}
	public void work(){
		System.out.println("code");
	}
}
class AbstractTest{
	public static void main(String[] args){
		
	}
}