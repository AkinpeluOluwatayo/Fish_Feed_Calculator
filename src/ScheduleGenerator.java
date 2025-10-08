import java.time.LocalTime;
import java.util.ArrayList;

public class ScheduleGenerator {

    ArrayList<String> schedule = new  ArrayList<>();

    public ArrayList<String> feedingTime(int feedingPerDay, String startTime, String endTime) {
        LocalTime start = LocalTime.parse(startTime);
        LocalTime end = LocalTime.parse(endTime);

        if (feedingPerDay <= 1)
           schedule.add(start.toString());
        return schedule;
    }

        Duration totalDuration = Duration.between(start, end);
}
