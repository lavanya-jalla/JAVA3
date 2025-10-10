import java.util.Scanner;

public class Post {
    String msg;

    public void DupPost() {
        Scanner sc = new Scanner(System.in);
        msg = sc.nextLine();

        if (msg.length() > 50) {
            System.out.println(msg.substring(0, 49) + "...Readmore");
            String[] count = msg.split(" ");
            System.out.println(count.length);
            System.out.println(msg.length() - count.length);
            System.out.println("If you want to read more press Y key");

            if ("y".equalsIgnoreCase(sc.next())) {
                System.out.println(msg);
            } else {
                System.out.println("Exiting without showing full message.");
            }
        } else {
            System.out.println(msg);
        }
        sc.close();
    }
}

class Test {
    public static void main(String args[]) {
        Post obj = new Post();
        obj.DupPost();
    }
}
