package Thread.test;

class Table{  
	/*synchronized static*/ void printTable(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class SynchronisationTest{  
public static void main(String args[]){  
Table obj = new Table();//only one object  
//Table obj1 = new Table();
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj); 
//MyThread2 t2=new MyThread2(obj1);   /* When static is used whole class is thread safe other wise only single object */
t1.start();  
t2.start();  
}  
}  