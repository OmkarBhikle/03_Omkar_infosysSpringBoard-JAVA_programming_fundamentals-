public class Chocolate {

    private int barCode;
    private String name;
    private int weight;
    private int cost;

    Chocolate() {
        barCode = 101;
        name = "Cadbury";
        weight = 12;
        cost = 10;
    }

    Chocolate(int barCode, String name, int weight, int cost) {
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
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
        Chocolate chocolate = new Chocolate();
        System.out.println(chocolate.name + " " + chocolate.barCode + " " + chocolate.weight + " " + chocolate.cost);
        chocolate.setBarCode(102);
        chocolate.setName("Hershey's");
        chocolate.setWeight(24);
        chocolate.setCost(50);
        System.out.println(chocolate.name + " " + chocolate.barCode + " " + chocolate.weight + " " + chocolate.cost);
    }
}
