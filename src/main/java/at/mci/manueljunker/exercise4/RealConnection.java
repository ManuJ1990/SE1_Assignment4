package at.mci.manueljunker.exercise4;

/**
 * Real connection class that implements the Connection interface and provides actual connection functionality.
 */
public class RealConnection implements Connection {
    /**
     * Simulates connecting to the specified server host.
     *
     * @param serverHost the server host to connect to
     * @throws Exception if an error occurs during connection
     */
    @Override
    public void connect(String serverHost) throws Exception {
        // Simulate the connection by printing a message
        System.out.println("Verbindungsaufbau zu " + serverHost + "...");
    }
}