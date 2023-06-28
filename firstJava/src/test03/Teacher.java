package test03;

// 학생이 지하철타는 과정을
// 학생 - 이름, 돈,
// 버스타다(Bus bus) bus.take(), 돈이 차감
// 지하철타다(Subway subway) subway.take(), 돈이 차감
// 학생의 남은 돈이 얼마다를 출력

public class Teacher {
    String name;
    int money;

    public Teacher(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {      // 승차
        bus.take();
        this.money -= bus.busFee;
    }

    public void takeSubway(Subway subway) {
        subway.take();
        this.money -= subway.subwayFee;
    }

    public void showInfo() {
        System.out.println(this.name + "은 현재 " + this.money + " 원을 가지고 있습니다.");
    }
}
