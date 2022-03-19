package P_11_03_2;

public class ChekFunction {
    private String [] strings = new String[7] ;

        boolean Chek(String var){// функция проверки корректности введённого поколения
            strings[0] = "1";
            strings[1] = "1 rest";
            strings[2] = "2";
            strings[3] = "3";
            strings[4] = "3 rest";
            strings[5] = "4";
            strings[6] = "4 rest";
        for(int i = 0; i < strings.length; i++){
            boolean statement = Variable.generation.equals(strings[i]);
            if(statement) return statement;
        }
        return false;
    }
        boolean ChekConfirmation(String var){//функция проверки корректности
            if("yes".equals(var) | "no".equals(var)){
            return true;
            } else{
                System.out.print("invalid expression, please try again << ");
                Variable.consumerAnswer = Variable.consAns.nextLine();
                ChekConfirmation(Variable.consumerAnswer);//рекурсия
            } return true;
        }
}
