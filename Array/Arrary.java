import java.util.Scanner;
/*
数组是对象：该对象保存一组其他引用或直接值

		//数组有一个字段length,表示此数组对象可以存储多少元素即数组的长度
		//对象数组保存的书引用，基本数据类型数组直接保存基本数据类型的值
		//新生成的数组对象，其中所有的引用自动初始化为null,基本类型数组成员有个字默认值（数值：0；字符：（char）0,布尔：false）

		常用的数组查找算法
		1.线性查找法

		Arrays:jdk中提供了一个Arrays工具类，
*/
public class Arrary 
{
	public static void main(String[] args) 
	{
		//数组声明 数据类型 【】 数组名;
		//数组创建
        //int[] num=new int[40];
		//初始化数组：为数组中的成员一一赋值
		//int[] score ={66,44,88};
		//int[] score =new int[]{66,44,88}
		int []score =new int[3];
		Scanner input = new Scanner (System.in);
		for(int i =0;i<3;i++)
		{
			score[i]=input.nextInt();
		}

		System.out.println(score.length);

		for(int i = 0;i<score.length;i++)
		{
		System.out.println(score[i]);
		}

		int [] arr={10,20,30,45,78,90,45,46,8,9,8};


		System.out.println("线性查找");
		System.out.println("请输入要查找的数");
		Scanner input2 = new Scanner(System.in);
		int number = input2.nextInt();
		int index = -1;
		for(int i= 0;i<arr.length;i++)
		{
			if(arr[i]== number)
			{
				index = i;
				
			}

		}
		if(index != -1)
			{
			System.out.println("查找的数"+number+"在数组中"+index+"位");
			}




            //array只是一个引用
			//只在栈中分配了 3个空间(用于保存一维数组的地址) ：指向数组
			int[][] array = new int [3][];
			//每个高维的数组指向一个低维的int数组
			array[0]= new int[2]; //
		    array[1]= new int[3] ;//
		    array[2]= new int[4] ;//

			array[0][0]=1;
			array[0][1]=2;
			array[1][0]=3;
		    array[1][1]=4;
			array[1][2]=5;
		    array[2][0]=6;
			array[2][1]=7;
			array[2][2]=8;
			array[2][3]=9;
            for(int i= 0;i<array.length;i++)
		    {
				for(int j=0;j<array[i].length;j++)
				{
					System.out.println(array[i][j]);
				}
			}
				
}

	//静态方法：属于类，可以直接使用类名.方法()调用,在同一个类中可以直接使用方法名来调用该静态方法
	//访问修饰 static 类型 方法名（参数列表）
	//{
		//d方法体
	//}
	public static void printfArray(int [] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}

}


