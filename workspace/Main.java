


public class Main{


public static void main(String[] args){
    int[] a={1,5,8,4,2,5,7,1};
    sort(a);
}


public static void sort(int[]arr){

    int[] arr2 = new int[arr.length];
    int chunkSize=2;
    int l=0;
    int r=0;
    int copyi=0;//copyindex
    int[] c=arr;//c for current
        int[] copy=arr2;
    System.out.println("original array");
    for(int n:arr){
        System.out.println(n);
    }
    while(chunkSize<=arr.length){
        r=l+chunkSize;
        //chunkSize*=2;
        while(l<arr.length-1){
        
        for(int i=l;i<r;i++){
            if(c[i]<c[i+1]){
                copy[copyi]=c[i];
            }else{
                copy[copyi]=c[i+1];
            }
            System.out.println("copied "+copy[copyi]);
            copyi++;
        }
        l=r+1;
        r=l+chunkSize/2;
        copyi=l;
        }
        //System.out.println("loop 1 run");
    System.out.println("arr one chunk"+chunkSize);
    for(int n:arr){
    System.out.println(n);
    }
    if(c==arr){
        c=arr2;
        copy=arr;
    }else{
        c=arr;
        copy=arr2;
    }
    System.out.println("arr2");
    for(int n:c){
        System.out.println(n);
    }

        if(c==arr){
            c=arr2;
            copy=arr;
        }else{
            c=arr;
            copy=arr2;
        }

    chunkSize*=2;
    }
    //imagine each individual value is its own array already
    //old code
   
    /* 
    for(int i=0;i<arr.length;i+=2){
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
}

}


