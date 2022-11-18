package date_time_in_java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeInJava {

    private LocalTime startTime;

    private LocalTime endTime;

    private LocalDateTime localDateTime;


    public static void main(String[] args) throws ParseException {

        DateTimeInJava obj = new DateTimeInJava();

        String dateString3 = "12:20 PM";
        String dateString4 = "01:30 PM";

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try{

            String s = DateTimeInJava.englishTime(dateString3);
            String s1 = DateTimeInJava.englishTime(dateString4);

            Integer[] time1 = obj.splitNumber(s);
            Integer[] time2 = obj.splitNumber(s1);

            obj.startTime = LocalTime.of(time1[0], time1[1]);
            obj.endTime = LocalTime.of(time2[0], time2[1]);

            long l = Duration.between(obj.endTime, obj.startTime).toMinutes();

            long hours = l / 60; //since both are ints, you get an int
            long minutes = l % 60;
            String duration = Math.abs(hours) + ":" + Math.abs(minutes);
            System.out.println(duration);


        }catch(ParseException e){
            e.printStackTrace();
        }



    }

    public Integer[] splitNumber(String str){

        Integer[] hourAndMinute = new Integer[2];

        String[] split = str.split(":");
        hourAndMinute[0] = Integer.valueOf(split[0]);
        hourAndMinute[1] = Integer.valueOf(split[1]);

        return hourAndMinute;

    }

    public static String englishTime(String input)
            throws ParseException
    {

        DateFormat dateFormat
                = new SimpleDateFormat("hh:mm aa");

        DateFormat format
                = new SimpleDateFormat("HH:mm");
        Date time = null;
        String output = "";

        time = dateFormat.parse(input);

        output = format.format(time);
        return output;
    }





}
