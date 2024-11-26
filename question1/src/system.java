/*
Author: Sushmita Gupta
seat No: 24P0320052
Program Name: Event Mangement
Program Description: This program takes different events details and displays it to the user
 */

import java.util.*;
class GBS <T, W, P, O> { //class using getter and setter

    private T tutorial;
    private W workshop;
    private P paper;
    private O poster;

    public GBS(T tutorial, W workshop, P paper, O poster) {
        this.tutorial = tutorial;
        this.workshop = workshop;
        this.paper = paper;
        this.poster = poster;
    }

    public T getTutorial() {
        return tutorial;
    }

    public W getWorkshop() {
        return workshop;
    }
    public P getPaper() {
        return paper;
    }
    public O getPoster() {
        return poster;
    }

}

public class system { //main class

    private static <T,W,P,O> void displayFire(ArrayList<GBS<T,W,P,O>> data) { //display method for event fire
        if(data.isEmpty()){
            System.out.println("No data found");
        }
        else{
            for (GBS<T,W,P,O> d : data) {
                System.out.println("Note: Conference will be held from 15th December to 18th December");
                System.out.println("Details of Conference Fire are Follow: ");
                System.out.println("x---------------------------------x");
                System.out.println("Tutorial : " + d.getTutorial());
                System.out.println("Worksop  : " + d.getWorkshop());
                System.out.println("Paper    : " + d.getPaper());
                System.out.println("POster   : " + d.getPoster());
                System.out.println("x---------------------------------x");
                System.out.println(" ");
            }
        }
    }
    private static <T,W,P,O> void displayIcon(ArrayList<GBS<T,W,P,O>> icon) { //display method for event icon
        if(icon.isEmpty()){
            System.out.println("No data found");
        }
        else{
            for (GBS<T,W,P,O> d : icon) {
                System.out.println("Note: Conference will be held from 14th December to 17th December");
                System.out.println("Details of Conference Icon are Follow: ");
                System.out.println("x---------------------------------x");
                System.out.println("Tutorial : " + d.getTutorial());
                System.out.println("Worksop  : " + d.getWorkshop());
                System.out.println("Paper    : " + d.getPaper());
                System.out.println("Poster   : " + d.getPoster());
                System.out.println("x---------------------------------x");
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in);
        ArrayList<GBS<Integer, Integer, Integer, Integer >> data = new ArrayList<>();
        ArrayList<GBS< Integer,Integer, Integer,Integer >> icon = new ArrayList<>();

        int choice;
        do { // loop to execute the system.
            System.out.println("x--------------------------------------------------------x");
            System.out.println("Conference Organised by Computer Science Department from Goa University, Welcomes You!!!");
            System.out.println(" ");
            System.out.println("Press 1 to Enter Conference Icon details");
            System.out.println("Press 2 to Enter Conference Icon details");
            System.out.println("Press 3 to Display schedule of ICON Conference");
            System.out.println("Press 4 to Display schedule of FIRE Conference");
            System.out.println("Press 5 to Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the Total Tutorials for the Icon Conference");
                    int tutorial = sc.nextInt();
                    System.out.println("Enter the Total Workshop for the Icon Conference");
                    int workshop = sc.nextInt();
                    System.out.println("Enter the Total Paper for the Icon Conference");
                    int paper = sc.nextInt();
                    System.out.println("Enter the Total Poster for the Icon Conference");
                    int poster = sc.nextInt();

                    icon.add(new GBS<>(tutorial, workshop, paper, poster));
                    break;
                }
                case 2: {
                    System.out.println("Enter the Total Tutorials for the Fire Conference");
                    int tutorial = sc.nextInt();
                    System.out.println("Enter the Total Workshop for the  Fire Conference");
                    int workshop = sc.nextInt();
                    System.out.println("Enter the Total Paper for the  Fire Conference");
                    int paper = sc.nextInt();
                    System.out.println("Enter the Total Poster for the  Fire Conference");
                    int poster = sc.nextInt();

                    data.add(new GBS<>(tutorial, workshop, paper, poster));
                    break;
                }
                case 3:{
                    displayIcon(icon);
                    break;
                }
                case 4: {
                    displayFire(data);
                    break;
                }
                case 5: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }

        } while (choice != 5);
    }
}


