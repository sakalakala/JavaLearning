class Demo{
	int div(int a,int b)throws Exception{//�д���ʱ����Exception
		if(b==0)
			throw new ArithmeticException("������0��");//throw��s
		return a/b;
	}
}
class ExceptionDemo2{
	public static void main(String[] args){//throws Exception{�����쳣
		Demo d=new Demo();
		try{
			int num=d.div(4,0);
			System.out.println("num="+num);//������Ӧ�Ĵ���ȫ���Ž�ȥ
		}
		catch(Exception e){//��ʲô����ʲô
			System.out.println("�쳣");
			System.out.println(e.getMessage());//�쳣ԭ��
			System.out.println(e.toString());//�쳣����+�쳣λ��
			e.printStackTrace();//����+��Ϣ+λ�ã�jvmĬ�ϴ����յ��쳣���ǵ��ô˷���
		}
		System.out.println("over");
	}
}