package ajstri.commands.music;

import ajstri.Category;
import quack.ddbl.core.commands.Command;
import quack.ddbl.core.commands.ICommand;
import quack.ddbl.core.event.ExtendedMessageReceivedEvent;

@Command(aliases={"repeat"}, category=Category.MUSIC, permission="ajstri.music.repeat", description="Set the player to repeat/non-repeat")
public class RepeatCommand implements ICommand {
	
	@Override
	public void execute(ExtendedMessageReceivedEvent e, String[] args) {
		e.getAudioManager().repeatWOAction(e);
	}
	
}
