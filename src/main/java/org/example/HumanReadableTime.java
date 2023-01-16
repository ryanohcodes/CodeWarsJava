package org.example;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        StringBuilder ans = new StringBuilder();
        // divide by 3600 and get the hours
        int hours = (int) Math.floor(seconds/3600);
        String hoursPlace = Integer.toString(hours);
        if(hoursPlace.length() < 2) {
            hoursPlace = "0" + hoursPlace;
        }
        ans.append(hoursPlace);
        ans.append(":");
        // subtract from the seconds
        seconds -= hours * 3600;
        // divide by 60 to get the minutes
        int minutes =(int) Math.floor(seconds/60);
        String minutesPlace = Integer.toString(minutes);
        if(minutesPlace.length() < 2){
            minutesPlace = "0" + minutesPlace;
        }
        ans.append(minutesPlace);
        ans.append(":");
        // subtract minutes from seconds
        seconds -= minutes * 60;
        String secondsPlace = Integer.toString(seconds);
        if(secondsPlace.length() < 2){
            secondsPlace = "0" + secondsPlace;
        }
        ans.append(secondsPlace);
        // add seconds
        return ans.toString();
    }
}
