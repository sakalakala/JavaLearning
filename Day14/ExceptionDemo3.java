class Demo{
	int div(int a,int b)//throws Exception{//�д���ʱ����Exception
		if(b==0)
			throw new ArithmeticException("������0��");//throw��s����Exception�����ࣩҲ����
		return a/b;
	}
}
class ExceptionDemo2{
	public static void main(String[] args)throws Exception{�����쳣
		Demo d=new Demo();
		int num=d.div(4,0);
		System.out.println("num="+num);//������Ӧ�Ĵ���ȫ���Ž�ȥ
		System.out.println("over");
	}
}