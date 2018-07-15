package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class membercount implements runinterface {
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
                            .setDescription("Der Server hat momentan " + event.getMessage().getGuild().getMembers().size() + " Mitglieder!").build()).queue();
        }else if(args.length >= 2) {

            long plus = Integer.parseInt(args[1]);
            long member = Integer.parseInt(String.valueOf(event.getMessage().getGuild().getMembers().size())) + plus;

            event.getTextChannel().sendMessage(
                    new EmbedBuilder().setColor(Color.PINK)
                            .setTitle("Patata Ping")
                            .setDescription("Der Server hat momentan " + member + " Mitglieder!").build()).queue();
        }
        
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }
}
