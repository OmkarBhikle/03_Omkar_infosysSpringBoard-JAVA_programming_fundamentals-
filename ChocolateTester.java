public class ChocolateTester {
    private int barCode;
    private String name;
    private int weight;
    private int cost;

    ChocolateTester() {
        weight = 12;
        cost = 10;
        barCode = 101;
        name = "Cadbury";
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static void main(String[] args) {
        ChocolateTester tester = new ChocolateTester();
        System.out.println(tester.name + " " + tester.barCode + " " + tester.weight + " " + tester.cost);
        tester.setBarCode(102);
        tester.setName("Hershey's");
        tester.setWeight(24);
        tester.setCost(50);
        System.out.println(tester.name + " " + tester.barCode + " " + tester.weight + " " + tester.cost);
    }
}
