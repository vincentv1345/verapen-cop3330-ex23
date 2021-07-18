package org.example;
import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;
public class diagnoseCar {
    public void diagnosis(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key? ");
        String silent = scanner.nextLine();
        if(silent.equalsIgnoreCase("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String terminals = scanner.nextLine();
            switch (terminals) {
                case "y":
                    System.out.println("Clean terminals try starting again");
                    break;
                case "n":
                    System.out.println("Replace cables try again");
                    break;
            }
        }
        else if(silent.equalsIgnoreCase("n")){
            System.out.println("Does the car make a slicking noise? ");
            String slick = scanner.nextLine();
                if(slick.equalsIgnoreCase("y")){
                    System.out.println("Replace Batteries");
                }
                else if(slick.equalsIgnoreCase("n")){
                    System.out.println("Does the car crank up but fail to start? ");
                    String crank = scanner.nextLine();
                    if(crank.equalsIgnoreCase("y")){
                        System.out.println("Check spark plug connections.");
                    }
                    else if(crank.equalsIgnoreCase("n")){
                        System.out.print("Does the engine start and then die? ");
                        String engine = scanner.nextLine();
                        if(engine.equalsIgnoreCase("y")) {
                            System.out.print("Does your car have fuel injection? ");
                            String injection = scanner.nextLine();
                            if (injection.equalsIgnoreCase("y")) {
                                System.out.println("Get it in for service.");
                            } else if (injection.equalsIgnoreCase("n")) {
                                System.out.println("Check to ensure the choke is opening and closing.");
                            }
                        }
                        else if(engine.equalsIgnoreCase("n")){
                                System.out.println("This should not be possible. ");
                        }
                    }
                }
        }
    }
}