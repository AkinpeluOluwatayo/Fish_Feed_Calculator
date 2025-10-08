
import static org.junit.jupiter.api.Assertions.assertEquals;

import main.java.org.model.FishInfo;
import main.java.org.model.FishCalculator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class test_feed_calculator{
    @Test
    public void testAverageWeight() {
        double actual = FishCalculator.averageWeight(2.50,5);
        double expected = 0.05;
        assertEquals(expected, actual);
    }
    @Test
    public void testBiomass() {
        double actual = FishCalculator.bioMass(2.50,200);
        double expected = 500;
        assertEquals(expected, actual);
    }
    // test for fish info class

    @Test
    public void testCollectFishInfomation(){
        FishInfo fi = new FishInfo();
        ArrayList<String> actual = fi.collectFishInfomation("Heteroclarias","5","2.0","200");
        ArrayList<String>  expected = new ArrayList<>(Arrays.asList("Heteroclarias", "5", "2.0", "200"));
        assertEquals(expected, actual);
    }
    @Test
    public void testScheduleGenerator(){
        ScheduleGenerator sg = new ScheduleGenerator();
        ArrayList<String> actual = sg.feedingTime();
    }



}