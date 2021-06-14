package module3.Lesson3_Date.ExtraTasks.TrafficLights.style2;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TrafficDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        long count = 0;
        while (count <= 1) {

            // RED
            {
                System.out.println(module3.Lesson3_Date.ExtraTasks.TrafficLights.style2.TrafficLight.RED.getAction());
                waiting(5);
            }

            // YELLOW
            {
                System.out.println(module3.Lesson3_Date.ExtraTasks.TrafficLights.style2.TrafficLight.YELLOW.getAction());
                waiting(3);
            }

            // GREEN
            {
                System.out.println(module3.Lesson3_Date.ExtraTasks.TrafficLights.style2.TrafficLight.GREEN.getAction() + "\n");
                waiting(5);
            }

            count = ChronoUnit.MINUTES.between(localTime, LocalTime.now());
        }
    }

    public static void waiting(int time) {
        LocalTime start = LocalTime.now();
        long second_count = 0;
        while (second_count <= time) {
            second_count = Duration.between(start, LocalTime.now()).getSeconds();
        }
    }
}
