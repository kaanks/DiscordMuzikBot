package tr.keanks;

import ca.tristan.easycommands.commands.EventData;
import ca.tristan.easycommands.commands.slash.SlashExecutor;
import ca.tristan.easycommands.database.MySQL;

public class ExampleCmd extends SlashExecutor {

    @Override
    public String getName()
    {
        return "hello";
    }
    @Override
    public String getDescription() {
        return "Say Hello world!";
    }
    @Override
    public void execute(EventData data, MySQL mySQL) {
        data.reply("Selam millet", false).queue();
    }
}
