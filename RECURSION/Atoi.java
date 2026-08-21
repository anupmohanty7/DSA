import java.uti;.*;

class solution {

    static final int min_value = -2147483648;
    static final int max_value = 2147483647;

    static int helper(String s, int i, long num, int sign) {

        if (sign * num <= min_value)
            return min_value;
        if (sign * num >= max_value)
            return max_value;

        if ( i >= s.length() || !Character.isDigit(s.charAt(i)) ) {//stopping case
            return (int) (num * sign);
        }

        num = num * 10 + (s.charAt(i) - '0');//updating num

        return helper(s, i + 1, num, sign);//recursion creater

    }

    static int atoi(String s) {

        // whitespace
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        // sign

        int sign = 1;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        return helper(s, i, 0, sign);
    }
}

class Atoi {
    public static void main(String args[]) {
        String s = "  -12345";
        System.out.println(solution.atoi(s));
    }
}