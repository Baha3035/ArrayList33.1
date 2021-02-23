package kg.megacom;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> books = new ArrayList<>();

        books.add("First Million");
        books.add("Samurai without a sword");
        books.add("How to get friends?");
        books.add("First 20 hours of learning");
        books.add("Art of not giving a fuck");

            books.forEach(System.out::println);
        System.out.println(" ");

        books.remove(4);
            books.forEach(System.out::println);
        System.out.println(" ");

        books.set(3, "Art of not giving a fuck");
        System.out.println(books.get(3));

        books.clear();

        books.add("Art of Java");
        books.add("Harry Potter: The Last Chapter");
        books.add("History of a Humanity");
        }
    }
