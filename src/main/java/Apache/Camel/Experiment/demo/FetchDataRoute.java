package Apache.Camel.Experiment.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import java.io.File;

@Component
public class FetchDataRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        System.out.println("Router started!");
        // Ensure that the directory exists before writing to the file
        String directoryPath = "data"; // Ensure this is the path relative to your current working directory
        File directory = new File(directoryPath);

        // Create the directory if it doesn't exist
        if (!directory.exists()) {
            directory.mkdirs();
        }

        from("timer://fetchTimer?period=30000")
        .log("Timer triggered")
        .to("https://jsonplaceholder.typicode.com/posts")
        .log("Data fetched: ${body}")
        .to("file:data?fileName=fetchedData.txt")
        .log("Data saved to file.");
    }
}
