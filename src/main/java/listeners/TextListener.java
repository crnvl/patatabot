package listeners;

import ml.duncte123.CleverBot4J.CleverbotAPI;
import ml.duncte123.CleverBot4J.CleverbotBuilder;
import ml.duncte123.CleverBot4J.WebUtils;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


import java.io.IOException;


public class TextListener extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getTextChannel().getName().contains("talk-with-an-artificial-intelligence-cuz-thats-cool-you-know ") && !event.getAuthor().getId().contains(event.getJDA().getSelfUser().getId())) {

            event.getTextChannel().sendTyping().complete();
            CleverbotAPI api = new CleverbotBuilder()
                    .setUserKey(System.getenv(CBU))
                    .setApiKey(System.getenv(CBA))
                    .setNickname("ptbbot")
                    .build();

            //some question
            String question = event.getMessage().getContentDisplay();
            //Ask the question
            String answer = api.askQuestion(question);
            System.out.println("User: " + question);
            //Show the answer
            System.out.println(api.getNickname() + ": " + answer);
            event.getTextChannel().sendMessage(answer).complete();
            
        }
    }
}
