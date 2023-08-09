package day26exception;

public class Review02 {
    public static void main(String[] args) {

        String[] arr = {"Emre","Merve","Dursun"};

        getElementFromAnArray(arr,3);
    }

    public static void getElementFromAnArray(String[] arr, int idx){
        try {
            System.out.println(arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("An error happened in array operation ==> " + e.getMessage());
        }

    }
}
