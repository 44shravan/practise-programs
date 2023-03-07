package com.practise.practise_programs;

public class ContinueTest {
public static void main(String[] args) {
	 //for loop  
    for(int i=1;i<=10;i++){  
        if(i==5){  
            //using continue statement  
            continue;//it will skip the rest statement  
        }  
        System.out.println(i);  
    }  
    aa:  
        for(int i=1;i<=3;i++){    
                bb:  
                for(int j=1;j<=3;j++){    
                    if(i==2&&j==2){    
                        //using continue statement with label  
                        continue aa;    
                    }    
                    System.out.println(i+" "+j);    
                }    
        }    
}
}

/*The continue statement is used in loop control structure when you need to jump to the next iteration of the loop immediately. It can be used with for loop or while loop.
*/