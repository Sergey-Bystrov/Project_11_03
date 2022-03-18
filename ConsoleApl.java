package P_11_03_2;

public class ConsoleApl implements Processing{
    ChekFunction chekConfirm = new ChekFunction();

    public void start(){
        System.out.println("Generations: 1;    1 rest;   2;   3;   3 rest;   4;   4 rest;");
        System.out.print("Enter the generation of your Kia Cerato << ");// start
        Variable.generation = Variable.gen.nextLine();
    }
    public void mainConfirmetion(){
        System.out.println(".............................................................");
        System.out.println("Continue? (yes/no)");// mainConfirmation
        Variable.consumerAnswer = Variable.consAns.nextLine();
        boolean conf = chekConfirm.ChekConfirmation(Variable.consumerAnswer);

    }
    public void  additionalConfirmation(){
        System.out.print("This generation does not exist try again? (yes/no) << ");//additionalConfirmation
        Variable.statement = Variable.St.nextLine();
        boolean conf = chekConfirm.ChekConfirmation(Variable.statement);
    }
    public void consummation(){
        System.out.println(".............................................................");//consummation
        System.out.println("By");
    }
}
