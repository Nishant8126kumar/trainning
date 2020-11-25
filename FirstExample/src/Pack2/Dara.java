package Pack2;

import java.util.Scanner;

public class Dara {
    Scanner scan=new Scanner(System.in);
    int arr[],size;
//    public void getData()
//    {
//        System.out.println("Enter the Size Of Array");
//        size=scan.nextInt();
//        arr=new int[size];
//        System.out.println("Enter the Array Element");
//        for (int i=0;i<arr.length;i++)
//        {
//            arr[i]=scan.nextInt();
//        }
//        System.out.println("Your Entered Data is");
//        for (int i=0;i< arr.length;i++) {
//            System.out.println(arr[i]);
//        }
//        for (int i=0;i<arr.length;i++)
//        {
//            for (int j=0;j<arr.length-1-i;j++)
//            {
//                if (arr[j]>arr[j+1])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//
//            }
//        }
//        System.out.println("Sorted Data is=:");
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
    public void display()
    {
        System.out.println("Enter size");
        size=scan.nextInt();
        arr=new int[size];
        System.out.println("Enter Element");
        for (int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        int max=arr[0],second=0;
        for (int i=0;i<size;i++)
        {
            if(max<arr[i])
            {
                second=max;
                max=arr[i];
            }
        }
        System.out.println("Max=:"+max);

    }
    public static void main(String args[])
    {
        Dara a1=new Dara();
        a1.display();
    }
}
