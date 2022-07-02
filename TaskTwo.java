public class TaskTwo {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("The number of ending zeros is : " + findTheNumberOfEndingZeros(number));
    }

    public static int findTheNumberOfEndingZeros(int num) {
        return num < 5 ? 0 : 1;
    }
}


