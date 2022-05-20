
public class GetDurationString {

    private static final String INVALID_INPUT = "Invalid Value";
    public static void main(String[] args) {
        
        System.out.println(getDurationString(65, 05 ));
        System.out.println(getDurationString(3045));
    }
    
    public static String getDurationString(int minutes, int seconds) {
        if ( !(minutes >= 0) || !(seconds >= 0) || !(seconds <= 59)){
            return INVALID_INPUT;
        }else{
            int hours = minutes / 60;
            int convertedMinutes = minutes % 60;
            String hoursStr = getTimeFormat(hours, "h");
            String minutesStr = getTimeFormat(convertedMinutes, "m");
            String SecondsStr = getTimeFormat(seconds, "s");
            return String.format("%s %s %s", hoursStr, minutesStr, SecondsStr); 
        }
            
            
        }
    public static String getDurationString(int seconds) {
        if (!(seconds >= 0)){
            return INVALID_INPUT;
        }else{
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }

    }

    public static String getTimeFormat(int value, String type) {
        
        String valueStr = Integer.toString(value);

        if (value < 10){
            valueStr = "0" + valueStr;
            }

        if (type.equalsIgnoreCase("h")){
            return valueStr + "HH";
        } else if(type.equalsIgnoreCase("m")){
            return valueStr + "MM";
        }else{
            return valueStr + "SS";
        }
    }
}
