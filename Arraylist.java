

package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {

public static void main(String[] args) {
    ArrayList<String>name=new ArrayList();
    Scanner micheal=new Scanner(System.in);
     System.out.println("enter student(enter exit when done");
     int x=1;
     while(true){
         System.out.println("student name:"+x+":");
         String y=micheal.next();
         if(y.toLowerCase().equals("exit"))
             break;
         else
         {
             int mark[] = new int[6];
        int i;
        String grd;
        float sum=0, avg;
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first course unit");	
        String a = scan.next();
        System.out.println("Hve entered " + a);	
        
        System.out.println("Enter the second course unit");	
        String b = scan.next();
        System.out.println("Hve entered " + b);	
        
        System.out.println("Enter the third course unit");	
        String c = scan.next();
        System.out.println("Hve entered " + c);
        
        System.out.println("Enter fourth course unit");	
        String d = scan.next();
        System.out.println("Hve entered " + d);	
        
        System.out.println("Enter the fifth course unit");	
        String e = scan.next();
        System.out.println("Hve entered " + e);
        
        System.out.println("Enter the sixth course unit");	
        String f = scan.next();
        System.out.println("Hve entered " + f);	
        
        System.out.print("Enter Marks Obtained in above 6 course units : ");
        for(i=0; i<6; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
		
        avg = sum/6;
		
        System.out.print("Your Grade is " + avg);
         name.add(y);
         x++;
         
         }
     }
}
}


         
     
    
    

