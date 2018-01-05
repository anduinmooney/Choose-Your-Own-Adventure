package models;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ChooseYourOwn {
    private String currentEvent;
    private ArrayList<String> scenarios;
    private String userInput;

        public ChooseYourOwn(String userInput) {
            scenarios = new ArrayList<>();
            this.currentEvent = "Your alarm goes off, would you like to wake up? (Type: 'snooze' to put your alarm on snooze for 10 more minutes, or 'wake up' to wake up for school.";
            scenarios.add("Do you take the bus to school, or do you drive? (Type: 'drive' to drive to school, and 'bus' to bus to school.");
            scenarios.add("Do you pay the fare, or do you attempt to get on for free? Type: 'free' to ride the bus without paying, 'pay' to pay for bus fare");
            scenarios.add("You paid the fare, you go and sit down and you feel completely relaxed. You didn't sleep too well last night, so your eyes begin to slowly close. Type: 'Nap' to take a quick powernap, 'Stay awake' to stay awake for the ride");
            scenarios.add("You step off the bus, and see Epicodus closely ahead. You have 5 minutes to spare, and since you decided to stay awake, you are beyond tired, and you start to desire coffee to help you stay awake for class. There is a starbucks down the road, and it shouldn't take more than a minute. Type: 'coffee' to go get coffee, 'epicodus' to go to Epicodus and sign in.");
        }


        public String getCurrentEvent(){
            return currentEvent;
        }


        public String eventOne(){
            currentEvent = scenarios.get(0);
            return currentEvent;
        }

        public String eventTwo(){
            currentEvent = scenarios.get(1);
            return currentEvent;
        }

         public String eventThree(){
            currentEvent = scenarios.get(2);
            return currentEvent;
        }

         public String eventFour(){
           currentEvent = scenarios.get(3);
          return currentEvent;
        }

          public String eventFive() {
              currentEvent = scenarios.get(4);
              return currentEvent;
          }

}

