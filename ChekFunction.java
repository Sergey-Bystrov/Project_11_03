package P_11_03_2;

public class ChekFunction {
        boolean Chek(String x){
        for(int i = 0; i < Kia.strings.length; i++){
            boolean statement = Kia.generation.equals(Kia.strings[i]);
            if(statement) return statement;
        }
        return false;
    }
}
