package test04;

public class CommandCenter {

    private static CommandCenter instance = new CommandCenter();
    public static int unit = 0;

    private CommandCenter(){}

    public static CommandCenter getInstance(){
        if(instance == null) {
            instance = new CommandCenter();
        }
        return instance;
    }

    public Factory createFactory(String name){
        Factory factory = new Factory(name);
        return factory;

    }

    public static void main(String[] args) {

    }

}
