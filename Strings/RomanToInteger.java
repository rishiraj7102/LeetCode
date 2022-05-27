package Strings;

class RomanToInteger {
    public static void main(String[] args) {
        romanToInt("");
    }
    static int romanToInt(String s) {
        int result = convertRomanToInteger(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            int pre = convertRomanToInteger(s.charAt(i - 1));
            int curr = convertRomanToInteger(s.charAt(i));

            if(pre >= curr) {
                result += curr;
            }
            else {
                result = result - pre + curr - pre;
            }

        }

        return result;
    }

    static int convertRomanToInteger(char roman) {
        switch(roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}