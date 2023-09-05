// added the codes
public class sum {

    public static void seperate(int arr[],int n){
        int p = -1;

        for(int i = 0;i<n;i++){
             if(arr[i]==0){
                 p++;
                 int t = arr[i];
                 arr[i] = arr[p];
                 arr[p] = t;
             }
        }
        System.out.println("done");
    }
}
