package lesson2Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        tomorrowIs();
        fullNameFormatCheck();

    }
    public static void fullNameFormatCheck(){
        System.out.println("write your full name");
        String fullName = scanerString();
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}\\s{1}[A-Z][a-z]{2,}\\b");
        Matcher matcher = pattern.matcher(fullName);
        if (matcher.matches()){
            System.out.println("correct");
        }
        else {
            System.out.println("incorrect");
            fullNameFormatCheck();
        }
    }

    public static void tomorrowIs() {
        System.out.println("write the day of the week");
        String today = scanerString().toLowerCase();
        switch (today) {
            case "monday":
                System.out.println(WeekDays.MONDAY.tomorrow());
                break;
            case "tuesday":
                System.out.println(WeekDays.TUESDAY.tomorrow());
                break;
            case "wednesday":
                System.out.println(WeekDays.WEDNESDAY.tomorrow());
                break;
            case "thursday":
                System.out.println(WeekDays.THURSDAY.tomorrow());
                break;
            case "friday":
                System.out.println(WeekDays.FRIDAY.tomorrow());
                break;
            case "saturday":
                System.out.println(WeekDays.SATURDAY.tomorrow());
                break;
            case "sunday":
                System.out.println(WeekDays.SUNDAY.tomorrow());
                break;
                default:
                    System.out.println("incorrect note");
                    tomorrowIs();

        }

    }

    public static String scanerString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
