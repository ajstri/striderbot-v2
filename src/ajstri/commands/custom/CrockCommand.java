package ajstri.commands.custom;

import ajstri.Category;
import ajstri.Permission;
import ajstri.commands.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.events.message.priv.PrivateMessageReceivedEvent;

public class CrockCommand implements Command {

	@Override
	public void execute(MessageReceivedEvent e, String[] args) {
		e.getTextChannel().sendMessage("As you wish!").queue();
	}

	@Override
	public void execute(PrivateMessageReceivedEvent e, String[] args) {
		e.getChannel().sendMessage("As you wish!").queue();
	}
	
	@Override
	public Permission getValidExecutors() {
		return Permission.Crock;
	}

	@Override
	public String getInfo() {
		return "Custom Command: Crock";
	}

	@Override
	public Category category() {
		return Category.Custom;
	}
}
