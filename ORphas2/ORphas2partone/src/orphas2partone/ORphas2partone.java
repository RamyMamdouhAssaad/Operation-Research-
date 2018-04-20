
package orphas2partone;
import java.util.Scanner;

public class ORphas2partone {

    public static void main(String[] args) {
       int n=0; 
       int choice ; 
       float []left ; 
       float right ; 
       char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       Scanner in = new Scanner(System.in);
       System.out.println("Welcome to the linear equation program");
       System.out.println("Please enter the number of variables on the equation");
       n=in.nextInt() ;
       System.out.println("Please enter the (real) coefficients of \n" +
       "the n variables in the equation. ");
       left=new float[n];
       
       for(int i =0 ;i<n ; i++ )
       {
           System.out.println("please enter the value for variable "+alphabet[i]);
           left[i]=in.nextFloat();
       }
       System.out.println("Please enter the number representing the (real) absolute value of the equation");
       right=in.nextFloat();
       MyEquation myequation=new MyEquation(n,left,right);
       System.out.println("Please select one of the operations to be done on the equation");
       System.out.println("Press 1 to Multiply equation By X ");
       System.out.println("Press 2 to Sum the equation with another equation (must be of same size)");
       System.out.println("Press 3 to displays the invoking equation in the normal \n" +
       "form of an equation ");
       System.out.println("Press 4 to Set the values of the equation ");
       System.out.println("Press 5 to enter new linear equation ");
       System.out.println("Press 0 to exit ");
       choice=in.nextInt() ; 
      while (choice !=0)
      {
       switch(choice)
       {
           case 1:
           System.out.print("please enter the Number to be multiplied by equation :");
           float  x;
           x=in.nextFloat();
           MyEquation multiply=myequation.multiplyBy(x);
           System.out.println("The new equation after multiplying with "+ x  );
           multiply.display() ; 
               break ;
           case 2:
               int number ;
               float []leftsum ; 
               float rightsum ; 
               MyEquation Sum ;
               MyEquation e ;
               System.out.println("Please enter the number of variables on the equation to be summed with the other equation");
               number=in.nextInt() ;
               if(number==myequation.n)
               {
               System.out.println("Please enter the (real) coefficients of \n" +
               "the n variables in the equation. ");
               leftsum=new float[number];

                for(int i =0 ;i<number ; i++ )
                {
                    System.out.println("please enter the value for variable "+alphabet[i]);
                    leftsum[i]=in.nextFloat();
                }
                System.out.println("Please enter the number representing the (real) absolute value of the equation");
                rightsum=in.nextFloat();
                e =new MyEquation(number,leftsum,rightsum);
                Sum =myequation.sumWith(e);
       
                System.out.println("The new equation after both are added together" );
                Sum.display();
               }
               else
               {
                System.out.println("not valid");   
               }
               break;
           case 3:
               System.out.println("The equation displayed : " );
               myequation.display() ; 
               break ;
               
           case 4:
               System.out.println("Please enter the (real) coefficients of \n" +
               "the n variables in the equation. ");
               leftsum=new float[n];

                for(int i =0 ;i<n ; i++ )
                {
                    System.out.println("please enter the value for variable "+alphabet[i]);
                    leftsum[i]=in.nextFloat();
                }
                System.out.println("Please enter the number representing the (real) absolute value of the equation");
                rightsum=in.nextFloat();
               myequation.setValues(leftsum, rightsum);
               break ; 
           case 5:   
               float []leftsums ; 
               float rightsums ; 
               System.out.println("Please enter the number of variables ");
               n=in.nextInt() ;
               System.out.println("Please enter the (real) coefficients of \n" +
               "the n variables in the equation. ");
               leftsums=new float[n];

                for(int i =0 ;i<n ; i++ )
                {
                    System.out.println("please enter the value for variable "+alphabet[i]);
                    leftsums[i]=in.nextFloat();
                }
                System.out.println("Please enter the number representing the (real) absolute value of the equation");
                rightsums=in.nextFloat();
               myequation =new MyEquation(n,leftsums,rightsums);
               System.out.println("The new equation :");
               myequation.display() ; 
              break ; 
           default :
               System.out.println("Number wasn't recognized");
               System.out.println("Please select one of the operations to be done on the equation");
               System.out.println("Press 1 to Multiply equation By X ");
               System.out.println("Press 2 to Sum the equation with another equation (must be of same size) ");
               System.out.println("Press 3 to displays the invoking equation in the normal \n" +
       "form of an equation ");
       System.out.println("Press 4 to Set the values of the equation ");
       System.out.println("Press 5 to enter new linear equation ");
       
       
       }
   
       System.out.println("Please select one of the operations to be done on the equation");
       System.out.println("Press 1 to Multiply equation By X ");
       System.out.println("Press 2 to Sum the equation with another equation (must be of same size) ");
       System.out.println("Press 3 to displays the invoking equation in the normal \n" +
       "form of an equation ");
       System.out.println("Press 4 to Set the values of the equation ");
       System.out.println("Press 5 to enter new linear equation ");
       System.out.println("Press 0 to exit ");
       choice=in.nextInt() ;
       
      }
       
       
        
    }
    
}
