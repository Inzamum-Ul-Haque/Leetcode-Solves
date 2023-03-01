package Two_Pointers;

public class Long_Pressed_Name {

    public boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()) {
            return false;
        }

        int i = 0, j = 0;
        while (i <= name.length() && j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                break;
            }
        }

        return i == name.length() && j == typed.length();
    }
}
