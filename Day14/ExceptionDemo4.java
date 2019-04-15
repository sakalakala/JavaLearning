class ExceptionDemo4{//此处不需要声明，因为声明是用来预防的，是告诉你有可能有问题要不然要抛要不然要捕获
					//当运行时问题很严重时可以不要声明直接抛，这样程序运行不下去
	public static void main(String[] args){
		int[] arr=new int[3];
		arr=null;
		System.out.println("element:"+getElement(arr,-2));
	}
	//定义一个功能，返回整型数组中指定位置的元素
	public static int getElement(int[] arr,int index){
		if(arr==null)
			throw new NullPointerException("数组实体不存在");
		if(index<0){
			throw new ArrayIndexOutOfBoundsException(index+"角标不存在");
		}
		int element=arr[index];
		return element;
	}
}