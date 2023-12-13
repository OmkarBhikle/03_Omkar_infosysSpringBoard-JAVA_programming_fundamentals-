public class EmployeeRecord {
    private double[] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
    private double sum = 0;
    static double avg = 0;
    public double[] getSalary() {
        return salary;
    }

    public void getAverageSalary(double[] salary) {
        this.salary = salary;
        for (int i = 0; i < salary.length; i++) {
            double temp = salary[i];
            this.sum += temp;
        }
        avg = sum / salary.length;
        System.out.println("The average salary of employee is: " + avg ); 
    }

    public void salarMeasurement(double[] salary) {
        this.salary = salary;
        int count = 0;
        int neg_count = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i]>avg) {
                count++; 
            }
            else if(salary[i]<avg) {
                neg_count++;
            }
        }    
        System.out.println("The number of employees who earn more than average salary is: " + count);
        System.out.println("The number of employees who earn less than average salary is: " + neg_count);
    }

    public static void main(String[] args) {
        EmployeeRecord record = new EmployeeRecord();
        record.getAverageSalary(record.getSalary());
        record.salarMeasurement(record.getSalary());
    }

}
