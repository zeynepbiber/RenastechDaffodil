package student.gulsumB;

public class example {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 36, 850, 645, -85, -120, 710, 1500};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        } for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}


