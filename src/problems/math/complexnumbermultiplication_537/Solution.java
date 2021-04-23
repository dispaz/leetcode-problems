package problems.math.complexnumbermultiplication_537;

public class Solution {
    public static String complexNumberMultiply(String a, String b) {
        String x[] = a.split("\\+|i");
        String y[] = b.split("\\+|i");
        int xa = Integer.parseInt(x[0]), xb = Integer.parseInt(x[1]);
        int ya = Integer.parseInt(y[0]), yb = Integer.parseInt(y[1]);
        StringBuilder str = new StringBuilder();
        str.append((xa * ya - xb * yb));
        str.append("+");
        str.append((xa*yb + xb*ya));
        str.append("i");
        return str.toString();
    }

    public static void main(String [] args){
        System.out.println(complexNumberMultiply("1+3i", "4+-10i"));
    }
}
