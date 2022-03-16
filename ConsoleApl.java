package P_11_03_2;

import java.util.Scanner;

public class ConsoleApl implements Processing{
    /*public ConsoleApl(String generation, Scanner gen, String y, Scanner y1, String s) {
        this.generation = generation;
        this.gen = gen;
        this.y = y;
        Y = y1;
        this.s = s;
    }

    public String generation;
    public Scanner gen = new Scanner(System.in);
    public String y = "yes";
    public Scanner Y = new Scanner(System.in);
    public String s;
    static Scanner S = new Scanner(System.in);*/

    public void start(){

        System.out.print("Enter the generation of your Kia Cerato << ");// start
        Kia.generation = Kia.gen.nextLine();
    }
    public void mainConfirmetion(){
        System.out.println(".............................................................");
        System.out.println("Continue?");// mainConfirmation
        Kia.y = Kia.Y.nextLine();
    }
    public void  additionalConfirmation(){
        System.out.print("This generation does not exist try again? << ");//additionalConfirmation
        Kia.s = Kia.S.nextLine();
    }
    public void consummation(){
        System.out.println(".............................................................");//consummation
        System.out.println("By");
    }
}
