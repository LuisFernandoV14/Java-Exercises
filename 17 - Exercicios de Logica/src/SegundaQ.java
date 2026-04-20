import java.io.PrintWriter;

public class SegundaQ {

    static final FastReader in = new FastReader();
    static final PrintWriter out = new PrintWriter(System.out);

    static public void inverterString() {
        out.println("Digite uma String: ");
        out.flush();

        String N = in.nextLine();

        char[] chars = N.toCharArray();
        String inv = new StringBuilder(new String(chars)).reverse().toString();

        out.println("Inverso: " + inv);
        out.println("É palíndromo: " + checarIgualdade(N, inv));

        out.println("É um possível palíndromo?: " + checarSePossivelPalindrormo(N));

        out.close();
    }

    static private boolean checarIgualdade(String str1, String str2) {

        String aux1 = str1.replace(" ", "");
        String aux2 = str2.replace(" ", "");

        return aux1.equalsIgnoreCase(aux2);
    }

    static private boolean checarSePossivelPalindrormo(String str) {

        str = str.toLowerCase();

        if (str.length() % 2 ==  0) {
            for (char letra : str.toCharArray()) {
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (letra == str.charAt(i)) {
                        count++;
                    }
                }
                if (count % 2 != 0) {
                    return false;
                }
            }

        } else {
            int impar = 0;
            for (char letra : str.toCharArray() ) {
                int count = 0;
                for(int i = 0; i < str.length(); i++){
                    if (letra == str.charAt(i)) {
                        count++;
                    }
                }
                if (count % 2 != 0) {
                    impar+=1;
                }
            }
            if (impar != 1) {
                return false;
            }
        }
        return true;
    }


}
