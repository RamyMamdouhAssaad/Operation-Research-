
package orphas2partone;

public class MyEquation {
    
    int n  ; 
    float RHS ;
    float[]LHS;
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    MyEquation(int n)
    {
         this.n=n ;
        LHS=new float[n];
        for(int i =0 ; i<n;i++)
        {
            LHS[i]=0;
        }
     RHS=0 ;
    }
    MyEquation (int n, float left[], float right)
    {
     this.n=n ;
     LHS=new float[n];
        for(int i =0 ; i<n;i++)
        {
            LHS[i]=left[i];
        }
     RHS=right ; 
    }
 public MyEquation multiplyBy (float x) 
    {
        MyEquation New=new MyEquation(n);
        New.RHS=RHS ; 
        for(int i=0 ; i<LHS.length;i++)
        {
            New.LHS[i]=LHS[i]*x ;
        }
        
         New.RHS=RHS*x ; 
        return New ; 
    }
 
 public MyEquation sumWith (MyEquation e)
    
    {
        int test=e.n ;
        MyEquation Sum ; 
        Sum=new MyEquation(n);
        if(n>test)
        {
            Sum=new MyEquation(n);
             for(int i =0 ; i<test;i++) 
             {
                 Sum.LHS[i]=LHS[i]+e.LHS[i];
             }
            for(int j=test ;j<n;j++ )
            {
             Sum.LHS[j]=LHS[j];   
            }
        }
        if(n<test)
        {
            Sum=new MyEquation(n);
            for(int i =0 ; i<test;i++) 
             {
                 Sum.LHS[i]=LHS[i]+e.LHS[i];
             }
            for(int j=n ;j<test;j++ )
            {
             Sum.LHS[j]=e.LHS[j];   
            }
        }
         if(n==test)
        {
          Sum=new MyEquation(n);
            for(int i =0 ; i<test;i++) 
             {
                 Sum.LHS[i]=LHS[i]+e.LHS[i];
             }
         
        }
       Sum.RHS=RHS+e.RHS ;
       return Sum ;  
    }  
    void display() 
    {
        
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(LHS[i]+" "+alphabet[i]+" "+" + ");
        }
        
        System.out.print(" = "+RHS);
        System.out.println() ; 
        System.out.println() ; 
        System.out.println() ; 
        System.out.println() ; 
        
    }
    
    void setValues (float [] left , float right) 

    {
     for(int i =0 ; i<n ; i++)
     {
      LHS[i]=left[i];   
     }
     RHS=right ; 
     System.out.println("equation after values are set : ");
       display( ); 
    }
  

}
