    package core;

import config.settings;
import listeners.enigmaSEN;
import listeners.reactionRoleListener;
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
            builder.setStatus(OnlineStatus.ONLINE);
            builder.setGame(Game.watching("boing"));

            //Listeners
            builder.addEventListener(new reactionRoleListener());
            builder.addEventListener(new enigmaSEN());
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
