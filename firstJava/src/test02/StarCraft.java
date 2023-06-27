package test02;

import java.util.Timer;
import java.util.TimerTask;

public class StarCraft {
    private static Timer executorService;

    public static void main(String[] args) throws InterruptedException {

        Terran marine1 = new Terran("마린");
        Terran medic1 = new Terran("메딕");
        SCV scv1 = new SCV();
//        Terran scv2 = new Terran("SCV");
        marine1.attack("저그");
        marine1.attack("저그");
        marine1.attack("저그");
        medic1.cure("마린");
//        scv1.harvest("미네랄");
//        scv1.harvest("가스");
        marine1.defend("저그");
//        scv1.run();

        Timer 돈캐기 = new Timer();
        돈캐기.scheduleAtFixedRate(scv1, 1000, 3000);
        Thread.sleep(10000);
        돈캐기.cancel();

//        Timer 정찰 = new Timer();
//        정찰.scheduleAtFixedRate(marine1,1000,1000);

    }
}

class Terran{
    private String 유닛;
    private int 생명치=1;
    private int 레벨=1;

    public Terran(){

    }

    public Terran(String 유닛){
        this.유닛 = 유닛;
        System.out.println(유닛 + "(이/가) 생성되었다");
    }

    public void attack(String 적유닛) {
        System.out.println(적유닛 + "(을/를) 공격한다");
        레벨 = 레벨 + 1;
        if (레벨>=3){
            System.out.println(유닛 + "이 스팀팩을 장착했습니다.");
        }
    }

    public void cure(String 유닛) {
        System.out.println(유닛 + "(을/를) 치료합니다.");
    }

//    public void harvest(String 광물) {
//        System.out.println(유닛+"이 " + 광물 + "(을/를) 채취했습니다.");
//    }

    public void defend(String 적유닛) {
        System.out.println(유닛 + "이 " + 적유닛 + "한테 공격당했습니다.");
        생명치 -=1;
        if(생명치==0) System.out.println(유닛+ "이 죽었습니다.");
    }
}

class SCV extends TimerTask {

    @Override
    public void run() {
        System.out.println("광물을 캐고 있습니다.");
    }
}
