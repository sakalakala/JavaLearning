class ExtendsDemo3{
	public static void main(String[] args){
		NewPhone p=new NewPhone();
		p.show();
	}
}
//�����ֻ���������ʾ����绰��������
class Phone{
	public void call(){}
	public void sendMsg(){}
	public void show(){
		System.out.println("number");
	}
}
//���ֻ��̳��Ծ��ֻ�
class NewPhone extends Phone{
	public void show(){
		super.show();//���ø����show
		System.out.println("number name pic");
	}
}