package P_11_03_2;

public enum Motors {
    engineSize1("1.6 105 hp "),
    engineSize2("1.6 122 hp "),
    engineSize3("1.6 126 hp "),
    engineSize4("1.6 128 hp "),
    engineSize5("1.6 130 hp "),
    engineSize6("2.0 143 hp "),
    engineSize7("2.0 150 hp "),
    engineSize8("2.0 156 hp "),
    engineSize9("2.0 112 hp "),
    engineSize10("1.5 102 hp "),
    engineSize11("1.6 115 hp "),
    engineSize12("1.6 140 hp "),
    engineSize13("2.4 176 hp "),
    engineSize14("1.8 148 hp "),
    engineSize15("1.6 204 hp "),
    engineSize16("2.0 175 hp "),
    motor_type1("atmospheric"),
    motor_type2("turbo"),
    fuel1("petrol "),
    fuel2("disel ");
    String stringMotor;


    Motors(String stringMotor) {
        this.stringMotor = stringMotor;
    }

       public String getMotors() {
        return stringMotor;
    }
}
