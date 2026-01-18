package entities;

public class Account {

    private int number;
    private String name;
    private double value;

    public Account(int number, String name, double value) {
        this.number = number;
        this.name = name;
        this.value = value;
    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void addValue(double value) {
        this.value += value;
    }

    public void removeValue(double value) {
        this.value -= (value + 5) ;
    }

    public String toString() {
        return "Informações da conta:\n"
                + "Conta " + number
                + "\nNome: " + name
                + "\nValor na conta: R$" + String.format("%.2f", value);
    }
}
