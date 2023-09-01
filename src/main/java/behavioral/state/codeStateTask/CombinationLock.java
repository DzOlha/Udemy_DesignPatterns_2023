package behavioral.state.codeStateTask;

import java.util.HashMap;
import java.util.Map;

class CombinationLock {
    private int[] combination;
    private int size;
    public String status = State.LOCKED;
    private Map<String, String> rules = new HashMap<>();

    public CombinationLock(int[] combination) {
        this.combination = combination;
        //this.setRules();
        this.setBetterRules();
    }

//    private void setRules() {
//        size = this.combination.length;
//        StringBuilder digitsValidState = new StringBuilder();
//        int currentDigit;
//        for(int i = 0; i < size; i++) {
//            currentDigit = this.combination[i];
//            rules.put(currentDigit, digitsValidState.append(currentDigit).toString());
//        }
//    }

    public void setBetterRules() {
        size = this.combination.length;
        String currentDigit = State.LOCKED;
        String nextDigit = Integer.toString(combination[0]);
        for (int i = 0; i < size; i++) {
            rules.put(currentDigit, nextDigit);
            currentDigit = Integer.toString(combination[i]);
            nextDigit = (i != size - 1) ? Integer.toString(combination[i + 1]) : State.OPEN;
            if(i == size - 1) {
                rules.put(currentDigit, nextDigit);
            }
        }
        System.out.println(rules);
    }

//    public void enterDigit(int digit) {
//        status = status.equals(State.LOCKED) ? Integer.toString(digit) : status + digit;
//
//        System.out.println("status = " + status);
//        System.out.println("digits rule = " + rules.get(digit));
//        if (status.equals(rules.get(digit))) {
//            if (status.length() == size) {
//                status = State.OPEN;
//            }
//        } else {
//            status = State.ERROR;
//        }
//        System.out.println(status);
//    }

    public void enterBetterDigit(int digit) {
        // get the current state [last digit from 'status' or LOCKED string]
        String currentState = status.equals(State.LOCKED)
                ? status
                : Character.toString(status.charAt(status.length() - 1));

        // get the expected digit based on the current state value
        String expectedDigit = rules.get(currentState);

        // check if the provided digit equals to the expected one
        if(Integer.parseInt(expectedDigit) != digit) {
            status = State.ERROR;
        } else {
            // if equals -> update 'status' value by adding at its end given digit
            //           -> or by replacing LOCKED with the current digit
            status = status.equals(State.LOCKED) ? Integer.toString(digit) : status + digit;
        }

        // check if the size of the 'status' are equal to the expected length of the code
        if(status.length() == size) {
            // if yes -> set the 'status' to OPEN string that saves in the rules array
            //        -> linked to the last expected digit of the code
            status = rules.get(Integer.toString(digit));
        }
    }
}

