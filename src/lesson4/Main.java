package lesson4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        int [] arr = {1,2,3};
//        int [] clonedInArr = arr.clone();
//        clonedInArr [2] = 8;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(clonedInArr));

        Person person = new Person("BOB", 22);
        Person person1 = new Person("BOB", 31);
        Person person2 = new Person("DIL", 23);
        Person person4 = new Person("Ivan", 31);
        Person person5 = new Person("Petro", 41);


        HashMap<String, Person> personHashMap = new HashMap();
        personHashMap.put("one", person1);
        personHashMap.put("two", person2);
        personHashMap.put("three", person4);
        personHashMap.put("fore", person5);
        personHashMap.put("five", person);


        Collection<Person> values = personHashMap.values();
        for (Person value : values) {
            System.out.println(value);
        }

        System.out.println("++++++++++++++");

        Set<String> stringSet = personHashMap.keySet();
        for (String s : stringSet) {
            System.out.println(s);
        }
        System.out.println("==================");

        Set<Map.Entry<String, Person>> entries = personHashMap.entrySet();
        for (Map.Entry<String, Person> entry : entries) {
            System.out.println(entry);
        }

        System.out.println("---------------------------");
        Iterator<Map.Entry<String, Person>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Person> entriesMap = iterator.next();
            if (entriesMap.getValue().getName().equals("DIL")){
                entriesMap.setValue(new Person("ooo", entriesMap.getValue().getAge()));
            }
            String key = entriesMap.getKey();
        }
        for (Map.Entry<String, Person> entry : entries) {
            System.out.println(entry);
        }



//        ArrayList<Person> list = new ArrayList<>();
//        list.add(person);
//        list.add(person1);
//        list.add(person2);
//        list.add(person4);
//        list.add(person5);
//
//        for (Person person3 : list) {
//            System.out.println(person3);
//        }
//
//        Collections.sort(list);
//        System.out.println("**************************");
//        for (Person person6 : list) {
//            System.out.println(person6);
//
//        }
//
//        System.out.println("**************************1");
//
//        TreeSet<Person> personTreeSet = new TreeSet<>(ageComparator.thenComparing(nameComparator));
//        personTreeSet.addAll(list);
//        for (Person tree1 : personTreeSet) {
//            System.out.println(tree1);
//        }
//
//
////        for (Person tree : personTreeSet) {
////            System.out.println(tree);
////        }
//
////        System.out.println(person.equals(person1));
//////        System.out.println(person.hashCode());
//////        System.out.println(person1.hashCode());
//////        System.out.println(person);
//////        System.out.println(person1);
//
//    }
//
//    private static Comparator<Person> nameComparator = new Comparator<Person>() {
//
//        @Override
//        public int compare(Person o1, Person o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    };
//
//    private static Comparator<Person> ageComparator = new Comparator<Person>() {
//        @Override
//        public int compare(Person o1, Person o2) {
//            return Integer.compare(o1.getAge(),o2.getAge());
//        }
//    };


    }
}
