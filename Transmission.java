package P_11_03_2;

public enum Transmission {
    transmission1("Manual transmission 5 speed"),
    transmission2("Manual transmission 6 speed"),
    transmission3("Automatic transmission 4 speed"),
    transmission4("Automatic transmission 6 speed");

    String stringTransmission;

    Transmission(String stringTransmission) {
        this.stringTransmission = stringTransmission;
    }
    public String getStringTransmissions() {
        return stringTransmission;
    }


}
