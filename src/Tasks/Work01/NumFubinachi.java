package Tasks.Work01;

public class NumFubinachi {

    public static void main(String[] args) {
            getFubinachi(50);
    }

    public static void getFubinachi(int size){

        int a = 1;
        int b = 0;
        int [] arr = { b ,a };

        while (a < size) {
            System.out.println(arr[1]);
            a += arr[0];
            arr = chagePosition(arr, a);
        }

    }
    public static int[] chagePosition(int[] arr, int a){

        arr[0] = arr[1];
        arr[1] = a;
        return arr;
    }
}
