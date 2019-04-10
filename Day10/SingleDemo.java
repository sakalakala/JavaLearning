class Single{
	//����һ���������
	private static Single s = new Single();
	//���캯��˽�л�
	private Single(){}
	//����һ���������ظö������������Ի�õ�
	public static Single getInstance(){
		return s;
	}
}
/*
//��һ����ʽ:�ӳټ��ط�ʽ�����ڳ�ʼ��ʱ�ʹ�������S
class Single{
	private static Single s =null;
	private Single(){}
	public static Single getInstance(){
		if(s==null)
			s=new Single();
		return s;
	}
} 
*/
class SingleDemo{
	public static void main(String[] args){
		//Single s1=Single.getInstance();
		//Single s2=Single.getInstance();
		//Single s3=Single.s;//�������Բ�Ҫд����ֱ�ӵ���s�������з��غ��������������ж��Ƿ񷵻�
		//System.out.println(s1==s2);
		/*SuperMan s1=new SuperMan("��è");
		s1.getName();
		SuperMan s2=new SuperMan("��ͷ");
		s2.getName();*/
		SuperMan s1=SuperMan.getInstance();
		s1.getName();
		SuperMan s2=SuperMan.getInstance();
		s2.setName("Ӣ��");
		s2.getName();
	}
}
class SuperMan{//������е�����
	private String name;
	private static SuperMan man = new SuperMan("������");
	private SuperMan(String name){
		this.name=name;
	}
	public static SuperMan getInstance(){
		return man;
	}
	public void setName(String name){
		this.name=name;
	}
	public void getName(){
		System.out.println( this.name);
	}
}