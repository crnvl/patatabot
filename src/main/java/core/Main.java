package core;

import config.settings;
import listeners.huiboardListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;


public class Main {

    public static JDABuilder builder;

    public static void main(String[] Args) throws LoginException, InterruptedException {
        builder = new JDABuilder(AccountType.BOT);

        //Important
        builder.setToken(settings.TOKEN);
        builder.setAutoReconnect(true);

        //Status
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.watching("#huiboard"));

        //Listeners
        builder.addEventListeners(new huiboardListener());
        addCommands();


        try {
            JDA jda = builder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }

    }

    public static void addCommands() {

        //no commands added
    }
}
