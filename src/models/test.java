import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int answer;        
        System.out.println("What is the answer?");
        answer = keyboard.nextInt();
        if (answer == 42) {
            System.out.println("Don't forget your towel!");
        }
        else {
            System.out.println("Nice Try!");
        }
        keyboard.close();
    }
}
