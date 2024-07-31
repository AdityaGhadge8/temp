import java.util.*;

// 1 2 -3 -1 -2 -3
//sort // 
//
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
        System.out.println("elements in array");
        for (int i = 0; i < isize; i++) {
            System.out.println(arr[i]);
        }
    }

    public void replaceWithRank() {

        int sorted[] = new int[isize];
        int temp = 0;

        // copy elementes
        for (int i = 0; i < isize; i++) {
            sorted[i] = arr[i];
        }

        // sorted array
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
            for (int j = i + 1; j < isize; j++) {
                if (arr[i] == sorted[j]) {
                    arr[i] = j+1;
                    break;
                }
            }
        }

    }

}

public class array {
    public static void main(String args[]) {
        ArrayX obj = new ArrayX(7);
        obj.accept();
        obj.replaceWithRank();
        obj.display();

    }
}

// given two strings s and t,determine if they are isomorphic

// two strings are isomorphic if the characters in s can be replaced to get t

// all occurenceces of character must be replayced with another character while
// preserving the order of characters. no two characters may map the same
// chracter,but a chracter may map to itself

// example 1 : s = "egg", t = "add" output : true;
// example 2 : s = "foo", t = "bar" output : false;
// example 3 : s = "paper", t = "title" output : true;
