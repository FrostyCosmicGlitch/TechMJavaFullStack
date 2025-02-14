/*
// array list
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        for(Integer a:num){
            System.out.println(a);
        }
        num.set(1,6);
        for(Integer a:num){
            System.out.println(a);
        }
        num.remove(4);
        for(Integer a:num){
            System.out.println(a);
        }
    }
}



//linkedlist

import java.util.LinkedList;

public class Main{
    public static void main(String [] args){
        LinkedList<String> names=new LinkedList<>();
        names.add("abi");
        names.add("bala");
        names.add("cathy");
        names.add("dorthy");
        names.add("emily");
        System.out.println("this current list is :");
        for (String a:names){
            System.out.println(a);
        }
        names.remove(1);
        names.add(2,"flappy");
        System.out.println("the updated list is:");
        for (String a:names){
            System.out.println(a);
        }
    }
}



//hashset

import  java.util.HashSet;
public class Main{
    public static void main(String [] args){
        HashSet<String> names=new HashSet<>();
        names.add("Cathy");
        names.add("Jenny");
        names.add("Mira");
        names.add("Paaru");
        names.add("Serina");
        names.add("Jenny");
        System.out.println(names);

        names.remove("Paaru");
        System.out.println(names);

    }
}



//Tree set

import  java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);
        System.out.println(numbers);
        numbers.remove(3);
        System.out.println(numbers);
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());
        System.out.println("Elements less than 6: " + numbers.headSet(6));
        System.out.println("Elements greater than or equal to 5: " + numbers.tailSet(5));
        System.out.println("Elements less than 6: " + numbers.headSet(6));
        System.out.println("Elements greater than or equal to 5: " + numbers.tailSet(5));
        numbers.pollFirst();
        numbers.pollLast();
        System.out.println("After removing first and last: " + numbers);
    }
}



// Hash map

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> values=new HashMap<>();
        values.put("One",1);
        values.put("Two",2);
        values.put("Three",3);
        values.put("Four",4);
        values.put("Five",5);
        values.replace("Two", 6);
        values.remove("Five");
        System.out.println(values);
        for (Map.Entry<String,Integer> entry:values.entrySet()){
            System.out.println("Key: "+entry.getKey()+",values:"+entry.getValue());
        }
        for (String key : values.keySet()) {
            System.out.println("Key: " + key);
        }
        for (Integer value : values.values()) {
            System.out.println("Value: " + value);
        }


    }
}

 */


// task 1
import java.util.*;


public class Main {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String sentence=scanner.nextLine();
        List<String> listt= Arrays.asList(sentence.split(" "));
        int leng =listt.size();
        Set<String> words=new HashSet<>();
        for (String a:listt){
            words.add(a);
        }

        System.out.println("unordered unique sentence: "+words);
        TreeSet<String> ordered=new TreeSet<>(words);

        System.out.println("orderd sectence:"+ordered);
        scanner.close();
    }
}
