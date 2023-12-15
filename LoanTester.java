public class LoanTester {
    public static void main(String[] args) {
        Loan obj1 = new Loan();
        Loan obj2 = new Loan();
        Loan obj3 = new Loan(101, 213179112, 100000f, 5, 7.5f);
        Loan obj4 = new Loan(102, 213199101, 1000000f, 8, 9.7f);
        Loan.getLoanCounter();
        System.out.println(Loan.getLoanCounter());
    }
}
