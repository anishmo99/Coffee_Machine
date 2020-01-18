package machine;

import javax.swing.*;
import java.util.*;
import java.lang.Math;

public class CoffeeMachine
{
    private static Scanner sc=new Scanner(System.in);

    private static void Action()
    {
        int cups, water, milk, coffeeBeans, cost, x=0;
        String action;
        water=400;
        milk=540;
        coffeeBeans=120;
        cups=9;
        cost=550;
        String buy="buy", fill="fill", take="take", remaining="remaining", exit="exit";
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            action = sc.next();
            if (action.equalsIgnoreCase(buy)) {
                System.out.println("What do you want to buy? ");
                System.out.println("1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String y=sc.next();
                if(Character.isDigit(y.charAt(0)))
                    x=Integer.parseInt(y);
                switch (x) {
                    case 1://espresso
                    {
                        if(water>=250)//&&coffeeBeans>=16)
                        {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            coffeeBeans -= 16;
                            cost += 4;
                            cups--;
                        }
                        else
                        {
                            //if(water<250)
                                System.out.println("Sorry, not enough water!");
                            //else
                              //  System.out.println("Sorry, not enough coffee beans!");
                        }
                            break;
                    }
                    case 2://latte
                    {
                        if(water>=350) {//&&milk>=75&&coffeeBeans>=20) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 350;
                            milk -= 75;
                            coffeeBeans -= 20;
                            cost += 7;
                            cups--;
                        }
                        else
                        {
                           // if(water<350)
                                System.out.println("Sorry, not enough water!");
                        }
                        break;
                    }
                    case 3://cappuccino
                    {
                        if(water>=200) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 200;
                            milk -= 100;
                            coffeeBeans -= 12;
                            cost += 6;
                            cups--;
                        }
                        else
                        {
                            System.out.println("Sorry, not enough water!");
                        }
                        break;
                    }
                    default:
                        System.out.println("Wrong input.");
                }
            } else if (action.equalsIgnoreCase(fill)) {
                System.out.println("Write how many ml of water do you want to add: ");
                water += sc.nextInt();
                System.out.println("Write how many ml of milk do you want to add: ");
                milk += sc.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                coffeeBeans += sc.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add");
                cups += sc.nextInt();
            } else if (action.equalsIgnoreCase(take)) {
                System.out.println("I gave you $" + cost);
                cost = 0;
            }
            else if (action.equalsIgnoreCase(remaining)) {
                System.out.println("The coffee machine has:");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(coffeeBeans + " of coffee beans");
                System.out.println(cups + " of disposable cups");
                System.out.println(cost + " of money");
            }
        }while(!action.equalsIgnoreCase(exit));
    }
    public static void main(String[] args)
    {
        //StartMessage(); STAGE 1
        //cupCoffee(); STAGE 2
        //checkCoffee(); STAGE 3
        Action();// STAGE 4
    }
}






