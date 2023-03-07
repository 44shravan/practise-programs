package com.practise.practise_programs;

public class CallByValue {
	int data=50;  
	  
	 void change(int data){  
		 data=data+100;
	 //this.data=data+100;//changes will be in the local variable only  
	 }  
	 
	 void change(CallByValue op2){  
		 op2.data=op2.data+100;//changes will be in the instance variable  -- call by reference
		 }  
	     
	 public static void main(String args[]){  
		 CallByValue op=new CallByValue();  
		 CallByValue o=new CallByValue();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	   o.change(o);
	   System.out.println("after change "+o.data); 
	  // System.out.println(data);
	   
	 }  
}
