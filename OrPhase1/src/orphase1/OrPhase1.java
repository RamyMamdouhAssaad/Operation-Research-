
package orphase1;
import java.util.Scanner;
public class OrPhase1 {

    public static void main(String[] args) {
        int coloumn , row ; 
	int choice=0 ; 
	Scanner in = new Scanner(System.in);
        System.out.println("First we will start by intalizing the main matrix");
        System.out.println("Since Matrix is of float type so it will appear as X.x(5.0)");
	System.out.println("please enter the size of matrix row : ");
	row= in.nextInt() ;
	System.out.println("please enter the size of matrix coloumn : ");
	coloumn=in.nextInt() ; 
	MyMatrix use= new MyMatrix(row,coloumn) ; 
	use.setValues();
	System.out.println("There are multiple operations to do , if you are intrested in anyone just press the number beside it");
	System.out.println("And if you want to exit the program just press (0)");
	System.out.println("0.exit");
	System.out.println("1.transpose");
	System.out.println("2.Scalar Multiply");
	System.out.println("3.Sum(must enter another matrix to add them together)");
	System.out.println("4.Multiply(must enter another matrix to multiply them together)");
	System.out.println("5.Symmetric");
	System.out.println("6.equals(must enter another matrix to compare)");
	System.out.println("7.valid for Multiplcation(must enter another matrix to check if they can be multiplied together)");
	System.out.println("8.Zero Matrix");
	System.out.println("9.Identity matrix");
	System.out.println("10.Display");
	System.out.println("11.Set Values");
	System.out.println("12.Inverse(set values inside matrix through problem)");
	choice=in.nextInt() ;
	while (choice!=0)
	{

		if(choice ==1 )
		{
			use.myMatrixtranspose() ;
		}
		else if (choice ==2 )
		{
			System.out.println("please enter the number to be multiplied to the matrix");
			float scalarvalue ; 
			
			scalarvalue=in.nextInt() ;
			use.myMatrixScalarMultiply(scalarvalue);
		}
		else if(choice==3)
		{
					System.out.println("please enter the size of matrix row : ");
					int row1= in.nextInt() ;
					System.out.println("please enter the size of matrix coloumn : ");
					int coloumn1=in.nextInt() ; 
					float [][]a=new float[row1][coloumn1] ;
				
			for(int i =0 ; i<row1 ; i++)
			{
					
					for(int j=0 ; j<coloumn1 ; j++)
					{
						System.out.println("enter the matrix["+i+"]["+j+"]") ; 
						float value =in.nextFloat();
                                               a[i][j]= value ;
					}
		
			}
			use.myMatrixSum(a, row1, coloumn1);
		}
		else if(choice==4)
		{	
			
					System.out.println("please enter the size of matrix row : ");
					int row2= in.nextInt() ;
					System.out.println("please enter the size of matrix coloumn : ");
					int coloumn2=in.nextInt() ; 
					float [][]b=new float[row2][coloumn2] ;
			for(int i =0 ; i<row2 ; i++)
			{
					
					for(int j=0 ; j<coloumn2 ; j++)
					{
						System.out.println("enter the matrix["+i+"]["+j+"]") ;
						float value =in.nextFloat();
                                                b[i][j]= value ;
					}
		
			}
			use.myMatrixMultiply(b) ;
		}
		else if(choice ==5)

		{

			use.isSymmetric() ; 

		}
		else if(choice ==6)
		{
					System.out.println("please enter the size of matrix row : ");
					int row3= in.nextInt() ;
					System.out.println("please enter the size of matrix coloumn : ");
					int coloumn3=in.nextInt() ; 
					float [][]c=new float[row3][coloumn3] ;
			for(int i =0 ; i<row3 ; i++)
			{
					
					for(int j=0 ; j<coloumn3 ; j++)
					{
						System.out.println("enter the matrix["+i+"]["+j+"]") ; 
						float value =in.nextFloat();
                                                  c[i][j]= value ;
					}
		
			}

			use.equals(c); 
		}
		else if(choice==7)
		{
			
			
					System.out.println("please enter the size of matrix row : ");
					int row4= in.nextInt() ;
					System.out.println("please enter the size of matrix coloumn : ");
					int coloumn4=in.nextInt() ; 
					float [][]d=new float[row4][coloumn4] ;
			
			use.validforMultiplcation(d) ;
		}

		else if (choice ==8)
		{
			System.out.println("please enter the size of matrix row : ");
			int row5= in.nextInt() ;
			System.out.println("please enter the size of matrix coloumn : ");
			int coloumn5=in.nextInt() ; 
			float [][] f=use.MyMatrixZeroMatrix(row5,coloumn5) ;
				for(int i =0 ; i<row5 ; i++)
				{
					for(int j=0 ; j<coloumn5 ; j++)
					{
					System.out.print(f[i][j]+"      ");
					}
					System.out.println() ;
				}


		}

		else if (choice==9)
		{	
			
			System.out.println("please enter the size of matrix row or coloumn : ");
			int rc= in.nextInt() ;
			float [][] f=use.MyMatrixIdentityMatrix(rc) ; 
			for(int i =0 ; i<rc ; i++)
				{
					for(int j=0 ; j<rc ; j++)
					{
					System.out.print(f[i][j]+"      ");
					}
					System.out.println() ;
				}


		}

		
		else if(choice==10)
		{
			use.display() ; 
		}

		else if (choice==11)
		{
				System.out.println("please enter the size of matrix row : ");
				int row11= in.nextInt() ;
				System.out.println("please enter the size of matrix coloumn : ");
				int coloumn11=in.nextInt() ; 
				use=new MyMatrix(row11,coloumn11); 
				use.setValues() ;
                               

		}

		else if (choice==12)
		{

			System.out.println("Must be size 2*2 or 3*3 otherwise it wont work : ");
			System.out.println("please enter the size of matrix row : ");
			int row12= in.nextInt() ;
			System.out.println("please enter the size of matrix coloumn : ");
			int coloumn12=in.nextInt() ; 
			use=new MyMatrix(row12,coloumn12);
			use.setValues() ; 
                        use.MyMatrixInverse();
		}
		else 
		{
			System.out.println("Invalid input");
			System.out.println("There are multiple operations to do , if you are intrested in anyone just press the number beside it");
			System.out.println("And if you want to exit the program just press (0)");
			System.out.println("0.exit");
			System.out.println("1.transpose");
			System.out.println("2.Scalar Multiply");
			System.out.println("3.Sum(must enter another matrix to add them together)");
			System.out.println("4.Multiply(must enter another matrix to multiply them together)");
			System.out.println("5.Symmetric");
			System.out.println("6.equals(must enter another matrix to compare)");
			System.out.println("7.valid for Multiplcation(must enter another matrix to check if they can be multiplied together)");
			System.out.println("8.Zero Matrix");
			System.out.println("9.Identity matrix");
			System.out.println("10.Display");
			System.out.println("11.Set Values");
			System.out.println("12.Inverse(set values inside matrix through problem)");
			choice=in.nextInt() ;

		}
                
               
			System.out.println("0.exit");
			System.out.println("1.transpose");
			System.out.println("2.Scalar Multiply");
			System.out.println("3.Sum(must enter another matrix to add them together)");
			System.out.println("4.Multiply(must enter another matrix to multiply them together)");
			System.out.println("5.Symmetric");
			System.out.println("6.equals(must enter another matrix to compare)");
			System.out.println("7.valid for Multiplcation(must enter another matrix to check if they can be multiplied together)");
			System.out.println("8.Zero Matrix");
			System.out.println("9.Identity matrix");
			System.out.println("10.Display");
			System.out.println("11.Set Values");
			System.out.println("12.Inverse(set values inside matrix through problem)");
			choice=in.nextInt() ;
		}

	}

    }
    
