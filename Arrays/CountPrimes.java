#To Count the number of Prime in Arrays

##Approach 1 : Naive Method


class Solution {

    public  static  boolean isPrime(int n)
    {
      for( int i = 2 ;i*i<=n;i++)
      {
          if(n % i == 0)
          {
              return false;
          }
      }
      return true;
    }
    public int countPrimes(int n) {
        int count = 0;
        
            for (int j =2 ;j<n;j++)
           {
               
               if(isPrime(j)== true)
               {
                   count++;
               } 
           }
       
       return count;
}
}

##Approach 2 : Seive of Eratosthenes

import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String args[])
{
    Solution s = new Solution();
   int a= s.countPrimes(10);
   System.out.println(a);
}
     public int countPrimes(int n) {
        if(n<=2)
        {
            return 0 ;
        }
        boolean [] primes = new boolean[n];
        Arrays.fill(primes,true);
        primes[0]=false;
        primes[1]=false;
        int count =0 ;
        for(int i =2 ; i*i<=n;i++)
        {
            if(primes[i])
            {
           for(int j = 2*i;j<n;j+=i)
                {
                    primes[j]=false;
                }
            } 
        }
        for(int k = 0;k<n;k++)
        {
            if(primes[k]== true)
            {
                count++;
            }
        }
        
   return count;     
}

 

}
