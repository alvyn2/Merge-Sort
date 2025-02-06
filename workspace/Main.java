


public class Main{


public static void main(String[] args){
    int[] a={1,5,8,4,2,5,7,1};
    sort(a);
}


public static void sort(int[]arr){

    int[] arr2 = new int[arr.length];
    int chunkSize=2;
    int l=0;
    int r=l+chunkSize/2;
    int copyi=0;//copyindex
    int[] c=arr;//c for current
    int[] copy=arr2;
    int start=l;
    System.out.println("original array");
    for(int n:arr){
        System.out.println(n);
    }
    //imagine each individual value is its own array already
    while(chunkSize<=arr.length-1){
      
        start=l;
       // while(l<=arr.length){
        while(l<start+chunkSize/2 || r<start+chunkSize && l<=arr.length){
 
        for(int i=l;i<arr.length-1;i+=chunkSize){
            copyi=i;
            if(c[i]<c[i+chunkSize/2]){
                copy[copyi]=c[i];
                copy[copyi+chunkSize/2]=c[i+chunkSize/2];
            }else{
                copy[copyi]=c[i+chunkSize/2];
                copy[copyi+chunkSize/2]=c[i];
        }
            System.out.println("copied "+copy[copyi]+" and "+copy[copyi+1]);
            //copyi+=chunkSize;
            System.out.println("i="+i);
        }
        l=r+1;
        r=l+chunkSize/2;
        copyi=l;
        System.out.println(" inner loop run"+ "chunksize: "+chunkSize);
        }//innermost while loop 
        
        l=r+1;
        r=l+chunkSize/2;
        //copyi=l;
        //for(int n:arr){
            //System.out.println(n);
            //}
            if(c==arr){
                c=arr2;
                copy=arr;
            }else{
                c=arr;
                copy=arr2;
            }
            
            System.out.println("copy");
            for(int n:copy){
                System.out.println(n);
            }
            System.out.println("current");
            for(int n:c){
                System.out.println(n);
            }
    
        //}//inner while loop 2
        
    //System.out.println("arr one chunk"+chunkSize);
    


    chunkSize*=2;
    l=0;
    }//outer while loop
    
    //old code using for loops
   
     /* 
    for(int i=0;i<arr.length-1;i++){
    //copies and sorts into sorted sections of 2 elements each
    if(arr[i]<arr[i+1]){
        
        arr2[i]=arr[1];
        arr2[i+1]=arr[1+i];
    }else{
        arr2[i]=arr[1+i];
        arr2[i+1]=arr[1];
    }
    }
    
    System.out.println("semisorted");
    for(int n:arr2){
    System.out.println(n);
    }
     
    for(int i=0;i<arr.length;i+=4){
        //copies and sorts into sorted sections of 4 elements each
        for(int j=i;j<(arr.length)/2;j+=2){
            if(arr2[j]<arr2[j+2]){
                arr[j]=arr2[j];
                if(arr2[j+1]<arr2[j+2]){
                    arr[j+1]=arr2[j+1];
                }else{
                    arr[j+1]=arr2[j+2];
                }
            }else{
                arr[j]=arr2[j+2];
                if(arr2[j+1]<arr2[j+2]){
                    arr[j+1]=arr2[j+1];
                }else{
                    arr[j+1]=arr2[j+2];
                }

            }
        }
    }
    */
   
    System.out.println("end");
    for(int n:arr){
        System.out.println(n);
    }
        
}//end sort func

}//end class


