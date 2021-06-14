package module3.Lesson3_Date.ExtraTasks.TrafficLights.style1;

import java.time.Duration;
import java.time.LocalTime;

public class TrafficLights {
    public static void main(String[] args) {

        trafficLights();

    }

    private static void trafficLights() {
        LocalTime localTime0 = LocalTime.now();
        LocalTime localTime = LocalTime.of(localTime0.getHour(), localTime0.getMinute(), localTime0.getSecond());
        boolean red = true;
        boolean yellow = true;
        boolean green = true;
        do {
            LocalTime redLight = LocalTime.now();
            LocalTime yellowLight = LocalTime.now();
            LocalTime greenLight = LocalTime.now();
            if (Duration.between(localTime, yellowLight).getSeconds() == 4 && yellow) {
                System.out.println(Lights.YELLOW + " Wait ");
                yellow = false;
                red = true;
            }
            if (Duration.between(localTime, greenLight).getSeconds() == 8 && green) {
                System.out.println(Lights.GREEN + " Go ");
                green = false;
            }
            if (Duration.between(localTime, redLight).getSeconds() == 12 && red) {
                System.out.println(Lights.RED + " Stop ");
                localTime = LocalTime.of(redLight.getHour(), redLight.getMinute(), redLight.getSecond());
                yellow = true;
                green = true;
                red = false;
            }
        } while (true);
    }
}



