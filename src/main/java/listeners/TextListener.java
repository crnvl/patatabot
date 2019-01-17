package listeners;



import ml.duncte123.CleverBot4J.CleverbotAPI;
import ml.duncte123.CleverBot4J.CleverbotBuilder;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class TextListener extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getTextChannel().getId().contains("535483045990367234") && !event.getAuthor().getId().contains(event.getJDA().getSelfUser().getId())) {
            String cleverUser = System.getenv("CBU");
            String cleverApi = System.getenv("CBA");

            event.getTextChannel().sendTyping().complete();
            CleverbotAPI api = new CleverbotBuilder()
                    .setUserKey(cleverUser)
                    .setApiKey(cleverApi)
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

