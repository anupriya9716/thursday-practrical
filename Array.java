import java.util.Arrays;
import java.util.Scanner;

class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;   
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();   
        
        Integer arr[]=new Integer[n];   
        System.out.println("input the elements of the array :");
        for(int i=0;i<n;i++)     
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("input the element you want to remove ");
        int elem = sc.nextInt();
    
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == elem)   
      {
        for(int j = i; j < arr.length - 1; j++)
        {
            arr[j] = arr[j+1];
        }
        break;
      }
    }
      
       System.out.println("Elements after deletion " );
       for(int i = 0; i < arr.length-1; i++)
       {
             System.out.print(arr[i]+ " ");
       }  
    }
}