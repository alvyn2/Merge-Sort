


public class Main{


public static void main(String[] args){
    int[] a={1,8,4,2,5,7,9,0,3,6};
    sort(a);
}


public static void sort(int[]arr){

    int[] arr2 = new int[arr.length];
    int chunkSize=2;
    int l=0;
    int r=l+chunkSize;
   // System.out.println("r"+r);
    int copyi=0;//copyindex
    int[] c=arr;//c for current
    int[] copy=arr2;
    int start=l;
    System.out.println("original array");
    for(int n:arr){
        System.out.println(n);
    }

    //imagine each individual value is its own array already
    while(chunkSize<=arr.length && r<=arr.length &&l<=arr.length){
      
        start=l;
       // while(l<=arr.length){
    while(l<=start+chunkSize/2 || r<=start+chunkSize && l<=arr.length){// does this loop do anything?
        System.out.println(r);
     for(int i=0;i<arr.length;i+=chunkSize/2){
    //int i=l;    
    // copyi=i;
    //System.out.println("r"+r);
           // System.out.println("i="+i);
            for(int j=l;j<r ;j+=chunkSize){
            copyi=j;
            System.out.println("j="+j);
            if(copyi+chunkSize/2<arr.length){
            if(c[j]<c[j+chunkSize/2]){
                copy[copyi]=c[j];
                copy[copyi+chunkSize/2]=c[j+chunkSize/2];
            }else{
                copy[copyi]=c[j+chunkSize/2];
                copy[copyi+chunkSize/2]=c[j];
            }
            System.out.println("copied "+copy[copyi]+" and "+copy[copyi+chunkSize/2]); 
            
        }else if(j<arr.length){
            if(c[j]<c[c.length-1]){
                copy[copyi]=c[j];
                copy[c.length-1]=c[c.length-1];
            }else{
                copy[copyi]=c[c.length-1];
                copy[c.length-1]=c[j];
            }
            System.out.println("end copied "+ copy[copyi]+" and "+copy[c.length-1]);
        }
        /* 
            if(j+chunkSize/2>=arr.length-1 && arr.length%2==1){
            if(c[j]<c[j+chunkSize/2]){
                copy[copyi]=c[j];
                copy[copyi+chunkSize/2]=c[j+chunkSize/2];
           }else{
                copy[copyi]=c[j+chunkSize/2];
                copy[copyi+chunkSize/2]=c[j];
        
        
            }
        }
        */  
        //System.out.println("copied "+copy[copyi]+" and "+copy[copyi+1]);
        
        copyi+=chunkSize/2;
        
        }//inner for loop end
       
        l=r+1;
        r=l+chunkSize/2;
        copyi=l;
     }//outer for loop

      //  l=r+1;
      //  r=l+chunkSize/2;
      //  copyi=l;
        System.out.println(" inner loop run");
        }//inner while loop 
        
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
        
    System.out.println(" chunk"+chunkSize);
    


    chunkSize*=2;
    l=0;
    r=l+chunkSize/2;
    }//outer while loop

   if(chunkSize*2>arr.length){
//sort the last piece
   }

   //arr2=arr;
   //arr=arr2;
    System.out.println("finished array");
    for(int n:arr){
        System.out.println(n);
    }
    System.out.println("finished array2");
    for(int n:arr){
        System.out.println(n);
    }    
}//end sort func

}//end class


