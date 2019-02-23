import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên SV cần tìm :");
        String name = scanner.nextLine();
        fineName(name);

    }
    public static String[] fineName(String name)
    {
        boolean check =false;
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        for (int x = 0; x < students.length; x++)
        {
            if (students[x].equals(name))
            {
                System.out.println(name + " at " + (x+1));
                check = true;
                break;
            }
        }
        if(check==false)
            System.out.println("Cannot find.");
        return students;
    }
}
