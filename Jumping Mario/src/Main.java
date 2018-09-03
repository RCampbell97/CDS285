import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();   //number of cases

        for(int i=1; i<=T; i++){
            int High = 0;
            int low = 0;
            int N = in.nextInt();   // number of walls
            int first=in.nextInt();     // height of first wall
            for(int j= 1;j< N; j++) {
                int Next = in.nextInt(); // height of next wall

                if (Next > first) {
                    High++;
                } else if (Next < first) {
                    low++;
                } else {
                }
                first = Next;
            }
                System.out.println("Case " + i + ": " + High + " " + low);
            }
            }

    }
