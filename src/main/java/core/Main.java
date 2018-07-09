
 
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 @shinixsensei-dev Sign out
1
0 0 shinixsensei-dev/Code-Neo
 Code  Issues 1  Pull requests 0  Projects 0  Wiki  Insights  Settings
Code-Neo/src/main/java/core/Main.java
e4e6419  2 days ago
@shinixsensei-dev shinixsensei-dev Update Main.java
    
75 lines (49 sloc)  2.03 KB
package core;

import commands.*;
import config.settings;
import listeners.commandlistener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import worker.CommandHandler;

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
