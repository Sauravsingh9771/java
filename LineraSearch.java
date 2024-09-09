public class LineraSearch{
    public static int linearSearch(int arr[],int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            } 
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[] ={10,20,2,5,1,100};
        int key=1;
        int index=linearSearch(arr,key);
        if(index==1){
            System.out.print("not matched");
        }else{
            System.out.print("matched ="+index);
        }
    }
    
}
