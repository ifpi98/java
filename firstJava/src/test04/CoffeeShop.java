package test04;

public class CoffeeShop {
    int money;

    public String bewing(int money){
        this.money += money;
        if(money==Menu.STAR_AMERICANO){
            return "별 다방 아메리카노를 구했습니다.";
        } else if(money == Menu.STAR_LATTE){
            return "별 다방 라떼를 구했습니다.";
        } else if(money == Menu.BEAN_AMERICANO){
            return "콩 다방 아메리카노를 구했습니다.";
        } else if(money == Menu.BEAN_LATTE) {
            return "콩 다방 라떼를 구했습니다.";
        } else {
            return null;
        }
    }


}
