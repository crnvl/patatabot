package core;

 



import config.settings;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

import javax.security.auth.login.LoginException;


public class Main {

    public static JDABuilder builder;

    public static void main(String[] Args) throws LoginException, InterruptedException {
        builder = new JDABuilder(AccountType.BOT);

        //Important
        builder.setToken(settings.TOKEN);
        builder.setAutoReconnect(true);

        //Status
        builder.setStatus(OnlineStatus.IDLE);
        builder.setGame(Game.playing("pre-alpha"));

        //Listeners
        
        addCommands();


        try {
            JDA jda = builder.buildBlocking();
        } catch (LoginException e) {
            e.printStackTrace();
            builder.setStatus(OnlineStatus.IDLE);
            builder.setGame(Game.playing("low processing mode!"));
        } catch (InterruptedException e) {
            e.printStackTrace();
            builder.setStatus(OnlineStatus.IDLE);
            builder.setGame(Game.playing("low processing mode!"));
        }

    }

    public static void addCommands() {

        

    }
}
