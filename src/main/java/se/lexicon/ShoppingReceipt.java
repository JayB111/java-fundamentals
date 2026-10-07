package se.lexicon;

public class ShoppingReceipt {

    public static void main(String[] args) {

        String coffee = "Coffee";
        int coffeeQuantity = 1;
        double coffeePrice = 45.50;
        double coffeeTotal = coffeeQuantity * coffeePrice;

        String sugar = "Sugar";
        int sugarQuantity = 1;
        double sugarPrice = 20.00;
        double sugarTotal = sugarQuantity * sugarPrice;

        String cigarettes = "Cigarettes";
        int cigarettesQuantity = 2;
        double cigarettesPrice = 75.00;
        double cigarettesTotal = cigarettesQuantity * cigarettesPrice;
        double total = coffeeTotal + sugarTotal + cigarettesTotal;

        System.out.println("====================");
        System.out.println("      RECEIPT");
        System.out.println("====================");

        System.out.println("Item: " + coffee);
        System.out.println("Quantity: " + coffeeQuantity);
        System.out.println("Price: " + coffeePrice);
        System.out.println("Total: " + coffeeTotal);
        System.out.println("--------------------");

        System.out.println("Item: " + sugar);
        System.out.println("Quantity: " + sugarQuantity);
        System.out.println("Price: " + sugarPrice);
        System.out.println("Total: " + sugarTotal);
        System.out.println("--------------------");

        System.out.println("Item: " + cigarettes);
        System.out.println("Quantity: " + cigarettesQuantity);
        System.out.println("Price: " + cigarettesPrice);
        System.out.println("Total: " + cigarettesTotal);
        System.out.println("--------------------");

        System.out.println("TOTAL: " + total);
        System.out.println("====================");

    }
}