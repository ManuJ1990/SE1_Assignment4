package at.mci.manueljunker.exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 * Proxy class that acts as an intermediary for controlling access to the real connection.
 * This class checks if the requested server is on a blacklist before allowing the connection.
 */
public class ConnectionProxy implements Connection {
    // Reference to the real connection object
    private Connection realConnection = new RealConnection();
    // List to store blacklisted URLs
    private static List<String> blacklist;

    // Static block to initialize the blacklist with restricted URLs
    static {
        blacklist = new ArrayList<>();
        blacklist.add("illegalcontent.com");
        blacklist.add("porn.com");
    }

    /**
     * Connects to the specified server host, after checking if the host is blacklisted.
     *
     * @param serverHost the server host to connect to
     * @throws Exception if the server is blacklisted
     */
    @Override
    public void connect(String serverHost) throws Exception {
        // Check if the requested server is in the blacklist
        if (blacklist.contains(serverHost.toLowerCase())) {
            // Throw an exception if the server is blacklisted
            throw new Exception("Access Denied to " + serverHost + "! Your parents have been notified.");
        }
        // If the server is not blacklisted, proceed with the real connection
        realConnection.connect(serverHost);
    }
}