import ratpack.server.RatpackServer;

/**
 * Created by michcio on 2017-07-08.
 */
public class TrialMain {

    public static void main(String[] args) throws Exception{
        RatpackServer.start(server -> server
                .handlers(chain -> chain
                        .get(ctx -> ctx.render("Hello World!"))
                        .get(":name", ctx -> ctx.render("Hello " + ctx.getPathTokens().get("name") + "!"))
                )
        );
    }
}
