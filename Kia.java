package P_11_03_2;

public class Kia {

    public static void main(String args[]) {
        Processing process = new ConsoleApl();
        ChekFunction ChekStatemen = new ChekFunction();

        while (Variable.consumerAnswer.equals(Variable.yes)) { // подтверждение yes/no
                process.start();
                boolean answer = ChekStatemen.Chek(Variable.generation);
                if(answer){
                    switch (Variable.generation) {
                        case ("1"): {
                            Methods car1 = new KiaCerato1(2003, 2008);
                            car1.getYear();
                            car1.getCarBody();
                            car1.getMotor();
                            car1.getTransmission();
                        }
                        break;
                        case ("1 rest"): {
                            Methods car2 = new KiaCerato1Rest(2006, 2008);
                            car2.getYear();
                            car2.getCarBody();
                            car2.getMotor();
                            car2.getTransmission();
                        }
                        break;
                        case ("2"): {
                            Methods car3 = new KiaCerato2(2008, 2013);
                            car3.getYear();
                            car3.getCarBody();
                            car3.getMotor();
                            car3.getTransmission();
                        }
                        break;
                        case ("3"): {
                            Methods car4 = new KiaCerato3(2013, 2016);
                            car4.getYear();
                            car4.getCarBody();
                            car4.getMotor();
                            car4.getTransmission();
                        }
                        break;
                        case ("3 rest"): {
                            Methods car5 = new KiaCerato3Rest(2016, 2020);
                            car5.getYear();
                            car5.getCarBody();
                            car5.getMotor();
                            car5.getTransmission();
                        }
                        break;
                        case ("4"): {
                            Methods car6 = new KiaCerato4(2018, 2021);
                            car6.getYear();
                            car6.getCarBody();
                            car6.getMotor();
                            car6.getTransmission();
                        }
                        break;
                        case ("4 rest"): {
                            Methods car7 = new KiaCerato4Rest(2021, 2022);
                            car7.getYear();
                            car7.getCarBody();
                            car7.getMotor();
                            car7.getTransmission();
                        }
                        break;

                    }
                    process.mainConfirmetion();

                }else {
                    process.additionalConfirmation();
                    switch (Variable.statement){
                        case("yes"):{
                            answer = true;
                        } break;

                        case("no"):{
                            Variable.consumerAnswer = "no";
                        }
                    }
                }
        }
        process.consummation();
    }
}

