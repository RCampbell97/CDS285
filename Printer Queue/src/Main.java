import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int C = in.nextInt();
        while (C -- > 0){
            int n = in.nextInt();
            int myPos = in.nextInt();

            Queue<Integer>queue= new ArrayDeque<Integer>();
            //add piiorities
            for( int i=0; i < n; i++) {
                queue.add(in.nextInt());
            }
        }
    }
}
