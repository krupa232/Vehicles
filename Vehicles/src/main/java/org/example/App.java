package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class App extends Vehicles
{
    private static final Logger logger = LogManager.getLogger(App.class);
    private Scanner scanner = new Scanner(System.in);
    private String chosenOption;


    App()
    {
        Vehicles car1 = new Vehicles();
        car1.setMaxSpeed(190);
        car1.setProducer("BMW");
        car1.setName("E46");

        Vehicles car2 = new Vehicles();
        car2.setMaxSpeed(222);
        car2.setProducer("Audi");
        car2.setName("A4");

        Vehicles ship1 = new Vehicles();
        ship1.setMaxSpeed(350);
        ship1.setProducer("Sincor");
        ship1.setName("RandomShip");

        Vehicles ship2 = new Vehicles();
        ship2.setMaxSpeed(315);
        ship2.setProducer("Trident");
        ship2.setName("AnotherRandomShip");

        Vehicles plane1 = new Vehicles();
        plane1.setMaxSpeed(750);
        plane1.setProducer("Airbus");
        plane1.setName("RyanAir");

        Vehicles plane2 = new Vehicles();
        plane2.setMaxSpeed(890);
        plane2.setProducer("Boeing");
        plane2.setName("LOT");

        Vehicles bike1 = new Vehicles();
        bike1.setMaxSpeed(20);
        bike1.setProducer("Scott");
        bike1.setName("Składak");

        Vehicles bike2 = new Vehicles();
        bike2.setMaxSpeed(35);
        bike2.setProducer("Trek");
        bike2.setName("Gravel");

        List<Vehicles> vehicles1 = new ArrayList<>();
        vehicles1.add(car1);
        vehicles1.add(car2);
        vehicles1.add(plane1);
        vehicles1.add(plane2);
        vehicles1.add(ship1);
        vehicles1.add(ship2);
        vehicles1.add(bike1);
        vehicles1.add(bike2);


        Vehicles listMaxSpeed = Collections.max(vehicles1);
        logger.info("Podaj jedną z opcji: CAR, SHIP, PLANE, BICYCLE, ALL, EXIT");
        chosenOption = scanner.next();

        do {
            if (chosenOption.equalsIgnoreCase("Car")) {
                logger.info("Wybrałeś opcję: Car");
                if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
                    logger.info("Pojazd " + car1.getName() + " producenta " + car1.getProducer() + " jest najszybszy. Maksymalna prędkość to: " + car1.getMaxSpeed());
                } else if (car1.getMaxSpeed() < car2.getMaxSpeed()) {
                    logger.info("Pojazd " + car2.getName() + " producenta " + car2.getProducer() + " jest najszybszy. Maksymalna prędkość to: " + car2.getMaxSpeed());
                } else {
                    logger.info("Prędkości pojazdów są równe");
                }
            }
            else if (chosenOption.equalsIgnoreCase("Ship")) {
                logger.info("Wybrałeś opcję: Ship");
                if (ship1.getMaxSpeed() > ship2.getMaxSpeed()) {
                    logger.info("Pojazd "+ship1.getName()+" producenta "+ship1.getProducer()+" jest najszybszy. Maksymalna prędkość to: "+ship1.getMaxSpeed());
                }
                else if (ship1.getMaxSpeed() < ship2.getMaxSpeed()) {
                    logger.info("Pojazd "+ship2.getName()+" producenta "+ship2.getProducer()+" jest najszybszy. Maksymalna prędkość to: "+ship2.getMaxSpeed());
                } else {
                    logger.info("Prędkości pojazdów są równe");
                }
            }
            else if (chosenOption.equalsIgnoreCase("Plane")) {
                logger.info("Wybrałeś opcję: Plane");
                if (plane1.getMaxSpeed() > plane2.getMaxSpeed()) {
                    logger.info("Pojazd " + plane1.getName() + " producenta " + plane1.getProducer() + " jest najszybszy. Maksymalna prędkość to: " + plane1.getMaxSpeed());
                } else if (plane1.getMaxSpeed() < plane2.getMaxSpeed()) {
                    logger.info("Pojazd " + plane2.getName() + " producenta " + plane2.getProducer() + " jest najszybszy. Maksymalna prędkość to: " + plane2.getMaxSpeed());
                } else {
                    logger.info("Prędkości pojazdów są równe");
                }
            }
            else if (chosenOption.equalsIgnoreCase("Bicycle")) {
                logger.info("Wybrałeś opcję: Bicycle");
                if (bike1.getMaxSpeed() > bike2.getMaxSpeed()) {
                    logger.info("Pojazd " + bike1.getName() + " producenta " + bike1.getProducer() + " jest najszybszy. Maksymalna prędkość to: " + bike1.getMaxSpeed());
                } else if (bike1.getMaxSpeed() < bike2.getMaxSpeed()) {
                    logger.info("Pojazd " + bike2.getName() + " producenta " + bike2.getProducer() + " jest najszybszy. Maksymalna prędkość to: " + bike2.getMaxSpeed());
                } else {
                    logger.info("Prędkości pojazdów są równe");
                }
            }
            else if (chosenOption.equalsIgnoreCase("ALL")) {
                logger.info("Wybrałeś opcję: ALL");
                logger.info("Ze wszystkich dostępnych pojazdów najszybszy jest "+listMaxSpeed.getName()+ " producenta "+listMaxSpeed.getProducer()+". Jego największa prędkość to "+listMaxSpeed.getMaxSpeed());
            }
            else if (chosenOption.equalsIgnoreCase("Exit")){
                logger.info("Wybrano zamknięcie programu");
                System.exit(0);
            } else {
                logger.info("Wybierz prawidłową opcję!");
            }
            logger.info("Podaj jedną z opcji: CAR, SHIP, PLANE, BICYCLE, ALL, EXIT");
            chosenOption = scanner.next();
        }
        while (true);

    }

    public static void main(String[] args)
    {
        App start = new App();
    }

}
