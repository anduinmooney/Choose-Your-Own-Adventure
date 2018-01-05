import models.ChooseYourOwn;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        boolean programRunning = true;

        System.out.println("Goodmorning, today is your average schoolday at Epicodus. Type in 'start' to begin, or type in 'quit' to quit.");

        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            try {

                String userInput = bufferedReader.readLine();
                ChooseYourOwn newGame = new ChooseYourOwn(userInput);

                if (userInput.equals("start")) {
                    System.out.println(newGame.getCurrentEvent());
                } else if(userInput.equals("quit")) {
                    programRunning = false;
                } else if(userInput.equals("wake up")) {
                    System.out.println(newGame.eventOne());
                } else if (userInput.equals("snooze")) {
                    System.out.println("You sleepily put your alarm on snooze, but little did you know you accidentally set the alarm for 'PM' instead of 'AM'. You're late for class!");
                    programRunning = false;
                } else if(userInput.equals("bus")) {
                    System.out.println(newGame.eventTwo());
                } else if (userInput.equals("drive")) {
                    System.out.println("You just pull out of your driveway and are T-boned by the bus you didn't take. You're late for class!");
                    programRunning = false;
                } else if(userInput.equals("pay")) {
                    System.out.println(newGame.eventThree());
                } else if (userInput.equals("free")) {
                    System.out.println("They caught you. You were too aggressive and arrested. They don't understand you.");
                    programRunning = false;
                } else if(userInput.equals("stay awake")) {
                    System.out.println(newGame.eventFour());
                } else if (userInput.equals("nap")) {
                    System.out.println("Great nap. You slept all the way to Clackamas. The bus will turn around eventually, so you might as well just ride it back home.");
                    programRunning = false;
                } else if(userInput.equals("epicodus")) {
                    System.out.println("( ͡° ͜ʖ ͡°)");
                    programRunning = false;
                } else if (userInput.equals("coffee")) {
                    System.out.println("You already ordered and two baristas went on break. Your coffee takes too long and you're late!");
                    programRunning = false;
                } else {
                    System.out.println("I'm afraid I don't understand.");
                }

            } catch (IOException e) {
                e.printStackTrace();

            }
        }


    }


}



            //            try {
//
//                if (ChooseYourOwn.equals("yes")) {
//                    String stringChoice = bufferedReader.readLine();
//                    System.out.println("YesTest");
//                } else {
//                 System.out.println("NoTest");
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
