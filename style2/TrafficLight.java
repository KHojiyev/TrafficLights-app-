package module3.Lesson3_Date.ExtraTasks.TrafficLights.style2;

public enum TrafficLight {

    RED("STOP"),
    YELLOW("WAIT"),
    GREEN("GO");

    private String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
