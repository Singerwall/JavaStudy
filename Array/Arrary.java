import java.util.Scanner;
/*
�����Ƕ��󣺸ö��󱣴�һ���������û�ֱ��ֵ

		//������һ���ֶ�length,��ʾ�����������Դ洢����Ԫ�ؼ�����ĳ���
		//�������鱣��������ã�����������������ֱ�ӱ�������������͵�ֵ
		//�����ɵ���������������е������Զ���ʼ��Ϊnull,�������������Ա�и���Ĭ��ֵ����ֵ��0���ַ�����char��0,������false��

		���õ���������㷨
		1.���Բ��ҷ�

		Arrays:jdk���ṩ��һ��Arrays�����࣬
*/
public class Arrary 
{
	public static void main(String[] args) 
	{
		//�������� �������� ���� ������;
		//���鴴��
        //int[] num=new int[40];
		//��ʼ�����飺Ϊ�����еĳ�Աһһ��ֵ
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


		System.out.println("���Բ���");
		System.out.println("������Ҫ���ҵ���");
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
			System.out.println("���ҵ���"+number+"��������"+index+"λ");
			}




            //arrayֻ��һ������
			//ֻ��ջ�з����� 3���ռ�(���ڱ���һά����ĵ�ַ) ��ָ������
			int[][] array = new int [3][];
			//ÿ����ά������ָ��һ����ά��int����
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

	//��̬�����������࣬����ֱ��ʹ������.����()����,��ͬһ�����п���ֱ��ʹ�÷����������øþ�̬����
	//�������� static ���� �������������б�
	//{
		//d������
	//}
	public static void printfArray(int [] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}

}


