import java.util.*;
public class Array {
	public static void main(String args[]) {
		// khai báo và khởi tạo mảng
	    int a[] = new int[5];
	    a[0] = 10; // gán giá trị
	    a[1] = 20;
	    a[2] = 30;
	    a[3] = 40;
	    a[4] = 50;
	    // in mảng ra màn hình
	    System.out.print("Mảng 1 chiều có các giá trị là: ");
	    for (int i = 0; i < a.length; i++) {
	        System.out.print(a[i] + " ");
	    }
	    
	    
        // khai báo và khởi tạo mảng 2 chiều
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
 
        // in mảng 2 chiều r màn hình
        System.out.println();
        System.out.println("Mảng 2 chiều có các giá trị là: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

	}
}
