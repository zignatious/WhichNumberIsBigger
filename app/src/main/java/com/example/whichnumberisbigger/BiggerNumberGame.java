package com.example.whichnumberisbigger;

public class BiggerNumberGame {
    private int number1;
    private int number2;
    private int score;
    private int lowerLimit;
    private int upperLimit;

    public BiggerNumberGame(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        generateRandomNumbers();
    }

    public void generateRandomNumbers() {
        number1 = (int)((upperLimit - lowerLimit + 1) * Math.random() + lowerLimit);
        number2 = (int)((upperLimit - lowerLimit + 1) * Math.random() + lowerLimit);
        while (number1 == number2) {
            number2 = (int)((upperLimit - lowerLimit + 1) * Math.random());
            }
        }
    //generate a number between the upper and lower limits inclusive
        //store that in number1
        //generate another number and make sure that it's different
        //store that in number2


   public String checkAnswer(int answer) {
       if ((number1 > number2 && answer == number1) || (number1 < number2 && answer == number2))
       {
           score++;
           return "correct.";

       }
       else {
           score--;
           return "nope, that is, in fact, wrong.";

       }


       //determine if the answer is right
        //based on the values of number 1 and number 2
        // update the score accordingly
      //return a relevant message
 }


    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }
}
