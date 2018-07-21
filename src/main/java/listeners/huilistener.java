package listeners;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class huilistener extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        if(event.getGuild().getId().contains("407159177333702656")) {
            event.getGuild().getTextChannelsByName("hui", true).get(0).sendMessage("<:hui:433969151422234635>").queue();
        }
    }
}
