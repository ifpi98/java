package test03;

public class Bus {

    int busNumber;
    int money;
    int passengerCount;
    int busFee = 1000;

    public Bus(int busNumber) {
        this.busNumber= busNumber;
    }

    public void take(){
        this.money += busFee;
        passengerCount++;
    }

    public void showBusInfo(){
        System.out.println(busNumber+"번 버스의 승객은 " + passengerCount + " 명이고, 수입은" + money);
    }

}
