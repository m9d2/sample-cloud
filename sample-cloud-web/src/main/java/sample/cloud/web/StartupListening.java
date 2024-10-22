package sample.cloud.web;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.URI;

@Component
@AllArgsConstructor
public class StartupListening implements CommandLineRunner {

    private final Environment environment;

    public String getPort() {
        return environment.getProperty("server.port");
    }

    public String getContentPath() {
        return environment.getProperty("server.servlet.context-path");
    }

    @Override
    public void run(String... args) throws Exception {
//        String port = getPort();
//        port = port == null? "8080" : port;
//        String url = "http://localhost:" + port + getContentPath();
//        String os = System.getProperty("os.name").toLowerCase();
//        try {
//            if (os.contains("win")) {
//                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
//            } else if (os.contains("mac")) {
//                Runtime.getRuntime().exec("open " + url);
//            } else if (os.contains("nix") || os.contains("nux")) {
//                Runtime.getRuntime().exec("xdg-open " + url);
//            } else {
//                System.out.println("Unsupported operating system. Cannot open browser automatically.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}