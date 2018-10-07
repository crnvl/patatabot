package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class zitatcmd implements runinterface{


    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        event.getGuild().getTextChannelById("485884413121396766").sendMessage(
                new EmbedBuilder().setColor(Color.PINK)
                        .setTitle("Zitat von " + event.getMessage().getMentionedUsers().get(0).getName() + "#" +  event.getMessage().getMentionedUsers().get(0).getDiscriminator())
                        .setDescription(event.getMessage().getContentDisplay().replace("@" + event.getMessage().getMentionedMembers().get(0).getEffectiveName(), "").replace("pt!zitat", ""))
                        .setFooter("Eingereicht von " + event.getMessage().getAuthor().getName() + "#" + event.getMessage().getAuthor().getDiscriminator(), event.getMessage().getAuthor().getAvatarUrl())
                        .build()).queue(id -> id.addReaction("⭐").queue());

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }
}
