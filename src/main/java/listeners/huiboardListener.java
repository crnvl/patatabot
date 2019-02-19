package listeners;


import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;

public class huiboardListener extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(MessageReactionAddEvent event) {
        try {
            if (event.getReactionEmote().getId().contains("433969151422234635") && event.getChannel().getHistory().getMessageById(event.getMessageId()).getReactions().size() > 0) {
                if (event.getReaction().getChannel().getHistory().getMessageById(event.getMessageId()).getEmbeds().size() == 0) {
                    event.getJDA().getTextChannelById("547417181068197898").sendMessage(
                            new EmbedBuilder()
                                    .setColor(Color.PINK)
                                    .setTitle("Jump to Message", "https://discordapp.com/channels/" + event.getGuild().getId() + "/" + event.getChannel().getId() + "/" + event.getMessageId())
                                    .setDescription(event.getReaction().getChannel().getHistory().getMessageById(event.getMessageId()).getContentDisplay())
                                    .setAuthor(event.getReaction().getChannel().getHistory().getMessageById(event.getMessageId()).getAuthor().getName() + "#" + event.getReaction().getChannel().getHistory().getMessageById(event.getMessageId()).getAuthor().getDiscriminator(), event.getReaction().getChannel().getHistory().getMessageById(event.getMessageId()).getAuthor().getDefaultAvatarUrl())


                                    .build()).complete();
                } else {
                    event.getJDA().getTextChannelById("547417181068197898").sendMessage(

                            new EmbedBuilder()
                                    .setColor(Color.PINK)
                                    .setTitle("Jump to Message", "https://discordapp.com/channels/" + event.getGuild().getId() + "/" + event.getChannel().getId() + "/" + event.getMessageId())
                                    .setImage(event.getReaction().getChannel().getHistory().getMessageById(event.getMessageId()).getEmbeds().get(0).getImage().getUrl())
                                    .setDescription(event.getReaction().getChannel().getHistory().getMessageById(event.getMessageId()).getContentDisplay())
                                    .setAuthor(event.getReaction().getChannel().getHistory().getMessageById(event.getMessageId()).getAuthor().getName() + "#" + event.getReaction().getChannel().getHistory().getMessageById(event.getMessageId()).getAuthor().getDiscriminator(), event.getReaction().getChannel().getHistory().getMessageById(event.getMessageId()).getAuthor().getDefaultAvatarUrl())


                                    .build()).complete();
                }

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
