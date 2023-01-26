package practice;

public class Car {
    // �R��iKm/L�j
    private double fuelCost;
    // �c�ʁiL�j
    private double fuelAmount;

    // �R���X�g���N�^���쐬
    public Car(double fuelCost, double fuelAmount) {
        this.fuelCost = fuelCost;
        this.fuelAmount = fuelAmount;
    }

    public void move(int km) {
        System.out.println(km + " km ����܂�");
        this.fuelAmount -= (km / fuelCost);
    }

    public double getFuelAmount() {
        return this.fuelAmount;
    }
}