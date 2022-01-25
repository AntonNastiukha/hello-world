package lesson2;

import lesson2Homework.WeekDays;

public class Main {
    public static void main(String[] args) {
//        MyMind myMind = new MyMind(JavaLanguage.JAVA);
//        System.out.println(myMind.getJavaLanguage().getClime());
//        myMind.setJavaLanguage(JavaLanguage.Kotlin);
//        System.out.println(myMind.getJavaLanguage().getClime());
//        myMind.setJavaLanguage(JavaLanguage.SCALE);
//        System.out.println(myMind.getJavaLanguage().getClime());
        int num1 = 10;
        int num2 = 2;


        Operator operator = Operator.DIVIDE;
        int result = operator.execute(num1,num2);
        System.out.println("result" + " " + result);

        operator = Operator.ADD;
        result = operator.execute(num1,num2);
        System.out.println("result" + " " + result);

        operator = Operator.MULTIPLY;
        result = operator.execute(num1,num2);
        System.out.println("result" + " " + result);

        operator = Operator.SUBTRECT;
        result = operator.execute(num1,num2);
        System.out.println("result" + " " + result);

    }
}
