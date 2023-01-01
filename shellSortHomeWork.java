public class shellSortHomeWork {

    public static void main(String[] args) {
        int[] smallArray1 = new int[30];
        int[] smallArray2 = new int[75];
        int[] smallArray3 = new int[140];
        int[] bigArray1 = new int[15000];
        int[] bigArray2 = new int[25000];
        int[] bigArray3 = new int[50000];

        for (int j = 1; j <=10; j++) {
            for (int i = 0; i < smallArray1.length; i++) {
                smallArray1[i] = (int) (Math.random() * 100);
            }
            System.out.print("Small array 1 = ");
            printArray(smallArray1);
            System.out.print("\n"+j+". run with "+smallArray1.length+" elements array - ");
            shellSort(smallArray1);
            System.out.print("Small array 1 after shell sort = ");
            printArray(smallArray1);
            System.out.println("\n");

            for (int i = 0; i < smallArray2.length; i++) {
                smallArray2[i] = (int) (Math.random() * 100);
            }
            System.out.print(j+". run with "+smallArray2.length+" elements array - ");
            shellSort(smallArray2);

            for (int i = 0; i < smallArray3.length; i++) {
                smallArray3[i] = (int) (Math.random() * 100);
            }
            System.out.print(j+". run with "+smallArray3.length+" elements array - ");
            shellSort(smallArray3);

            for (int i = 0; i < bigArray1.length; i++) {
                bigArray1[i] = (int) (Math.random() * 10000);
            }
            System.out.print(j+". run with "+bigArray1.length+" elements array - ");
            shellSort(bigArray1);

            for (int i = 0; i < bigArray2.length; i++) {
                bigArray2[i] = (int) (Math.random() * 10000);
            }
            System.out.print(j+". run with "+bigArray2.length+" elements array - ");
            shellSort(bigArray2);

            for (int i = 0; i < bigArray3.length; i++) {
                bigArray3[i] = (int) (Math.random() * 10000);
            }
            System.out.print(j+". run with "+bigArray3.length+" elements array - ");
            shellSort(bigArray3);
            System.out.println("\n");

        }
    }

    public static void shellSort(int[] arrayForShellSort) {

        int n = arrayForShellSort.length;
        long startTime = System.currentTimeMillis();
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arrayForShellSort[i];
                int j = i;
                while (j >= gap && arrayForShellSort[j - gap] > temp) {
                    arrayForShellSort[j] = arrayForShellSort[j - gap];
                    j -= gap;
                }
                arrayForShellSort[j] = temp;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("That sort took " + (endTime - startTime) + " miliseconds");
    }

    public static void printArray(int[] arrayToPrint) {
        for (int i = 0; i <arrayToPrint.length ; i++) {
            System.out.print(arrayToPrint[i] + " ");
        }
    }
}
