package listeners;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class enigmaSEN extends ListenerAdapter{

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(event.getMessage().getContentRaw().startsWith("pt!clear")) {
            event.getGuild().getController().getGuild().getManager().setName("mr. saturn dorf.").queue();
            for (int i = 0; i < event.getGuild().getMembers().size(); i++) {
                event.getGuild().getController().setNickname(event.getGuild().getMembers().get(i), "").queue();
            }
            event.getJDA().getTextChannelById("407159469642874882").getManager().setName("chat").queue();
            event.getJDA().getTextChannelById("526467235624255490").getManager().setName("cursed-chat").queue();
            event.getJDA().getTextChannelById("467717455255568394").getManager().setName("pics-videos").queue();
            event.getJDA().getTextChannelById("409681523982336002").getManager().setName("gaming-schreibi").queue();
            event.getJDA().getTextChannelById("506491277768917002").getManager().setName("anime").queue();
            event.getJDA().getTextChannelById("409678116525441025").getManager().setName("main-bots").queue();
            event.getJDA().getTextChannelById("523594367085183036").getManager().setName("\uD83C\uDF0Dglobal-chat").queue();
            event.getJDA().getTextChannelById("467801238252159006").getManager().setName("hui").queue();
            event.getJDA().getTextChannelById("409675356057108481").getManager().setName("sprachi-sprachi-chat").queue();
            event.getJDA().getTextChannelById("478534913939996672").getManager().setName("news").queue();
        }
    }
}
