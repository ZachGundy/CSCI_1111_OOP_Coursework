package JavaFX;

import java.util.random.*;

public class Restaurant {

    private double cost;
    private int people;
    private String food;
    private double time;

    /** Construct a default Restaurant object */
    public Restaurant() {
    }


    /** Construct a Restaurant object with cost, people, food, and hours values */
    public Restaurant(double cost, int people, String food, double time) {
        this.setCost(cost);
        this.setPeople(people);
        this.setFood(food);
        this.setTime(time);

    }

    public double getCost() {

        return cost;
    }

    public void setCost(double cost) {

        this.cost = cost;
    }

    public int getPeople() {

        return people;
    }

    public void setPeople(int people) {


        this.people = people;
    }

    public String getFood() {


        return food;
    }

    public void setFood(String food) {


        this.food = food;
    }

    public double getTime() {


        return time;
    }

    public void setTime(double time) {


        this.time = time;
    }

    public String toString() {
        return ("Your meal costs $" + this.cost + " \nYou are eating " + this.food + "\nThere are " + this.people + " people in attendance " + "\nYour stay will be " + this.time) + " hours long";

    }


}