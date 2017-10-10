package trial;

import java.util.*;
import java.io.*;

public class bankeraro
{
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of processes and resources");
		int nop=sc.nextInt();
		int nor=sc.nextInt();
	  
	  int allocate[][]=new int[nop][nor];
	  int max[][]=new int[nop][nor];
	  int need[][]=new int[nop][nor];
	  int available[][]=new int[nop][nor];
	  int avail[]=new int[nor];
	  
	 int i,j,k;
	 System.out.println("Enter the allocations of "+nop+" processes");
	 for(i=0;i<nop;i++)
	 {
		 for(j=0;j<nor;j++)
	 {
	 	
	 	allocate[i][j]=sc.nextInt();
	 }
	 }
	 
	 
	  System.out.println("Enter the max requirement of "+nop+" processes");
	 
	 	 for(i=0;i<nop;i++)
	 {
	 	
	 		 for(j=0;j<nor;j++)
	 {
	 	
	 	max[i][j]=sc.nextInt();
	 	}
	 }
	 
	 
	 
	 
	 
	 	 	 for(i=0;i<nop;i++)
	 {
	 	
	 		 for(j=0;j<nor;j++)
	 {
	 	
	 	need[i][j]=max[i][j]-allocate[i][j];
	 	}
	 }
	 int t=0;
	 
	 int count1=0,count2=0,count3=0;
	 
	 System.out.println("Enter available matrix");
	 int count=0;
 for(i=0;i<nor;i++)
	 {
	 avail[i]	=sc.nextInt();
	 
	 	}
	 	
	 //Input finished	
	 
	 	
	 int ct1=0;
	 
	 //initializing of array
	 int arr[]=new int[nop];
	 arr[0]=99;
	 for(i=0;i<arr.length;i++)
	 {
		 arr[i]=99;
	 }
	 
	 
	 for(int cu=0;cu<nop;cu++)
	 
	 {i=0;
	  for(i=0;i<nop;i++)
	 {
	 	
	 	if(hasvalue(i,arr)!=1)
	 	{	
	 		for(j=0;j<nor;j++)
	 {
	 	if(need[i][j]>avail[j])
	 	{
	 		
	 	ct1++;	
	 	}
	 }
	 	
	 	
	 	
	 	
	 	// System.out.println("\n ct value is "+ct1);
	 	if(ct1>0)
	 	
	 	{
	 	 System.out.println("Process "+i+" cannot be allocated now  ");	
	 	}
	 	
	 	
	 	
	 	
	 	
	 	else if(ct1==0)
	 	{
	 		System.out.println("Process "+i+" is  allocated now  ");	
	 		for(int m=0;m<nor;m++)
	 		{
	 		
	 		avail[m]=avail[m]+allocate[i][m];
	 		}
	 		
	 		
	 		
	 		System.out.println("the new available matrix is ");	
	        for(int m=0;m<nor;m++)
	 		{
	 		
	 		System.out.print(" "+avail[m]);
	 	    }
	        System.out.println();
	        arr[t++]=i;
	      /*  
	        System.out.println("The array elements are");
			  //display of array
			  for(i=0;i<arr.length;i++)
			  {
				  System.out.print(""+arr[i]);
			  }*/
	   }
	 		ct1=0;
	 		count1++;
	 		
	 }
	 	
	 	
	 }
	  
//end of external forloo
	  
	  	 	 }
	 
	 
	 
	 
	 
	 //Displaying all the matrices
	 
	 
	  System.out.println("The allocation matrix");
	 
	 
	 	 	 for(i=0;i<nop;i++)
	 {
	 	
	 		 for(j=0;j<nor;j++)
	 {
	 	
	 	System.out.print(" "+allocate[i][j]);
	 	}
	 		System.out.println();
	 }
	 
	  System.out.println("The max  matrix");
	 
	 	 
	 
	 	 	 for(i=0;i<nop;i++)
	 {
	 	
	 		 for(j=0;j<nor;j++)
	 {
	 	
	 	System.out.print(" "+max[i][j]);
	 	}
	 		System.out.println();
	 }
	 
	 	
	 	 	 
	 	 	 System.out.println("The need matrix");
	 
	 
	 	 	 for(i=0;i<nop;i++)
	 {
	 	
	 		 for(j=0;j<nor;j++)
	 {
	 	
	 	System.out.print(" "+need[i][j]);
	 	}
	 		System.out.println();
	 }
	 
	  	
	 	
	}
	
	public static int hasvalue(int k,int arr[])
	{
		int ht=0;
		
		for(int h=0;h<arr.length;h++)
		{
			
			
			if(arr[h]==k)
			{
				ht++;
			}
		}
		if(ht>0)
		{
			
			return 1;
		}
		else
		return 0;
		
		
	}
	
}