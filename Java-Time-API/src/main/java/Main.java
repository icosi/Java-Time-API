import static spark.Spark.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        get("/time", (req, res) -> new Date().toString());
    }
}

