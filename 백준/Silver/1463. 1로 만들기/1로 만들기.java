import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 1000001;
        int[] list = new int[max];

        list[1] = 0;
        list[2] = 1;
        list[3] = 1;

        for(int i = 4;i < max;i++) {
            list[i] = list[i - 1] + 1;

            if(i % 2 == 0) {
                list[i] = Math.min(list[i], list[i / 2] + 1);
            }
            if(i % 3 == 0) {
                list[i] = Math.min(list[i], list[i / 3] + 1);
            }
        }

        try {
            int n = Integer.parseInt(br.readLine());

            System.out.println(list[n]);
        } catch(IOException e) {
            System.out.println("Something goes wrong!");
        }
    }
}