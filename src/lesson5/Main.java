package lesson5;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)  throws EmptyArrayExсeption{
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(25);
//        list.add(24);
//        list.add(22);
//        list.add(285);
//        list.add(28);
//        list.add(25);
//        list.add(52);
//        list.add(288);
//        list.add(28);
//        list.add(25);
//        list.add(255);
//
//
//
//        list.sort(((o1, o2) -> o2.compareTo(o1)));
//
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
//        List<Friend> friendList = Stream.of("Anton", "Oksana", "Ruslan").map(Friend::new).collect(Collectors.toList());
//
////        for (Friend friend : friendList) {
////            System.out.println(friend);
////        }
//
//        List<String> collect = Stream.of("Anton", "Oksana", "Ruslan")
//                .map(p -> p.toUpperCase()).collect(Collectors.toList());
//
//        for (String s : collect) {
//            System.out.println(s);
//
//        }
//
//        List<String> collect1 = Stream.of(" Anton  Nastiukha", "Oksana     Scovron", "Ruslan  Har   ")
//                .map(n->StringUtils.normalizeSpace(n)).collect(Collectors.toList());
//
//
//        for (String s : collect1) {
//            System.out.println(s);
//
//        }
//        MyNumber myNumber;
//        myNumber = () ->123.45;
//        System.out.println(myNumber.getValue());
//        myNumber = () -> Math.random()*100;
//        System.out.println(myNumber.getValue());

//        NomerikTest isEven = i -> i % 3 == 0;
//        System.out.println(isEven.test(145));
//        System.out.println(isEven.test(144));

//        NomerikTest IsEven1 = i -> i >= 0;
//        if (IsEven1.test(12)) {
//            System.out.println("додатнє або 0");
//        }
//        if (!IsEven1.test(-11)) {
//            System.out.println("відємне");
//        }


//        MuInterf muInterf = n -> {
//            int result = 1;
//            for (int i = 1; i <= n; i++) {
//                result = i * result;
//            }
//            return result;
//        };

//        System.out.println(muInterf.myMethod(10));

        MuInterf muInterf1 = str -> {
            String s = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                s += str.charAt(i);
            }
            return s;
        };

        System.out.println(muInterf1.myMethod("doog si avaj"));

        String inStr="Лябда виражения повишают";
        String outStr;

        System.out.println("це вихідне поле " + inStr);

        outStr = stringOP(srt ->srt.toUpperCase(),inStr);
        System.out.println("це поле з великої букви " + outStr);

        outStr = stringOP(str ->{
            String result = "";
            for (int i = 0;i<str.length();i++ ){
                if(str.charAt(i)!=' '){
                    result += str.charAt(i);
                }
            }
            return result.toUpperCase();
        },inStr);

        System.out.println("а це без пробілів " + outStr);


        double [] values = {1.0,2.0,3.0,4.0};

        DoubleNomericArrFunk average = (n) -> {
            double sum = 0;
            if (n.length == 0){
                throw new EmptyArrayExсeption();
            }
            for (int i = 0; i < n.length; i++){
                sum += n[i];
            }
            return sum/n.length;
        };

        System.out.println(average.funk(values));
//        System.out.println(average.funk( new double [0]));



    }


    static String stringOP (MuInterf my,String s){
        return my.myMethod(s);


    }








}



