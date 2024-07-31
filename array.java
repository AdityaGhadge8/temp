
import java.util.*;



class ArrayX {
    public int arr[];
    public int isize;

    ArrayX(int isize) {
        arr = new int[isize];
        this.isize = isize;
    }

    public void accept() {
        System.out.println("Enter elements in array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < isize; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void display() {
        System.out.println("Elements in array:");
        for (int i = 0; i < isize; i++) {
            System.out.println(arr[i]);
        }
    }

    public void replaceWithRank() {
        int sorted[] = new int[isize];
        int temp;

        // Copy elements
        for (int i = 0; i < isize; i++) {
            sorted[i] = arr[i];
        }

        // Sort the array using bubble sort
        for (int i = 0; i < isize; i++) {
            for (int j = i + 1; j < isize; j++) {
                if (sorted[i] > sorted[j]) {
                    temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        for (int i = 0; i < isize; i++) {
            for (int j = 0; j < isize; j++) {
                if (arr[i] == sorted[j]) {
                    arr[i] = j + 1; // Rank starts from 1
                    break;
                }
            }
        }
    }

    public void removeDuplicates()//10 20 10 40 30 20 10
    {
        int brr[] = new int[isize];
        int icnt = 0;
        boolean isDuplicate = false;

        for(int i=0;i<isize;i++)
        {
            isDuplicate = false;

            for(int j=i+1;j<isize;j++)
            {
                if(arr[i] == arr[j])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if(isDuplicate == false)
            {
                brr[icnt++] = arr[i];
            }
        }

        for(int i=0;i<icnt;i++)
        {
            System.out.println(brr[i]);
        }
    }
}

public class array {
    public static void main(String args[]) {
        ArrayX obj = new ArrayX(7);
        obj.accept();
       obj.removeDuplicates();
    }
}
