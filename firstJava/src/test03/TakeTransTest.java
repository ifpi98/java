package test03;

// 학생이 지하철타는 과정을
// 학생 - 이름, 돈,
// 버스타다(Bus bus) bus.take(), 돈이 차감
// 지하철타다(Subway subway) subway.take(), 돈이 차감
// 학생의 남은 돈이 얼마다를 출력

// 버스 - 버스 번호, 승객 수, 돈
// 100번 버스의 승객 수, 수입을 얼마다를 출력

public class TakeTransTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mike", 5000);
        Teacher t2 = new Teacher("Brown", 10000);

        Bus bus100 = new Bus(100);
        Subway greenLine = new Subway(2);

        t1.takeBus(bus100);
        t2.takeSubway(greenLine);

        bus100.showBusInfo();
        greenLine.showSubwayInfo();
        t1.showInfo();
        t2.showInfo();

        bus100.busFee = 1100;
        greenLine.subwayFee = 1300;

        t2.takeBus(bus100);
        t1.takeSubway(greenLine);

        bus100.showBusInfo();
        greenLine.showSubwayInfo();
        t1.showInfo();
        t2.showInfo();

        bus100.busFee = 1300;
        greenLine.subwayFee = 1500;

        t1.takeBus(bus100);
        t2.takeSubway(greenLine);

        bus100.showBusInfo();
        greenLine.showSubwayInfo();
        t1.showInfo();
        t2.showInfo();

    }
}
