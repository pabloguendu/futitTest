public class Main {
    static void zeroEnd(int arr[], int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < n)
            arr[count++] = 0;
    }
    public static void main (String[] args)
    {
        int arr[] = { 1, 0, 2, -1, 0, 3, 4 };
        int n = arr.length;
        zeroEnd(arr, n);
        System.out.println("Show array");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}