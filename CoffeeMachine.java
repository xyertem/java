import java.util.Scanner;

public class CoffeeMachine {

    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int totalOfCoffeeCup = 9;
    public static int totalMoney = 550;

    public static void main(String[] args) {
        //coffeeMachineResources();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");

        while (true){
            String orderType = userInput.next();
            switch(orderType) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String selectedKey = userInput.next();
                    if (selectedKey.equals("back")) break;
                    int valid_resources = validation();
                    if (valid_resources != 4) {
                        if (valid_resources == 0)
                            System.out.println("Sorry, not enough water!");
                        if (valid_resources == 1)
                            System.out.println("Sorry, not enough beans!");
                        if (valid_resources == 2)
                            System.out.println("Sorry, not enough milk!");
                        break;
                    } else {
                        System.out.println("I have enough resources, making you a coffee!");
                        coffeeType(selectedKey);
                    }
                    System.out.println();
                    //coffeeMachineResources();
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water += userInput.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += userInput.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beans += userInput.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    totalOfCoffeeCup += userInput.nextInt();
                    System.out.println();
                    //coffeeMachineResources();
                    break;
                case "take":
                    int money_taken = totalMoney;
                    totalMoney = 0;
                    System.out.printf("I gave you $%d", money_taken);
                    System.out.println();
                    System.out.println();
                    //coffeeMachineResources();
                    break;
                case "remaining":
                    System.out.println();
                    coffeeMachineResources();
                    break;
                case "exit":
                    userInput.close();
                    System.exit(0); // exit the program
            }
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
        }
    }
    public static int validation(){
        if(water < 200 )
            return 0;
        if(beans < 12)
            return 1;
        if(milk < 75 )
            return 3;
        return 4;
    }
    public static void coffeeType(String selectedKey){
        switch (selectedKey) {
            case "1" -> {
                water -= 250;
                beans -= 16;
                totalMoney += 4;
                totalOfCoffeeCup--;
            }
            case "2" -> {
                water -= 350;
                milk -= 75;
                beans -= 20;
                totalMoney += 7;
                totalOfCoffeeCup--;
            }
            case "3" -> {
                water -= 200;
                milk -= 100;
                beans -= 12;
                totalMoney += 6;
                totalOfCoffeeCup--;
            }
        }
    }
    public static void coffeeMachineResources(){

        System.out.println("The coffee machine has:");

        System.out.println(water + " ml of water");

        System.out.println(milk + " ml of milk");

        System.out.println(beans + " g of coffee beans");

        System.out.println(totalOfCoffeeCup + " disposable cups");

        System.out.println("$"+ totalMoney + " of money");

        System.out.println();
    }
}
