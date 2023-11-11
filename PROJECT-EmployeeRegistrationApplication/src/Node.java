
public class Node {

    int id;
    String name;
    int price;
    String department;
    boolean transaction = false;

    Node next;
    Node prev;

    public Node(int id, String name, int price, String department) {
        if (this.id >= 0) {
            this.id = id;
        } else {
            System.out.println("Invalid id.");
            return;
        }
        this.name = name;
        this.price = price;
        this.department = department;

        if (this.id > 0) {
            this.transaction = true;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String departman) {
        this.department = departman;
    }

}
