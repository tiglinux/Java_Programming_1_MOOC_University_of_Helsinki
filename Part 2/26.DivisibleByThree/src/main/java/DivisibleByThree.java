
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3,30);
    }

    public static void divisibleByThreeInRange(int beg, int end){
        for(int i = beg; i <= end; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

}
