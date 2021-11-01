 class Solution {
 public boolean isPalindrome(int x) {  
  int r,sum=0,temp=x;          
  while(x>0){    
   r=x%10;  //getting remainder  
   sum=(sum*10)+r;    
   x=x/10;    
  } 
  boolean y = (temp==sum)? true: false; 
     return y;
}  
}