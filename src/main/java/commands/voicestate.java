package commands;

import net.dv8tion.jda.core.entities.VoiceChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class voicestate implements runinterface {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if(event.getMember().getVoiceState().inVoiceChannel()) {
            VoiceChannel vChan = event.getMember().getVoiceState().getChannel();
            event.getGuild().getAudioManager().openAudioConnection(vChan);
        }else {
            event.getMessage().getTextChannel().sendMessage("You have to be in a Voicechannel to use this command!").queue();
        }

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }
}
