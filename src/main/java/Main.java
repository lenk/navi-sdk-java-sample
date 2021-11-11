import net.navibot.sdk.NaviPlugin;
import net.navibot.sdk.Trigger;
import net.navibot.sdk.data.Message;
import net.navibot.sdk.data.Response;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

import java.util.HashMap;

public class Main extends Plugin {

    public Main(PluginWrapper wrapper) {
        super(wrapper);
    }

    /**
     * root class that'll be processed for custom triggers,
     * IT'S NOT RECOMMENDED YOU MOVE THIS CLASS, build around and in it
     * but for best functionality - leave it in place!
     */

    @Trigger(keyword = "!hello", description = "a plugin to say world when user says !hello")
    @Extension
    public static class MyPlugin implements NaviPlugin {

        /**
         * insert all of your code here for the incoming message invoking your trigger
         * you can create http requests subject to review and many other fun stuff to respond with
         * responses can be made up of both a card and a text if provided or one or the other
         *
         * @param message incoming message
         * @return your response
         */
        public Response onMessage(Message message, HashMap<String, String> storage) {
            return new Response("world!");
        }
    }
}