package commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class spam implements runinterface {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if(event.getMessage().getTextChannel().getId().contains("467801238252159006")) {
            event.getMessage().getTextChannel().sendMessage(":hui:").queue();
            Timer myTimer1 = new Timer();
            TimerTask task = new TimerTask() {
                int secondsPassed = 0;

                @Override
                public void run() {
                    switch (secondsPassed) {
                        case 0:
                            event.getMessage().getTextChannel().sendMessage(":hui:").queue();
                            secondsPassed++;
                            break;
                        case 1:
                            event.getMessage().getTextChannel().sendMessage(":hui:").queue();
                            secondsPassed++;
                            break;
                        case 2:
                            event.getMessage().getTextChannel().sendMessage(":hui:").queue();
                            secondsPassed++;
                            break;
                        case 3:
                            event.getMessage().getTextChannel().sendMessage(":hui:").queue();
                            secondsPassed++;
                            break;
                        case 4:
                            event.getMessage().getTextChannel().sendMessage(":hui:").queue();
                            secondsPassed++;
                            break;
                        case 5:
                            event.getMessage().getTextChannel().sendMessage(":hui:").queue();
                            secondsPassed++;
                            break;
                        case 6:
                            event.getMessage().getTextChannel().sendMessage(":hui:").queue();
                            secondsPassed++;
                            secondsPassed = 0;
                            break;
                    }
                }
            };
            myTimer1.schedule(task, 10000, 10000);
        }else {
            event.getMessage().getTextChannel().sendMessage("stfu das is der falsche channel :hui:").queue();
        }
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }
}
