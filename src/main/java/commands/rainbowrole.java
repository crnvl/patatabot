package commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class rainbowrole implements runinterface {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
            if (event.getMessage().getAuthor().getId().contains("265849018662387712")) {
                event.getMessage().getTextChannel().sendMessage("The Role process has started!").queue();
                Timer myTimer1 = new Timer();
                TimerTask task = new TimerTask() {
                    int secondsPassed = 0;

                    @Override
                    public void run() {
                        switch (secondsPassed) {
                            case 0:
                                event.getMessage().getTextChannel().getGuild().getRoleById("469249976929878026").getManager().setColor(new Color(148,0,211)).queue();
                                secondsPassed++;
                                break;
                            case 1:
                                event.getMessage().getTextChannel().getGuild().getRoleById("469249976929878026").getManager().setColor(new Color(75,0,130)).queue();
                                secondsPassed++;
                                break;
                            case 2:
                                event.getMessage().getTextChannel().getGuild().getRoleById("469249976929878026").getManager().setColor(new Color(0,0,255)).queue();
                                secondsPassed++;
                                break;
                            case 3:
                                event.getMessage().getTextChannel().getGuild().getRoleById("469249976929878026").getManager().setColor(new Color(0,255,0)).queue();
                                secondsPassed++;
                                break;
                            case 4:
                                event.getMessage().getTextChannel().getGuild().getRoleById("469249976929878026").getManager().setColor(new Color(255,255,0)).queue();
                                secondsPassed++;
                                break;
                            case 5:
                                event.getMessage().getTextChannel().getGuild().getRoleById("469249976929878026").getManager().setColor(new Color(255,127,0)).queue();
                                secondsPassed++;
                                break;
                            case 6:
                                event.getMessage().getTextChannel().getGuild().getRoleById("469249976929878026").getManager().setColor(new Color(255,0,0)).queue();
                                secondsPassed++;
                                secondsPassed = 0;
                                break;
                        }
                    }
                };
                myTimer1.schedule(task, 10000, 2000);
            }else {
                event.getMessage().getTextChannel().sendMessage(
                        ":warning: " + event.getMessage().getAuthor().getAsMention() + ", you dont have the permission to do that!").queue();
            }
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }
}
