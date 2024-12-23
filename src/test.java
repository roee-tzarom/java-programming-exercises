public class test {
    public static void main(String[] args) {
        String num = "012bA";
        bla(num);
        String n = int2Number(11, 2);
        System.out.println(n);
    }

    public static void bla(String num) {
        String ans = "-1";
        if (num == null || num.isEmpty()) {
            System.out.println("-1");
            return;
        }

        char[] c = num.toCharArray();
        int sum = 0;
        int base = 10;

        for (int i = 0; i < c.length; i++) {
            if (!"0123456789ABCDEFb".contains(String.valueOf(c[i]))) {
                System.out.println("-1");
                return;
            }

            if (c[i] == 'b') {
                if (i == c.length - 1 || !("0123456789ABCDEF".contains(String.valueOf(c[i + 1])))) {
                    System.out.println("-1");
                    return;
                }

                if (c[i + 1] >= '0' && c[i + 1] <= '9') {
                    base = c[i + 1] - '0';
                } else if (c[i + 1] >= 'A' && c[i + 1] <= 'F') {
                    base = c[i + 1] - 'A' + 10;
                }
                break;
            }

            if (c[i] >= 'A' && c[i] <= 'F') {
                sum = sum * 10 + (c[i] - 'A' + 10);
            } else if (c[i] >= '0' && c[i] <= '9') {
                sum = sum * 10 + (c[i] - '0');
            }
        }

        System.out.println(sum + "," + base);
    }
    public static String int2Number(int num, int base) {
        String ans = "";
        // add your code here
        int calculate = 0;
        if (base == num){
            ans = "-1";
            return ans;
        }
        String numStr = String.valueOf(num);
        int[] result = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < numStr.length(); i++){
            if(result[i] > base){
                ans = "-1";
                return ans;
            }
            else {
                calculate = calculate + result[i] * ((int) Math.pow(base, i));
            }
        }
        ans = String.valueOf(calculate);
        ////////////////////
        return ans;
    }
}
