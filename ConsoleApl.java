package P_11_03_2;

public class ConsoleApl implements Processing{


    public void start(){

        System.out.print("Enter the generation of your Kia Cerato << ");// start
        Variable.generation = Variable.gen.nextLine();
    }
    public void mainConfirmetion(){
        System.out.println(".............................................................");
        System.out.println("Continue?");// mainConfirmation
        Variable.consumerAnswer = Variable.consAns.nextLine();
    }
    public void  additionalConfirmation(){
        System.out.print("This generation does not exist try again? << ");//additionalConfirmation
        Variable.statement = Variable.St.nextLine();
    }
    public void consummation(){
        System.out.println(".............................................................");//consummation
        System.out.println("By");
    }
}
