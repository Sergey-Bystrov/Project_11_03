package P_11_03_2;

public class KiaCerato1Rest implements Methods {
    int year1;
    int year2;

    public KiaCerato1Rest(int year1, int year2) {
        this.year1 = year1;
        this.year2 = year2;
    }

    public void getYear() {
        System.out.println("This car was produced from " + year1 + " to " + year2 + " year.");
    }

    public void getCarBody(){
        System.out.println(CarBody.body1.getCarBodys());
    };
    public void getMotor(){
        System.out.println(Motors.engineSize2.getMotors() + Motors.fuel1.getMotors() + Motors.motor_type1.getMotors());
        System.out.println(Motors.engineSize6.getMotors() + Motors.fuel1.getMotors() + Motors.motor_type1.stringMotor);
        System.out.println(Motors.engineSize11.getMotors() + Motors.fuel2.getMotors() + Motors.motor_type2.getMotors());

    };
    public void getTransmission(){
        System.out.println(Transmission.transmission1.getStringTransmissions());
        System.out.println(Transmission.transmission3.getStringTransmissions());
    };
}
