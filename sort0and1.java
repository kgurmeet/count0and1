public class sort0and1 {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,0};
        int zeroCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            zeroCount+=1;

        }
        for(int i=0;i<arr.length;i++){
            if(i<zeroCount){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }

    }
    for(int i:arr){
        System.out.println(i+" ");
    }
    
}
}
