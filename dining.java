package trial;

import java.util.*;

import java.util.Scanner;
import java.io.*;

public class dining
{

public static void main(String[] args)
{
	int i;

	Scanner sc=new Scanner(System.in);
	philosopher p[]=new philosopher[5];
	philosopher p1=new philosopher(1);
	philosopher p2=new philosopher(2);
	philosopher p3=new philosopher(3);
	philosopher p4=new philosopher(4);
	philosopher p5=new philosopher(5);
	
	p[0]=p1;
	p[1]=p2;
	p[2]=p3;
	p[3]=p4;
	p[4]=p5;
	
	int priority[]=new int[5];
	//cnsidering round robin for two solutions
	
	char forks[]=new char[5];
	
	for(i=0;i<5;i++)
	{
		
		priority[i]=i+1;
	}
	
	int ascii=97;
	
	
	
	
	
	
	
	
	
	System.out.print(" Enter the roun robin time ");
	
	
	//int rr=sc.nextInt();
	p[0].run();

//setting fork numbers
p1.setforks(5,1);
p2.setforks(1,2);
p3.setforks(2,3);
p4.setforks(3,4);
p5.setforks(4,5);

System.out.println("The forks  assigned to  ");

for(int k=0;k<5;k++)
{
	System.out.println("Philosopher "+(k+1)+" is "+p[k].a+" and "+p[k].b);
	
}

int loop1=10,loop2=10;


//initialising check array
int check[]=new int[5];
int m=0;
for(int j=0;j<5;j++){check[j]=10;}



for(int l1=0;l1<5;l1++)
{
	for(int l2=0;l2<5;l2++)
{
		loop1=checkarray(check,l1);
		loop2=checkarray(check,l2);
		if(l1!=l2&&loop1==0&&loop2==0)
		{
	if((p[l1].b!=p[l2].a&&p[l1].a!=p[l2].b))
	{
	System.out.println("At this time "); 
		
		
		p[l1].run();
		
		p[l2].run();
		
		check[m++]=l1;
		check[m++]=l2;
		p[l1].stopeating();
		p[l2].stopeating();
		
		
	}
		}
		//end of inner loop
}

//end of outer loop
}


int ret;
for(int j=0;j<5;j++)
{
	if(checkarray(check, j)==0)
			{
		System.out.println("At this time "); 
		        p[j].run();
		        p[j].stopeating();
			}
}



	
	
}

public static int checkarray(int ar[],int a)
{int m=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]==a)
		{
			m=1;
		}
	}
	if(m==1)
	{
		return 1;
	}
	else
	return 0;
}

}






 class philosopher extends Thread{


public  int pri;
public int a,b;
public  philosopher(int p)
{
	 this.pri=p;
}

public void run()
{
	
	System.out.println("Philosopher "+pri+" is eating.");
	
}
public void setforks(int c,int d)
{
	this.a=c;
	this.b=d;
	
	
	
	
}
public void stopeating()
{
	System.out.println("Philosopher "+pri+" has finished eating.");
	
}

}
