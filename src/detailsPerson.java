import java.util.InputMismatchException;
import java.util.Scanner;

public class detailsPerson {
    public static void main(String[] args) {
        String firstName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię:");
        int strLength = "Jan".length();
        try {
        firstName = sc.nextLine();
            System.out.println("Wczytano imię: ");
        }catch (NameUndefinedException ex){
            System.err.println("Podane imię jest nullem lub ma 1 albo 2 litery," +
                    "podaj imię jeszcze raz: ");
            ex.printStackTrace();
        }
        System.out.println("Podałeś imię: "+ firstName);
        sc.close();
    }
}
