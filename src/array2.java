public class array2 {
    public static void main (String[] args){
        //deklarasi array2
        int[][] arr = {{1,2,3},{2,4,5},{4,4,5}};
        //print Array 2D
        for (int i=0; i<3;i++){
            for (int j=0; j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}