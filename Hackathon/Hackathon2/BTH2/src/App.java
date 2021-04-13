import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào N nguyên dương 8< N <14");
        int n = scanner.nextInt();

        int[] mang = randomNumber(n);
        System.out.println("Mảng ngẫu nhiên là: " + Arrays.toString(mang));

        System.out.println("Nhập vào một số trong khoảng từ -10 đến 10");
        int target = scanner.nextInt();
        ArrayList<Integer> bestPairs = checkCondition(mang, target);
        printArray(bestPairs);
    }

    public static int[] randomNumber(int n) {
        int[] randomNumber = new int[n];
        for (int i = 0; i < n; i++) {
            randomNumber[i] = (int) ((Math.random() * 21) - 10);
        }
        return randomNumber;
    }

    public static ArrayList<Integer> checkCondition(int[] number, int target) {
        int a = Math.abs(number[0] + number[1] - target);
        ArrayList<Integer> bestPairs = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                int b = Math.abs(number[i] + number[j] - target);
                if (a == b) {
                    bestPairs.add(number[i]);
                    bestPairs.add(number[j]);
                }
                if (a > b) {
                    bestPairs.clear();
                    bestPairs.add(number[i]);
                    bestPairs.add(number[j]);
                    a = b;
                }
            }
        }
        return bestPairs;
    }

    public static void printArray(ArrayList<Integer> bestPairs) {
        for (int i = 0; i < bestPairs.size(); i += 2) {
            int num1 = bestPairs.get(i);
            int num2 = bestPairs.get(i + 1);
            int sum = num1 + num2;
            System.out.println("Số " + num1 + " và " + num2 + " có tổng gần nhất bằng " + sum);
        }
    }
}
