


public class Main{


public static void main(String[] args){
    int[] a={1,5,8,4,2,5,7,1};
    sort(a);
}


public static void sort(int[]arr){

    int[] arr2 = new int[arr.length];
    //imagine each individual value is its own array already
    for(int i=0;i<arr.length;i+=2){
    if(arr[i]>arr[i+1]){
        arr2[i]=arr[1+i];
        arr2[i+1]=arr[1];
    }else{
        arr2[i]=arr[1];
        arr2[i+1]=arr[1+i];
    }
    }
    for(int n:arr2){
    System.out.println(n);
}
    for(int i=0;i<arr.length;i+=4){
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
    System.out.println(arr2);
}

}


