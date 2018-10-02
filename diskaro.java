

import java.util.*;
import java.io.*;


public class diskaro
{
	
	public static void main(String[] arg)
	{


Scanner sc=new Scanner(System.in);


int n,s,e,i;

System.out.println("Enter the range");
n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];



System.out.println("Enter the start and ending limit");
//Enter 0 and 199 for test purposes
s=sc.nextInt();
e=sc.nextInt();


System.out.println("Enter the elements");
for( i=0;i<n;i++)
{
	
	
	a[i]=sc.nextInt();
	
}
System.out.println("Enter the head position");
int head=sc.nextInt();

System.out.println("Enter the algorithm used\n1.FCFS\n2.Scan\n3.Look");
int algo=sc.nextInt();



if(algo==1)
{
	int sum=0;
	for(i=0;i<n;i++)
	{
		
	 b[i]=head-a[i];
	 head=a[i];
	sum=sum+b[i];	
		
	}
	
	System.out.println("The seek length is "+(Math.abs(sum/n)));

	
}
else
if(algo==2)
{
	
	
	int ct1=0;
	if(head-s<e-head)
	{
         	     
         	     //getting all the elemnets between head and starting position
         	      for(i=0;i<n;i++)
	        {
		
	                if(a[i]<head)
	                {
	                	ct1++;
	                }	
		
	        } 
	        int sum=0;
	        int c[]=new int[n];
	        int p1[]=new int[ct1];
	          int p11[]=new int[ct1+1];
	          int p2[]=new int[n-ct1];
	              int p21[]=new int[(n-ct1)+1];
	        int j1=0,j2=0;
	          for(i=0;i<n;i++)
	        {
		
	                if(a[i]<head)
	                {
	                	p1[j1++]=a[i];
	                }
	                else
	                if(a[i]>head)
	                {
	                	p2[j2++]=a[i];
	                	
	                	}	
		
	        }
	        
	        
	        descend_sort(p1);
	        ascend_sort(p2);
	        	System.out.println("The sorted array is ");
	        for(i=0;i<p1.length;i++)
	        {
	        	System.out.print(" "+p1[i]);
	        	
	        }
	        
	            	System.out.println("The ascended sorted array is ");
	        for(i=0;i<p2.length;i++)
	        {
	        	System.out.print(" "+p2[i]);
	        	
	        }
	        
	        
	        
	        
	           for(i=0;i<ct1;i++)
	        {
		
	              p11[i]=head-p1[i];
	              head=p1[i];
	              sum=sum+p11[i];
	              System.out.println("The sum after adding "+p11[i]+" is "+sum);
	        }
	        p11[ct1]=head-0;
	        
	        sum=sum+p11[ct1];
	       System.out.println("The sum at reaching 0 is "+sum);
	        p21[0]=Math.abs(0-p2[0]);
	        sum=sum+p21[0];
	        System.out.println("The sum after adding "+p21[0]+" is "+sum);
	        j1=1;
	        head=p2[0];
	        for( i=1;i<p2.length;i++)
	        {
	        	
	        	p21[j1]=Math.abs(head-p2[i]);
	        	sum=sum+p21[j1];
	        	j1++;
	        	head=p2[i];
	        	
	        	System.out.println("The sum after adding "+p21[i]+" is "+sum);
	        }
	        
	        System.out.println("The sum at reaching max value  is "+sum);
	        System.out.println("The seek length is "+Math.abs(sum/n));
     }
	else
	{
	    //getting all the elemnets between head and starting position
	      for(i=0;i<n;i++)
  {

          if(a[i]>head)
          {
          	ct1++;
          }	

  } 
  int sum=0;
  int c[]=new int[n];
  int p1[]=new int[ct1];
    int p11[]=new int[ct1+1];
    int p2[]=new int[n-ct1];
        int p21[]=new int[(n-ct1)+1];
  int j1=0,j2=0;
    for(i=0;i<n;i++)
  {

          if(a[i]>head)
          {
          	p1[j1++]=a[i];
          }
          else
          if(a[i]<head)
          {
          	p2[j2++]=a[i];
          	
          	}	

  }
  
  
  ascend_sort(p1);
  descend_sort(p2);
  	System.out.println("The sorted array is ");
  for(i=0;i<p1.length;i++)
  {
  	System.out.print(" "+p1[i]);
  	
  }
  
      	System.out.println("The ascended sorted array is ");
  for(i=0;i<p2.length;i++)
  {
  	System.out.print(" "+p2[i]);
  	
  }
  
  
  
  
     for(i=0;i<ct1;i++)
  {

        p11[i]=Math.abs(head-p1[i]);
        head=p1[i];
        sum=sum+p11[i];
        System.out.println("The sum after adding "+p11[i]+" is "+sum);
  }
  p11[ct1]=Math.abs(head-e);
  
  sum=sum+p11[ct1];
 System.out.println("The sum at reaching 0 is "+sum);
  p21[0]=Math.abs(0-p2[0]);
  sum=sum+p21[0];
  System.out.println("The sum after adding "+p21[0]+" is "+sum);
  j1=1;
  head=p2[0];
  for( i=1;i<p2.length;i++)
  {
  	
  	p21[j1]=Math.abs(head-p2[i]);
  	sum=sum+p21[j1];
  	j1++;
  	head=p2[i];
  	
  	System.out.println("The sum after adding "+p21[i]+" is "+sum);
  }
  
  System.out.println("The sum at reaching max value  is "+sum);
  System.out.println("The seek length is "+Math.abs(sum/n));
		
	}
	
	
}

else
if(algo==3)
{
	
	int ct1=0;
	if(head-s<e-head)
	{
         	     
         	     //getting all the elemnets between head and starting position
         	      for(i=0;i<n;i++)
	        {
		
	                if(a[i]<head)
	                {
	                	ct1++;
	                }	
		
	        } 
	        int sum=0;
	        int c[]=new int[n];
	        int p1[]=new int[ct1];
	          int p11[]=new int[ct1+1];
	          int p2[]=new int[n-ct1];
	              int p21[]=new int[(n-ct1)+1];
	        int j1=0,j2=0;
	          for(i=0;i<n;i++)
	        {
		
	                if(a[i]<head)
	                {
	                	p1[j1++]=a[i];
	                }
	                else
	                if(a[i]>head)
	                {
	                	p2[j2++]=a[i];
	                	
	                	}	
		
	        }
	        
	        
	        descend_sort(p1);
	        ascend_sort(p2);
	        
	        
	           for(i=0;i<ct1;i++)
	        {
		
	              p11[i]=head-p1[i];
	              head=p1[i];
	              sum=sum+p11[i];
	              System.out.println("The sum after adding "+p11[i]+" is "+sum);
	        }
	        p11[ct1]=head-0;
	        
	        //sum=sum+p11[ct1];
	       //System.out.println("The sum at reaching 0 is "+sum);
	        p21[0]=Math.abs(head-p2[0]);
	        sum=sum+p21[0];
	        System.out.println("The sum after adding "+p21[0]+" is "+sum);
	        j1=1;
	        head=p2[0];
	        for( i=1;i<p2.length;i++)
	        {
	        	
	        	p21[j1]=Math.abs(head-p2[i]);
	        	sum=sum+p21[j1];
	        	j1++;
	        	head=p2[i];
	        	
	        	System.out.println("The sum after adding "+p21[i]+" is "+sum);
	        }
	        
	        System.out.println("The sum at reaching max value  is "+sum);
	        System.out.println("The seek length is "+Math.abs(sum/n));
     }
	else
	{
	    //getting all the elemnets between head and starting position
	      for(i=0;i<n;i++)
  {

          if(a[i]>head)
          {
          	ct1++;
          }	

  } 
  int sum=0;
  int c[]=new int[n];
  int p1[]=new int[ct1];
    int p11[]=new int[ct1+1];
    int p2[]=new int[n-ct1];
        int p21[]=new int[(n-ct1)+1];
  int j1=0,j2=0;
    for(i=0;i<n;i++)
  {

          if(a[i]>head)
          {
          	p1[j1++]=a[i];
          }
          else
          if(a[i]<head)
          {
          	p2[j2++]=a[i];
          	
          	}	

  }
  
  
  ascend_sort(p1);
  descend_sort(p2);
  	System.out.println("The sorted array is ");
  for(i=0;i<p1.length;i++)
  {
  	System.out.print(" "+p1[i]);
  	
  }
  
      	System.out.println("The ascended sorted array is ");
  for(i=0;i<p2.length;i++)
  {
  	System.out.print(" "+p2[i]);
  	
  }
  
  
  
  
     for(i=0;i<ct1;i++)
  {

        p11[i]=Math.abs(head-p1[i]);
        head=p1[i];
        sum=sum+p11[i];
        System.out.println("The sum after adding "+p11[i]+" is "+sum);
  }
  p11[ct1]=Math.abs(head-e);
  
  sum=sum+p11[ct1];
 System.out.println("The sum at reaching 0 is "+sum);
  p21[0]=Math.abs(0-p2[0]);
  sum=sum+p21[0];
  System.out.println("The sum after adding "+p21[0]+" is "+sum);
  j1=1;
  head=p2[0];
  for( i=1;i<p2.length;i++)
  {
  	
  	p21[j1]=Math.abs(head-p2[i]);
  	sum=sum+p21[j1];
  	j1++;
  	head=p2[i];
  	
  	System.out.println("The sum after adding "+p21[i]+" is "+sum);
  }
  
  System.out.println("The sum at reaching max value  is "+sum);
  System.out.println("The seek length is "+Math.abs(sum/n));
		
	}
	
}


	}
	//sorting in descending order
	public static void descend_sort(int p1[]){
	int temp;
	for(int i=0;i<p1.length;i++)
	{
		
		for(int j=0;j<p1.length;j++)
		{
			
			if(p1[i]>p1[j])
			{
				temp=p1[i];
				p1[i]=p1[j];
				p1[j]=temp;
				
		     }
		}
	}
	
	}
	//sorting in ascending order
	
	
		public static void ascend_sort(int p1[]){
	int temp;
	for(int i=0;i<p1.length;i++)
	{
		
		for(int j=0;j<p1.length;j++)
		{
			
			if(p1[i]<p1[j])
			{
				temp=p1[i];
				p1[i]=p1[j];
				p1[j]=temp;
				
		     }
		}
	}
	
	}
	

}
