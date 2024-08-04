package OOPs;
class  Employee1{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.print("My Employee ID is "+id);
        System.out.println(" and my Name is "+name);
//        System.out.println(" and my Salary is "+salary);
    }
    public int getSalary()
    {
        return salary;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        // Syntax : ClassName reference_variable name = new ClassName();

        // Setting Attributes for Ravi
        Employee1 ravi =new Employee1();
        ravi.id=12;
        ravi.name="Ravi Prakash.";
        ravi.salary=34000;

        // Setting Attributes for Saurabh
        Employee1 sonu =new Employee1();
        sonu.id=13;
        sonu.name="Saurabh Kumar.";
        sonu.salary=45000;

//         Setting Attributes for Ram
//        Employee1 ram =new Employee();
//        ram.id=15;
//        ram.name="Ram.";
//        ram.salary=41000;

        // Printing the Attributes
        System.out.println("(1)  "+ravi.id+" , "+ravi.name);
        System.out.println("(2)  "+sonu.id+" , "+sonu.name);

        ravi.printDetails();
        sonu.printDetails();

//        ram.printDetails();
        int salary=ravi.getSalary();
        System.out.println(salary);

    }
}