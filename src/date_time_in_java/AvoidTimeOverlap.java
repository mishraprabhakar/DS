package date_time_in_java;

import java.time.LocalTime;

public class AvoidTimeOverlap {

    public boolean avoidTimeOverlap(){

        LocalTime start = LocalTime.of(2,21);
        LocalTime end = LocalTime.of(2, 22);

        LocalTime start1 = LocalTime.of(1,15);
        LocalTime end1 = LocalTime.of(2,20);

        if (start.isBefore(end) && end.isBefore(start1) || start.isAfter(end1) && end.isAfter(start)){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        AvoidTimeOverlap overlap = new AvoidTimeOverlap();
        boolean b = overlap.avoidTimeOverlap();
        System.out.println(b);
    }

}
