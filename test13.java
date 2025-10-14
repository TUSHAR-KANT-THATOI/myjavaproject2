class Employee {
    int empid;
}

public class test13 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.empid);
        e1.empid = 33;
        System.out.println(e1.empid);
    }

}
