public class TaskOne {
    public static void main(String[] args) {
        int arr[][] = new int[7][7];
        arr[4][0] = 1;
        System.out.println(findTheShortestWayToTheCenter(arr));
    }
    public static int findTheShortestWayToTheCenter(int arr[][]) {
        int a = 0, b =0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr[i][j] == 1) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        return Math.abs(3-a) + Math.abs(3-b);
    }
}
