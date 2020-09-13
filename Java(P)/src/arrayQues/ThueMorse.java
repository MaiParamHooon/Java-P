package arrayQues;

import java.util.Scanner;

public class ThueMorse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i, l = j;
                boolean flag = false;
                boolean flag1 = false;
                int suml = 0, sumk = 0;
                if (l == 0) {
                    flag = true;
                }
                else if (l == 1) {
                    flag = false;
                }
                if (k == 0) {
                    flag1 = true;
                }
                else if (k == 1) {
                    flag1 = false;
                }

                while (l >= 2) {
                    suml += l % 2;
                    l = l / 2;
                    if (l == 1) suml++;
                }

                while (k >= 2) {
                    sumk += k % 2;
                    k = k / 2;
                    if (k == 1) sumk++;
                }

                if (suml % 2 == 0 && suml > 0) {
                    flag = true;
                }
                else if (suml % 2 != 0 && suml > 0) flag = false;
                if (sumk % 2 == 0 && sumk > 0) {
                    flag1 = true;
                }
                else if (sumk % 2 != 0 || sumk > 0) flag1 = false;

                if (flag == flag1) a[j] = "+";
                else a[j] = "-";

            }
            for (int y = 0; y < n; y++) {
                System.out.print(a[y] + "  ");
            }
            System.out.println();
        }
    }
}
