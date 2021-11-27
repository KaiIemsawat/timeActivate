package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TimeUtils {

    public static void main(String[] args) {
        System.out.println(setTime(112800000)); // "kkmmssSSS"
    }

    public static int setTime(int beginCount) {
        int itsTime = 0;
        // HOUR xx MIN xx SEC xx MILLIS xxx
        String currentTime = "";



        while (itsTime < beginCount) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("kkmmssSSS");
            LocalDateTime now = LocalDateTime.now();
            currentTime = dtf.format(now);
            itsTime = Integer.parseInt(currentTime);

//            System.out.println(itsTime);
        }


        return itsTime;
    }
}
