class ExceptionDemo4{//�˴�����Ҫ��������Ϊ����������Ԥ���ģ��Ǹ������п���������Ҫ��ȻҪ��Ҫ��ȻҪ����
					//������ʱ���������ʱ���Բ�Ҫ����ֱ���ף������������в���ȥ
	public static void main(String[] args){
		int[] arr=new int[3];
		arr=null;
		System.out.println("element:"+getElement(arr,-2));
	}
	//����һ�����ܣ���������������ָ��λ�õ�Ԫ��
	public static int getElement(int[] arr,int index){
		if(arr==null)
			throw new NullPointerException("����ʵ�岻����");
		if(index<0){
			throw new ArrayIndexOutOfBoundsException(index+"�Ǳ겻����");
		}
		int element=arr[index];
		return element;
	}
}