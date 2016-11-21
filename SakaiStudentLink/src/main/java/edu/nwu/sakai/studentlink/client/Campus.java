package edu.nwu.sakai.studentlink.client;

public enum Campus {
    POTCHEFSTROOM(1), VAALDRIEHOEK(2), MAFIKENG(9);

    private int number;

    Campus(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getCode() {
        String code = null;
        if (1 == number) {
            code = "P";
        }
        else if (2 == number) {
            code = "V";
        }
        else if (9 == number) {
            code = "M";
        }
        return code;
    }

    public static Campus getCampus(int campusNumber) {
        if (Campus.POTCHEFSTROOM.getNumber() == campusNumber) {
            return Campus.POTCHEFSTROOM;
        }
        else if (Campus.VAALDRIEHOEK.getNumber() == campusNumber) {
            return Campus.VAALDRIEHOEK;
        }
        else if (Campus.MAFIKENG.getNumber() == campusNumber) {
            return Campus.MAFIKENG;
        }
        return null;
    }
}
