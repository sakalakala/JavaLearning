/*
�׶�һ���ʼǱ��������У��ʼǱ�����һ�����й��ܣ�
�׶ζ�����ʹ��һ����꣬����һ������ʹ����꣬������һ��������
�׶���������ʹ��һ�����̹��ܣ���Ҫ��һ�����ܣ�
*/
//1.�ȶ������
interface USB{
	/*�豸����*/
	public void open();
	/*�豸�ر�*/
	public void close();
}
//�����ʼǱ�
class NoteBook{
	/*����*/
	public void run(){
		System.out.println("book run");
	}
	/*ʹ�÷��Ϲ������Χ�豸*/
	public void useUSB(USB usb){//����һ���ӿ����͵�����
		if(usb!=null){
			usb.open();
			usb.close();
		}
	}
}
//�������
class MouseByUSB implements USB{
	public void open(){
		System.out.println("mouse open");
	}
	public void close(){
			System.out.println("mouse close");
	}
}
//����
class KeyByUSB implements USB{
	public void open(){
		System.out.println("key open");
	}
	public void close(){
			System.out.println("key close");
	}
}
class USBTest{
	public static void main(String[] args){
		NoteBook book=new NoteBook();
		book.run();
		book.useUSB(null);
		book.useUSB(new MouseByUSB());//USB usb=new MouseByUSB()
		book.useUSB(new KeyByUSB());
	}
}