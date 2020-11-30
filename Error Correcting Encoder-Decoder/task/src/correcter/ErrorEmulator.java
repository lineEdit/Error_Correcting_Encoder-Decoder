package correcter;

import java.util.Random;

public class ErrorEmulator {
    private final char abc[] = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private final int abcLen = 53;
    private Random random;

    private String in;

    public ErrorEmulator(String in) {
        setIn(in);
        random = new Random();
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getErrorStr() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < in.length(); i += 3) {
            if (i + 3 < in.length()) {
                stringBuilder.append(createError(in.substring(i, i + 3)));
            } else {
                stringBuilder.append(createError(in.substring(i)));
            }
        }
        return stringBuilder.toString();
    }

    private String createError(String in) {
        char[] inCharArray = in.toCharArray();

        int index = random.nextInt(in.length());
        int val = random.nextInt(abcLen);

        inCharArray[index] = abc[val];
        return String.valueOf(inCharArray);
    }
}
