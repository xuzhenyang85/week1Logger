package logger;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * This server is based on: 
 *  https://docs.oracle.com/javase/8/docs/jre/api/net/httpserver/spec/com/sun/net/httpserver/package-summary.html
 * @author kasper
 */
public class Server {

    private static int DEFAULT_BACKLOG = -1;
    public static void main( String[] args ) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8888), DEFAULT_BACKLOG);
   server.createContext("/logger", new Logger());
   server.setExecutor(null); // creates a default executor
   server.start();
    }
}
