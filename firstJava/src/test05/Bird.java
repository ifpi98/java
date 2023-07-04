package test05;

public class Bird extends Pet{
    String type;
    boolean flightYN;

    public boolean getFlight() {
        return flightYN;
    }

    // Override (펫으로부터 상속받은 게 있지만, 따로 선언함)
    public void move() {
        String flight = flightYN ? "새가 날아간다" : "새가 빨리 걸어간다.";
        System.out.println(flight);
    }

}
