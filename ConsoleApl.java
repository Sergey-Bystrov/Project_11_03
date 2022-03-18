package P_11_03_2;

public class ConsoleApl implements Processing{
   
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
