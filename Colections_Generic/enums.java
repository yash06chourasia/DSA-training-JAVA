enum Traffic{
    RED("Stop") , YELLOW("Wait") ,GREEN("Go");
     
    private String action;
    public String getAction(){
        return this.action;
    }
    private Traffic(String action){
        this.action=action;
    }
}

public class enums {
    public static void main(String[] args) {
        Traffic signal=Traffic.valueOf("YELLOW");
        System.out.println(signal);
        Traffic after=Traffic.GREEN;
        System.out.println(after);
        for (Traffic t : Traffic.values()) {
            System.out.println(t + " -> " + t.getAction());
        }
    }
}
