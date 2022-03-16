package P_11_03_2;

public enum CarBody {
    body1("sedan 4 doors "),
    body2("hetchback 5 doors "),
    body3("koup 2 doors ");
    String stringBody;

    CarBody(String stringBody) {
        this.stringBody = stringBody;
    }

    public String getCarBodys() {
        return stringBody;
    }
}
