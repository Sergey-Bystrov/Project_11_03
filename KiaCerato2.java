package P_11_03_2;

public class KiaCerato2 implements Methods {
    int year1;
    int year2;

    public KiaCerato2(int year1, int year2) {
        this.year1 = year1;
        this.year2 = year2;
    }

    public void getYear() {
        System.out.println("This car was produced from " + year1 + " to " + year2 + " year.");
    }
    public void getCarBody(){
        System.out.println(CarBody.body1.getCarBodys());
        System.out.println(CarBody.body2.getCarBodys());
        System.out.println(CarBody.body3.getCarBodys());

    }
    public void getMotor(){
        System.out.println(Motors.engineSize3.getMotors() + Motors.fuel1.getMotors() + Motors.motor_type1);
        System.out.println(Motors.engineSize8.getMotors() + Motors.fuel1.getMotors() + Motors.motor_type1);
        System.out.println(Motors.engineSize7.getMotors() + Motors.fuel1.getMotors() + Motors.motor_type1);
        System.out.println(Motors.engineSize12.getMotors() + Motors.fuel1.getMotors() + Motors.motor_type1);
        System.out.println(Motors.engineSize13.getMotors() + Motors.fuel1.getMotors() + Motors.motor_type1);

    }
    public void getTransmission(){
        System.out.println(Transmission.transmission1.getStringTransmissions());
        System.out.println(Transmission.transmission2.getStringTransmissions());
        System.out.println(Transmission.transmission3.getStringTransmissions());
        System.out.println(Transmission.transmission4.getStringTransmissions());

    }
}
