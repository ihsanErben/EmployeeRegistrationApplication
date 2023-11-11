
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------");
        LinkedList x = new LinkedList();
        Scanner input = new Scanner(System.in);
        int cikis = 1;
        while (cikis == 1) {
            System.out.println("1 - add employee");
            System.out.println("2 - update employee informations");
            System.out.println("3 - remove employee");
            System.out.println("4 - print all employees");
            System.out.print("Choose an option: ");
            int option = input.nextInt();

            switch (option) {
                case 0:
                    return;
                case 1:
                    x.add_employee();
                    break;
                case 2:
                    x.updateEmployeeInformations();
                    break;
                case 3:
                    x.removeEmployee();
                    break;
                case 4:
                    x.printAllEmployees();
                    break;
                default:
                    System.out.println("----- INVALID VALUE -----");
                    break;
            }
            System.out.println("---------------------------------------------------------------------------");
        }
    }
}
