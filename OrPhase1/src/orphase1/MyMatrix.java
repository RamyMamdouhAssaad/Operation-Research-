
package orphase1;

import java.util.Scanner;

public class MyMatrix {
public int row ; 
public int coloumn; 
float[][] matrix ;
Scanner in = new Scanner(System.in);

public MyMatrix(int row1 , int coloumn1 ) 
{
     row=row1 ; 
     coloumn=coloumn1 ; 
     matrix = new float[row][coloumn];
    for(int i =0 ; i<row ; i++)
        {
    for(int j =0 ; j<coloumn ; j++)
    {
        matrix[i][j]=0;
    }
}
    }

void myMatrixtranspose() 
{
	float swap ; 
	float [][]transposematrix=new float[row][coloumn];
      /* if want to change in the same matrix swap is done
        for(int rowcounter= 0 ; rowcounter<row ;rowcounter++)
		for(int coloumncounter=rowcounter+1 ; coloumncounter<coloumn ; coloumncounter++) 
		{
			swap =matrix [rowcounter][coloumncounter] ; 
			matrix [rowcounter][coloumncounter]=matrix[coloumncounter][rowcounter];
			matrix[coloumncounter][rowcounter]=swap ; 

		}
              
              
              */
        for(int i =0  ; i<row ; i++)
        {
         for(int j=0 ; j<coloumn ; j++)
         {
             transposematrix[i][j]=matrix[j][i];
         }
            
        }

		for(int i =0 ; i<row ; i++)
		{
			for(int j=0 ; j<coloumn ; j++)
			{
				System.out.print(transposematrix[i][j]+"    ");
			}
			System.out.println() ;  
		}


}
void myMatrixScalarMultiply(float K)
{
    float [][]scalar=new float[row][coloumn];
	for(int i=0 ; i<row ; i++)
	{
		for(int j =0 ; j<coloumn ; j++)

		{
			scalar[i][j]=matrix[i][j]*K ;
			
		}

	}

	for(int i =0 ; i<row ; i++)
		{
			for(int j=0 ; j<coloumn ; j++)
			{
				System.out.print(scalar[i][j]+"    ") ; 
			}
			System.out.println(" ") ; 
		}

}

void myMatrixSum(float [][]a,int rowsize,int coloumnsize)
{
    
	if(coloumn==coloumnsize &&row==rowsize )
	{
		float [][]sumArray=new float[row][coloumn];
		for(int i=0 ; i<row ; i++)
		{
			for(int j=0  ;j<coloumn ; j++)
			{
				sumArray[i][j]=matrix[i][j]+a[i][j];

			}

		}
			for(int i =0 ; i<row ; i++)
			{
				for(int j=0 ; j<coloumn ; j++)
				{
				System.out.print(sumArray[i][j]+"    ") ; 
				}
			System.out.println() ; 
			}

	}

	else
	{

		System.out.println("sorry canot do this procedure as the matrix size is not equal");  
	}

}

void myMatrixMultiply(float [][]a)
{
	 int coloumnsize=a[0].length; // size of coloumn
	 int rowsize= a.length; // size of row

	float[][] multiplyMatrix=new float[row][coloumnsize];
	if(coloumn==rowsize)

	{
		for(int k =0 ; k<row ; k++)
		{
			for(int i =0 ; i<coloumnsize ; i++)
			{
				float sum=0 ; 
				for(int j =0 ; j<rowsize ; j++)
				{
					sum = sum +(matrix[k][j]*a[j][i]);
                                        multiplyMatrix [k][i]=sum ; 
				}
			}
		}
		for(int i =0 ; i<row ; i++)
			{
				for(int j=0 ; j<coloumnsize ; j++)
				{
				System.out.print(multiplyMatrix[i][j]+"    ") ; 
				}
			System.out.println() ; 
			}
	}
	else

	{

		System.out.println("invalid operation") ; 
	}

}

void isSymmetric ()
{
	boolean symmetric =true  ;
	for(int i =0 ; i<row ; i++)
	{
		for (int j =0 ; j<coloumn ; j++)
		{
			if (matrix[i][j]!=matrix [j][i])
			{
				symmetric =false ; 
				break ; 
			}
		}

	}
	if(symmetric==true)
	{
		System.out.println("The matrix is symmetric ") ; 

	}
	else  
		System.out.println("The matrix is not symmetric"); 

}
void equals (float [][]a)
{
		 int coloumnsize=a[0].length; // size of coloumn
		 int rowsize= a.length; // size of row
		boolean equalsize = true ; 
		if(coloumn!=coloumnsize ||row!=rowsize)
		{
			System.out.println("The two matrices arenot equal due to size difference") ; 
		}
	else
	{
		for(int i =0 ; i<rowsize; i++)
		{
			for(int j=0 ; j<coloumnsize ;j++)
			{
					if (matrix[i][j]!=a[i][j])
				{
					equalsize =false ; 
					break ; 
				}
			}
		}
		if(equalsize==true)
	{
		System.out.println("The two matrices are equal "); 

	}
	else
	{ 
		System.out.println("The two matrices aren't equal") ; 
	}

	
	}

}


	void validforMultiplcation(float [][]a) 
	{
		 int coloumnsize=a[0].length; // size of coloumn
		 int rowsize= a.length; // size of row
		if(coloumn==rowsize)
		{
			System.out.println("valid for multiplication");

		}
		else
		{
			System.out.println("not valid for multiplication") ; 

		}

	}

	public float [][]  MyMatrixZeroMatrix(int x , int y) 
	{
		
                float[][]a =new float[x][y];
		for(int i =0 ; i<x ; i++)
		{
			for(int j =0 ; j<y ; j++)
			{
				a[i][j]= 0 ; 
			}

		}
		return a ;

	}
	public float[][] MyMatrixIdentityMatrix(int x)
	{		
			float[][] a =new float[x][x];
			for(int i =0 ; i<x ; i++)
			{
			for(int j =0 ; j<x ; j++)
				{
					if(i==j)
					{
						a[i][j]=1;
					}
					else
					{
						a[i][j]= 0 ;	
					}
				}
			}

			return a ;

	}

	void display ()
	{
		for(int i =0 ; i<row ; i++)
		{
			for(int j=0 ; j<coloumn ; j++)
			{
				System.out.print(matrix[i][j]+"      ");
			}
			System.out.println() ;
		}
	}

	void setValues()
	{
		for(int i =0 ; i<row ; i++)
		{
			for(int j=0 ; j<coloumn ; j++)
			{
				System.out.println("enter the matrix["+i+"]["+j+"]") ; 
				float value =in.nextFloat();
				matrix[i][j]= value ;
			}
		}

	}

	void MyMatrixInverse() 
	{
		if(row==2&&coloumn==2)
		{

			float det ; 

			det=(matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);

			float swap= matrix[0][0] ;

			matrix[0][0]=matrix[1][1];
			
			matrix[1][1]=swap  ;

			float swap1= matrix[0][1] ;

			matrix[0][1]=-matrix[1][0];
			
			matrix[1][0]=swap1  ;

			float newdet=1/det ; 

			for(int i =0 ; i<2 ; i++)
			{
				for(int j =0 ; j<2 ; j++)
				{
					matrix[i][j]=matrix[i][j]*newdet ; 
				}
			}
			for(int i =0 ; i<row ; i++)
			{
				for(int j=0 ; j<coloumn ; j++)
				{
					System.out.print(matrix[i][j]+"       ");
				}
				System.out.println() ;
			}	

			
		}
                 
		else if(row==3&&coloumn==3)
		{
			float det ; 
			det =matrix[0][0]*((matrix[1][1]*matrix[2][2])-(matrix[1][2]*matrix[2][1]));
			det=det+ -matrix[0][1]*((matrix[1][0]*matrix[2][2])-(matrix[1][2]*matrix[2][0]));
			det=det+ matrix[0][2]*((matrix[1][0]*matrix[2][1])-(matrix[1][1]*matrix[2][0]));
			float [][]inverse=new float[3][3];
			float newdet=1/det ; 
			inverse[0][0] =  (matrix[1][1]*matrix[2][2]-matrix[2][1]*matrix[1][2])*newdet;
			inverse[1][0] = -(matrix[0][1]*matrix[2][2]-matrix[0][2]*matrix[2][1])*newdet;
			inverse[2][0] =  (matrix[0][1]*matrix[1][2]-matrix[0][2]*matrix[1][1])*newdet;
			inverse[0][1] = -(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])*newdet;
			inverse[1][1] =  (matrix[0][0]*matrix[2][2]-matrix[0][2]*matrix[2][0])*newdet;
			inverse[2][1] = -(matrix[0][0]*matrix[1][2]-matrix[1][0]*matrix[0][2])*newdet;
			inverse[0][2] =  (matrix[1][0]*matrix[2][1]-matrix[2][0]*matrix[1][1])*newdet;
			inverse[1][2] = -(matrix[0][0]*matrix[2][1]-matrix[2][0]*matrix[0][1])*newdet;
			inverse[2][2] =  (matrix[0][0]*matrix[1][1]-matrix[1][0]*matrix[0][1])*newdet;
			for(int i =0 ; i<row ; i++)
		{
			for(int j=0 ; j<coloumn ; j++)
			{
				System.out.print(inverse[i][j]+"       ");
			}
			System.out.println() ;
		}

		}

		else 
		{

			System.out.println("not taken in the lecture"); 
		}





	}
}
