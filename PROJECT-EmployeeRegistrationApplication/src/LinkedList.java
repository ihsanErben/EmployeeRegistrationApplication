
import java.util.Scanner;

public class LinkedList {

    Node first;
    Node last;
    Scanner input = new Scanner(System.in);

    public void add_employee() {
        System.out.print("id: ");
        int id = input.nextInt();
        System.out.print("name: ");
        String name = input.next();
        System.out.print("price: ");
        int price = input.nextInt();
        System.out.print("department: ");
        String department = input.next();
        Node newNode = new Node(id, name, price, department);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
    }

    public void printAllEmployees() {
        if (first == null) {
            System.out.println("--- EMPTY ---");
        } else {
            Node tmp = first;
            while (tmp != null) {
                System.out.println("--------------------------------------------");
                System.out.println("id: " + tmp.id);
                System.out.println("name: " + tmp.name);
                System.out.println("price: " + tmp.price);
                System.out.println("department: " + tmp.department);

                tmp = tmp.next;
            }
        }
    }

    public void updateEmployeeInformations() {
        if (first == null) {
            System.out.println("--- EMPTY ---");
        } else {
            System.out.print("enter a id that you want to change employee's id: ");
            int id = input.nextInt();
            Node tmp = first;

            while (tmp != null) {
                if (tmp.id == id) {
                    System.out.println("What do you want to change -->   1)id    2)name   3)price   4)department");
                    System.out.print("Please choose an option: ");
                    int option = input.nextInt();
                    switch (option) {
                        case 0:
                            return;
                        case 1:
                            System.out.print("new id: ");
                            int newId = input.nextInt();
                            tmp.setId(newId);
                            System.out.println("Process completed");
                            return;
                        case 2:
                            System.out.print("new name: ");
                            String newName = input.next();
                            tmp.setName(newName);
                            System.out.println("Process completed");
                            return;
                        case 3:
                            System.out.print("new price: ");
                            int newPrice = input.nextInt();
                            tmp.setPrice(newPrice);
                            System.out.println("Process completed");
                            return;
                        case 4:
                            System.out.print("new department: ");
                            String newDepartment = input.next();
                            tmp.setDepartment(newDepartment);
                            System.out.println("Process completed");
                            return;
                        default:
                            System.out.println("----- INVALID VALUE -----");
                            break;
                    }
                }
                tmp = tmp.next;
            }
            System.out.println("There is not such id: " + id);
        }
    }

    public void removeEmployee() {
        if (first == null) {
            System.out.println("--- EMPTY ---");
        } else if (first == last) {
            first = null;
            System.out.println("Last employee was deleted.");
        } else {
            System.out.print("What is the id that you want to change employee's id : ");
            int id = input.nextInt();
            Node tmp = first;
            while (tmp != null) {
                if (tmp.id == id) {

                    if (first.next == last) {
                        if (tmp == first) {
                            tmp.next.prev = null;
                            first = tmp.next;
                            tmp.next = null;
                            System.out.println("Process completed.");
                            return;
                        } else {
                            tmp.prev.next = null;
                            last = tmp.prev;
                            tmp.prev = null;
                            System.out.println("Process completed.");
                            return;
                        }
                    } else {
                        tmp.prev.next = tmp.next;
                        tmp.next.prev = tmp.prev;
                        tmp.prev = null;
                        tmp.next = null;
                        System.out.println("Process completed.");
                        return;
                    }
                }
                tmp = tmp.next;
            }
            System.out.println("There is not such id: " + id);
        }
    }
}
