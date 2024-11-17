package at.mci.manueljunker.exercise2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FilterStream extends FilterInputStream {
    private final char[] MASK_CHARS = {'a', 'e', 'z'};
    private final char C_MASK = '*';

    public FilterStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int character = super.read();

        if (character == -1) {
            return -1;
        }
        for (char maskChar : MASK_CHARS) {
            if (character == maskChar) {
                return  '*';
            }
        }
        return character;
    }
}
