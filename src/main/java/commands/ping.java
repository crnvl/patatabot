package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class ping implements runinterface {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if(args.length == 0) {
            event.getTextChannel().sendMessage(
                    new EmbedBuilder().setColor(Color.PINK)
                            .setTitle("Patata Ping")
                            .setDescription("Mein Ping zur API beträgt momentan " + event.getJDA().getPing() + " ms!").build()).queue();
        }else if(args.length >= 2) {

            String PING = event.getJDA().getPing() + args[1];

            event.getTextChannel().sendMessage(
                    new EmbedBuilder().setColor(Color.PINK)
                            .setTitle("Patata Ping")
                            .setDescription("Mein Ping zur API beträgt momentan " + PING + " ms!").build()).queue();
        }
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }
}
