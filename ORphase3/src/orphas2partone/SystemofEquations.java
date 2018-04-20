package orphas2partone;

import java.util.Scanner;

public class SystemofEquations {
   
   private int m ; 
   int equationCounter=0 ; 
   private MyEquation[] SystemofEquations=new MyEquation[m];
   private MyEquation[] SystemofEquationsA=new MyEquation[m];
   Scanner in = new Scanner(System.in);
   char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 
   void insertNewEquation (MyEquation x) 
   {
       System.out.println("Please enter the number of variables of the equation no. " +equationCounter+1);
       SystemofEquations[equationCounter].n=in.nextInt() ;
       System.out.println("Please enter the (real) coefficients of \n" +
       "the n variables in the equation. ");
       for(int i =0 ;i<  SystemofEquations[equationCounter].n ; i++ )
       {
           System.out.println("please enter the value for variable "+alphabet[i]);
            SystemofEquations[equationCounter].LHS[i]=in.nextFloat();
       }
       System.out.println("please enter The RHS of equation no. " +equationCounter+1);
       SystemofEquations[equationCounter].RHS=in.nextFloat() ;
       equationCounter++ ; 
   }
   void swapEquations (int i, int j)
   {
       float SwapRHS  ;
       float SwapLHS ;
       int SwapN ;
       int bigger,smaller ; 
       
       SwapRHS=SystemofEquations[i].RHS;
       SystemofEquations[i].RHS=SystemofEquations[j].RHS;
       SystemofEquations[j].RHS=SwapRHS;
     
       if(SystemofEquations[i].n>SystemofEquations[j].n)
       {
        bigger=SystemofEquations[i].n ;  
        smaller=SystemofEquations[j].n ; 
      for(int k=0 ; k<smaller ;k++)
       {
       SwapLHS=SystemofEquations[i].LHS[k];
       SystemofEquations[i].LHS[k]=SystemofEquations[j].LHS[k];
       SystemofEquations[j].LHS[k]=SwapLHS;
       }
      for(int k=smaller ; k<bigger ; k++)
      {
          SystemofEquations[j].n=SystemofEquations[i].n;
      }
       }
       else
       {
           bigger=SystemofEquations[j].n ; 
           smaller=SystemofEquations[i].n ; 
        for(int k=0 ; k<smaller ;k++)
       {
       SwapLHS=SystemofEquations[i].LHS[k];
       SystemofEquations[i].LHS[k]=SystemofEquations[j].LHS[k];
       SystemofEquations[j].LHS[k]=SwapLHS;
       }
            SwapN=SystemofEquations[i].n;
       SystemofEquations[i].n=SystemofEquations[j].n;
       SystemofEquations[j].n=SwapN;
      for(int k=smaller ; k<bigger ; k++)
      {
          SystemofEquations[i].n=SystemofEquations[j].n;
      }
      }

     
   }
   void  solveSystem () 
   {
       float [][] a=new float [SystemofEquations[0].n][SystemofEquations.length]; 
       for(int j=0 ; j<SystemofEquations.length;j++)
      {
           for(int i =0 ; i<SystemofEquations[j].n;i++)
       {
            a[j][i]=SystemofEquations[j].LHS[i];
       }      
      
      
      }
       
       determinant(a,SystemofEquations.length);
   }
   public float determinant(float a[][], int n){
	float det = 0, sign = 1;
                int p = 0, q = 0;

	if(n==1){
		det = a[0][0];
	}
	else{
		float [][] b = new float[n-1][n-1];
		for(int x = 0 ; x < n ; x++){
			p=0;q=0;
			for(int i = 1;i < n; i++){
				for(int j = 0; j < n;j++){
					if(j != x){
						b[p][q++] = a[i][j];
						if(q % (n-1) == 0){
							p++;
							q=0;
						}
					}
				}
			}
			det = det + a[0][x] *
                              determinant(b, n-1) *
                              sign;
			sign = -sign;
		}
	}
	return det;
}
   
}
