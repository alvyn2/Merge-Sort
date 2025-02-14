


public class Main{


public static void main(String[] args){
    int[] a=new int[10];
    for(int i=0;i<a.length;i++){
        a[i]=1+ (int) (Math.random()*9);
    }
    sort(a);
}


public static void sort(int[]arr){

    int[] arr2 = new int[arr.length];
    int chunkSize=2;
    int l=0;
    int r=l+chunkSize/2;
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
    while(chunkSize<=arr.length){
        System.out.println(" chunk"+chunkSize);
        start=l;
        int i=l;
        int j=r;
        
        copyi=start;
        while(l<arr.length && j<arr.length){
            i=0;
            j=r;
//&& i<r && j<r+chunkSize/2
        while(copyi<arr.length-1  && i<arr.length-1 && j<arr.length-1){
            
           // System.out.println("copyi = "+ copyi);
            //System.out.println("i = "+ i);
           System.out.println("j = "+ j);
            if(c[i]<c[j]){
                copy[copyi]=c[i];
                System.out.println(" i copied "+copy[copyi] +"from"+ i); 
                if(i==arr.length-2){
                    copyi++;
                    copy[copyi]=c[j];
                    
                    System.out.println(" extra copied "+copy[copyi]); 
                }
                
                i++;
                

            }else{
                copy[copyi]=c[j];
                
                System.out.println("j copied"+copy[copyi]+"from"+ j); 
                if(i==arr.length-2){
                    copyi++;
                    copy[copyi]=c[i];
                    System.out.println(" extra copied "+copy[copyi]); 
                }
                j++;
            }
            copyi++;
            if(i==arr.length-2){
                copy[copyi]=c[i+1];
                System.out.println("k copied  "+copy[copyi]); 
                copyi++;
            }

        }// inner loop while
       
        System.out.println("inner while loop chunk finished");
        /* 
        if(copyi<start+chunkSize){
            for(int k=copyi;k<start+chunkSize;k++){

                copy[copyi]=c[k];
                System.out.println("k copied  "+copy[copyi]); 
                copyi++;
            }
        }
       */
        l=r+1;
        r=l+chunkSize/2;
        }
       // while(l<=arr.length){
  //  while(l<=start+chunkSize/2 || r<=start+chunkSize && l<=arr.length){
  // does this loop do anything? idk thats wh its commented out
        //System.out.println(r);
     //for(int i=0;i<arr.length;i+=chunkSize/2){
    //int i=l;    
    // copyi=i;
    //System.out.println("r"+r);
           // System.out.println("i="+i);
           /* 
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

            if(j+chunkSize/2>=arr.length-1 && arr.length%2==1){
            if(c[j]<c[j+chunkSize/2]){
                copy[copyi]=c[j];
                copy[copyi+chunkSize/2]=c[j+chunkSize/2];
           }else{
                copy[copyi]=c[j+chunkSize/2];
                copy[copyi+chunkSize/2]=c[j];
        
        
            }
        }

        //System.out.println("copied "+copy[copyi]+" and "+copy[copyi+1]);
        
        copyi+=chunkSize/2;
        
        }//inner for loop end
        */
      //  l=r+1;
        //r=l+chunkSize/2;
        //copyi=l;
    // }//outer for loop

      //  l=r+1;
      //  r=l+chunkSize/2;
      //  copyi=l;
      //  }//inner while loop 
        
       // l=0;
        //r=l+chunkSize/2;
        //copyi=l;
        /* 
        for(int n:copy){
            System.out.println(n);
            }
            if(c==arr){
                c=arr2;
                copy=arr;
            }else{
                c=arr;
                copy=arr2;
            }
           */
           
            /* 
            System.out.println("copy");
            for(int n:copy){
                System.out.println(n);
            }
            System.out.println("current");
            for(int n:c){
                System.out.println(n);
            }
    */
        //}//inner while loop 2
        

    


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
    for(int n:arr2){
        System.out.println(n);
    }    
}//end sort func

}//end class


