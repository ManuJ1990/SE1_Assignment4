package at.mci.manueljunker.exercise4;

/**
 * Interface defining a connection with a method to connect to a server host.
 */
public interface Connection {
    /**
     * Connects to the specified server host.
     *
     * @param serverHost the server host to connect to
     * @throws Exception if the connection cannot be established
     */
    void connect(String serverHost) throws Exception;
}