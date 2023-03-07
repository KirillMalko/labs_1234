public class Help2 {
    public static void main(String args[])
        throws java.io.IOException {
            char ch;
            int count = 0;
            for (; ; ) {
                ch = (char) System.in.read();
                if (ch == '.') break;
                else {
                    count++;
                }

            }
        System.out.println("Spaces: "  + (count));
        }

    }



