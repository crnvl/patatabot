package listeners;

import net.dv8tion.jda.core.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class reactionRoleListener extends ListenerAdapter {

    @Override
    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event) {
        if(event.getMessageId().contains("548820368698376202")) {
            String reactionId = event.getReactionEmote().getName();
            switch (reactionId) {
                case "\uD83D\uDD34":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("472791309464240138")).queue();
                    break;
                case "\uD83D\uDD36":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("486939056434053124")).queue();
                    break;
                case "\uD83D\uDC9B":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("487281873689640960")).queue();
                    break;
                case "\uD83C\uDF4F":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("486619615536087041")).queue();
                    break;
                case "\uD83C\uDF32":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("486939057340022784")).queue();
                    break;
                case "\uD83D\uDD37":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("486935835900510209")).queue();
                    break;
                case "\uD83D\uDC93":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("481878229733343253")).queue();
                    break;
                case "\uD83D\uDC9C":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("486935464708800523")).queue();
                    break;
                case "\uD83C\uDF0C":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("486935610846740490")).queue();
                    break;
                case "⚪":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("488720476319776779")).queue();
                    break;
                case "⚫":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("472053105438097409")).queue();
                    break;
                case "\uD83D\uDEC1":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("472793986671837196")).queue();
                    break;
            }
        }else if(event.getMessageId().contains("548831791730130945")) {
            String reactionId = event.getReactionEmote().getName();
            System.out.println(reactionId);
            switch (reactionId) {
                case "\uD83C\uDF97":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("522412679139426313")).queue();
                    break;
                case "\uD83D\uDD8B":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("546299966872616960")).queue();
                    break;
                case "\uD83D\uDD2B":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("546300433300324352")).queue();
                    break;
                case "\uD83C\uDF0E":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("546300544172687399")).queue();
                    break;
                case "\uD83C\uDFF5":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("546300793612009481")).queue();
                    break;
                case "\uD83C\uDFAE":
                    event.getGuild().getController().addRolesToMember(event.getMember(), event.getGuild().getRoleById("546301426196938754")).queue();
                    break;
            }
        }
    }
}
