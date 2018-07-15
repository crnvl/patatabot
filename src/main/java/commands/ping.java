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

            switch(args[0]) {
                case "+":

                    long plus = Integer.parseInt(args[1]);
                    long pingp = Integer.parseInt(String.valueOf(event.getJDA().getPing())) + plus;

                    event.getTextChannel().sendMessage(
                            new EmbedBuilder().setColor(Color.PINK)
                                    .setTitle("Patata Ping")
                                    .setDescription("Mein Ping zur API beträgt momentan " + pingp + " ms!").build()).queue();

                    break;

                case "-":

                    long minus = Integer.parseInt(args[1]);
                    long pingm = Integer.parseInt(String.valueOf(event.getJDA().getPing())) - minus;

                    event.getTextChannel().sendMessage(
                            new EmbedBuilder().setColor(Color.PINK)
                                    .setTitle("Patata Ping")
                                    .setDescription("Mein Ping zur API beträgt momentan " + pingm + " ms!").build()).queue();

                    break;
            }
        }
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }
}
