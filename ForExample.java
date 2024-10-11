package LearningJAVABasicsToAdvance;

public class ForExample {
    public static void main(String[] args) {
        int a[] = new int[5]; //instantiation  and declaration
        a[0] = 1; //Initialization
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        for(int i=0;i<a.length;i++ ){
            System.out.println(a[i]);
        }

        //foreach loop

        for(int i:a){ //forward direction
            System.out.println(i);

        }

        //multidimentional
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
