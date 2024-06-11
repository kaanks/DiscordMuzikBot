package tr.keanks;

import ca.tristan.easycommands.EasyCommands;
import ca.tristan.easycommands.commands.defaults.HelpCmd;
import ca.tristan.testbot.ExampleCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.Command;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.EventListener;

public class Main {
    private static JDA jda;
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

        EasyCommands easyCommands = new EasyCommands();

        easyCommands.getConfig().getToken();

        jda = easyCommands.registerListeners(


        ).addExecutor(
                new HelpCmd(easyCommands), new ExampleCmd()

        ).addEnabledCacheFlags().addGatewayIntents().buildJDA();

    }
}
