public class PermanentEmployee extends Employee {
    public double basicPay;
    public double hra;
    public int experience;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary(double basicPay, double hra, int experience) {
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
        double varComponent = 0;
        if(experience<3) {
            varComponent = 0;
        }
        else if(experience>=3 && experience<5) {
            varComponent = 0.05*basicPay;
        }
        else if(experience>=5 && experience<10){
            varComponent = 0.07*basicPay;
        }
        else if(experience>=10){
            varComponent = 0.12*basicPay;
        }
        else{
            System.out.println("Please provide valid inputs");
        }

        this.salary = basicPay + hra + varComponent;
        
    }
    
}