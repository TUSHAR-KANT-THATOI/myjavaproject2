class Employee {
    int empid;
    String ename;
    static String compname = "seeree";

}

public class test11 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empid = 100;
        e1.compname = "gfddgj";
        String emp1 = String.format("id:%d, Name:%s,company:%s", e1.empid, e1.ename, e1.compname);
        System.out.println(emp1);

        Employee e2 = new Employee();
        String emp2 = String.format("id:%d, Name:%s,company:%s", e2.empid, e2.ename, e2.compname);
        System.out.println(emp2);
    }
}
