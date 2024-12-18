import java.util.*;



 public class Day2{
 

    //  CODE FOR MAXIMUM ELEMENT .........
public int maxele(int arr[]){
   int maxelement=0;
   for(int i=0; i< arr.length ; i++){
    if (maxelement< arr[i]){
        maxelement = arr[i];
    }
   }
   return maxelement;
}


// CODE FOR MINIMUM ELEMENT...........
public int minele(int arr[]){
    int minelement= Integer.MAX_VALUE;
    for(int i=0 ; i< arr.length ; i++){
       if(minelement> arr[i]){
        minelement=arr[i];
       }        
    }
    return minelement;
}



// CODE TO CALCULATE SUM.........
public int arrsum( int arr[]){
  int sum=0;
  for(int i=0;i<arr.length;i++){
    sum= sum + arr[i];
  }
return sum;
}


// COUNT EVEN AND ODD NUMBERS IN ARRY.....
public int even(int arr[]){
int even=0;
for(int i=0; i<arr.length;i++){
    if((arr[i])%2==0){
        even++;
    }
}
return even;
}
public int odd(int arr[]){
    int odd=0;
    for(int i=0; i<arr.length;i++){
        if((arr[i])%2 !=0){
            odd++;
        }
    }
    return odd;
    }

// CODE TO FIND DUPLICATE NUMBER.........
public void duplicate(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println( "the duplicate numbers are " + arr[i]); 
                break;
            }
        }
    }
}


public static void main(String args[]){
  int arr[]={1,2,3,4,5,6,7,4,7,1,8,9,10,11,12,99,345,88};
  Day2 d2= new Day2();
  int result=d2.maxele(arr);
  int result2=d2.minele(arr);
  int result3=d2.arrsum(arr);
  int result4=d2.even(arr);
  int result5=d2.odd(arr);
      d2.duplicate(arr);
   System.out.println(" the max number is "+ result);
   System.out.println(" the min number is "+ result2);
   System.out.println("the sum of number us " + result3);
   System.out.println("the no. of even no is  " + result4);
   System.out.println("the no. of odd no. is  " + result5);



 }
 }