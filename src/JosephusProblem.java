import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {

    public static void main(String[] args) {
        josephus(11, 3, 1);
        int result = josephus(11, 3);
        System.out.println("result = " + result);
    }

    public static int josephus(int n, int m) {
        int p = 0;
        for (int i = 2; i <= n; i++) {
            p = (p + m) % i;
        }
        return p + 1;
    }

    public static void josephus(int totalNum, int countNum, int startNO) {
        List<Integer> start = new ArrayList<>();
        for (int i = 1; i <= totalNum; i++) {
            start.add(i);
        }
        int k = startNO - 1;
        while (start.size() > 0) {
            System.out.println(start);
            k = (k + countNum) % (start.size()) - 1;
            if (k < 0) {
                System.out.println(start.get(start.size() - 1));
                start.remove(start.size() - 1);
                k = 0;
            } else {
                System.out.println(start.get(k));
                start.remove(k);
            }
        }
    }
}