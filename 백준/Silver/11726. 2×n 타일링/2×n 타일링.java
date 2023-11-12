import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 1001;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        for(int i = 3;i <= max;i++) {
            list.add((list.get(i - 2) + list.get(i - 1)) % 10007);
        }

        try {
            int n = Integer.parseInt(br.readLine());
            System.out.println(list.get(n));
        } catch(IOException e) {
            System.out.println("Something goes wrong!");
        }
    }
}