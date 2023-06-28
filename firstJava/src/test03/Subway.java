package test03;

public class Subway {

    int lineNumber;
    int money;
    int passengerCount;
    int subwayFee = 1200;

    public Subway(int i) {
        this.lineNumber= i;
    }

    public void take(){
        this.money += subwayFee;
        passengerCount++;
    }

    public void showSubwayInfo(){
        System.out.println(lineNumber+"번 지하철의 승객은 " + passengerCount + " 명이고, 수입은" + money);
    }


}
