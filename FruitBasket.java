package com.app.fruits;

import java.util.Scanner;

class Fruit {
    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    public Fruit() {}

    public Fruit(String color, double weight, String name, boolean isFresh) {
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.isFresh = isFresh;
    }

    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
    }

    public String taste() {
        return "no specific taste";
    }
}

class Apple extends Fruit {
    public Apple(String color, double weight, String name, boolean isFresh) {
        super(color, weight, name, isFresh);
    }

    @Override
    public String taste() {
        return "sweet and sour";
    }
}
//subclasses
class Orange extends Fruit {
    public Orange(String color, double weight, String name, boolean isFresh) {
        super(color, weight, name, isFresh);
    }

    @Override
    public String taste() {
        return "sour";
    }
}

class Mango extends Fruit {
    public Mango(String color, double weight, String name, boolean isFresh) {
        super(color, weight, name, isFresh);
    }

    @Override
    public String taste() {
        return "sweet";
    }
}

public class FruitBasket {
    private Fruit[] basket;
    private int index;
    private Scanner scanner;

    public FruitBasket(int size) {
        basket = new Fruit[size];
        index = 0;
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display Names of all Fruits");
            System.out.println("5. Display fresh Fruits info");
            System.out.println("6. Mark a fruit as stale");
            System.out.println("7. Display tastes of stale fruits");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    addMango();
                    break;
                case 2:
                    addOrange();
                    break;
                case 3:
                    addApple();
                    break;
                case 4:
                    displayNames();
                    break;
                case 5:
                    displayFreshFruits();
                    break;
                case 6:
                    markFruitAsStale();
                    break;
                case 7:
                    displayStaleFruitsTastes();
                    break;
                case 0: {
                    System.out.println("Exiting...");
                    return;
                }
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void addMango() {
        if (index < basket.length) {
            System.out.print("Enter weight: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter color: ");
            String color = scanner.nextLine();
            basket[index++] = new Mango(color, weight, "Mango", true);
        } else {
            System.out.println("Basket is full.");
        }
    }

    private void addOrange() {
        if (index < basket.length) {
            System.out.print("Enter weight: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter color: ");
            String color = scanner.nextLine();
            basket[index++] = new Orange(color, weight, "Orange", true);
        } else {
            System.out.println("Basket is full.");
        }
    }

    private void addApple() {
        if (index < basket.length) {
            System.out.print("Enter weight: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter color: ");
            String color = scanner.nextLine();
            basket[index++] = new Apple(color, weight, "Apple", true);
        } else {
            System.out.println("Basket is full.");
        }
    }

    private void displayNames() {
        for (Fruit fruit : basket) {
            if (fruit != null) {
                System.out.println(fruit.getName());
            }
        }
    }

    private void displayFreshFruits() {
        for (Fruit fruit : basket) {
            if (fruit != null && fruit.isFresh()) {
                System.out.println(fruit.toString() + ", Taste: " + fruit.taste());
            }
        }
    }
    private void markFruitAsStale() {
        System.out.print("Enter index to mark stale: ");
        int i = scanner.nextInt();
        scanner.nextLine(); 
        if (i >= 0 && i < basket.length && basket[i] != null) {
            basket[i].setFresh(false);
            System.out.println("Fruit marked as stale.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private void displayStaleFruitsTastes() {
        for (Fruit fruit : basket) {
            if (fruit != null && !fruit.isFresh()) {
                System.out.println(fruit.getName() + " Taste: " + fruit.taste());
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int size = scanner.nextInt();
        FruitBasket basket = new FruitBasket(size);
        basket.run();
    }
}
