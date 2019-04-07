class Test4
{
	public static void main(String[] args){
		int[][] arr={{23,17,11},{88},{10,5,999,63}};
		//1.二维数组的求和
		int sum=0;
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				sum+=arr[x][y];
			}
		}
		System.out.println("sum="+sum);
		//2.插入元素
		int[] arr1={9,13,17,22,31,46,58,77};
		int index=binarySearch(arr1,49);
		System.out.println(index);
	}
	//数组翻转
	public static void reverse(int[] arr){
		for(int start=0,end=arr.length-1;start<end;start++,end--){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
	//往有序的数组中插入一个元素并继续保证有序，问如何获取该位置
	public static int binarySearch(int[] arr,int key){
		int max,min,mid;
		min=0;
		max=arr.length-1;
		while(min<=max){
				mid=(min+max)>>1;
				if(key>arr[mid])
					min=mid+1;
				else if(key<arr[mid])
					max=mid-1;
				else
					return mid;
				}
			return min;
	}
}