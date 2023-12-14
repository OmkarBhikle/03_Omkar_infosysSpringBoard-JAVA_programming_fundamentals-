public class Employee {
    public int empId;
    public String name;
    public double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double sal) {
        salary = sal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int emp) {
        empId = emp;
    }

    public String getName() {
        return name;
    }

    public void setName(String naam) {
        name = naam;
    }

    public void Display(String naam, double salary) {
        System.out.println("Name: " + naam);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        PermanentEmployee employee1 = new PermanentEmployee();
        ContractEmployee employee2 = new ContractEmployee();

        employee1.setName("Anil");
        employee1.setEmpId(101);
        employee1.setBasicPay(10000);
        employee1.setHra(1500);
        employee1.setExperience(3);
        employee1.calculateSalary(employee1.getBasicPay(), employee1.getHra(), employee1.getExperience());
        employee1.setSalary(employee1.getSalary());
        employee1.Display(employee1.getName(), employee1.getSalary());

        employee2.setName("Ankit");
        employee2.setEmpId(102);
        employee2.setWages(500);
        employee2.setHours(10);
        employee2.calculateSalary(employee2.getWages(), employee2.getHours());
        employee2.setSalary(employee2.getSalary());
        employee2.Display(employee2.getName(), employee2.getSalary());
    }
}
