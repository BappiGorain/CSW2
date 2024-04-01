public class RobinKarp {
    public final static int d = 256;

    static void search(String pattern, String txt, int q) {
        int m = pattern.length();
        int n = txt.length();
        int i, j;
        int patHash = 0;
        int txtHash = 0;
        int h = 1;

        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;

        for (i = 0; i < m; i++) {
            patHash = (d * patHash + pattern.charAt(i)) % q;
            txtHash = (d * txtHash + txt.charAt(i)) % q;
        }

        for (i = 0; i <= n - m; i++) {
            if (patHash == txtHash) {
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pattern.charAt(j))
                        break;
                }
                if (j == m)
                    System.out.println("Pattern found at index " + i);
            }

            if (i < n - m) {
                txtHash = (d * (txtHash - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (txtHash < 0)
                    txtHash += q;
            }
        }
    }

    public static void main(String[] args) {
        String txt = "THIS IS A TEST TEXT";
        String pattern = "TEST";
        int q = 101; 
        search(pattern, txt, q);
    }
}
//public class RabinKarp {
//
//    public static int search(String text, String pattern) {
//        if (text == null || pattern == null || pattern.length() > text.length()) {
//            return -1;
//        }
//
//        int d = 256;  Number of characters in the input alphabet
//        int p = 0;  Hash value of the pattern
//        int t = 0;  Hash value of the current window of text
//        int h = 1;  Hash value for d^(pattern.length() - 1)
//
//         Calculate the d^p power
//        for (int i = 0; i < pattern.length() - 1; i++) {
//            h = (h * d) % d;
//        }
//
//         Calculate the hash value of the pattern and the first window of text
//        for (int i = 0; i < pattern.length(); i++) {
//            p = (d * p + pattern.charAt(i)) % d;
//            t = (d * t + text.charAt(i)) % d;
//        }
//
//         Slide the pattern over the text
//        for (int i = 0; i <= text.length() - pattern.length(); i++) {
//
//             Check if the hash values match
//            if (p == t) {
//                 Potential match, check characters one by one
//                boolean match = true;
//                for (int j = 0; j < pattern.length(); j++) {
//                    if (text.charAt(i + j) != pattern.charAt(j)) {
//                        match = false;
//                        break;
//                    }
//                }
//                if (match) {
//                    return i;  Pattern found
//                }
//            }
//
//             Recalculate hash value for the next window of text
//            if (i < text.length() - pattern.length()) {
//                t = (d * (t - text.charAt(i) * h) + text.charAt(i + pattern.length())) % d;
//                if (t < 0) {
//                    t = (t + d);
//                }
//            }
//        }
//
//        return -1;  Pattern not found
//    }
//
//    public static void main(String[] args) {
//        String text = "ABABDABACDABABCABAB";
//        String pattern = "ABABCABB";
//        int index = search(text, pattern);
//
//        if (index == -1) {
//            System.out.println("Pattern not found");
//        } else {
//            System.out.println("Pattern found at index: " + index);
//        }
//    }
//}

