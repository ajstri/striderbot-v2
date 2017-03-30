package ajstri.commands.admin;

import ajstri.Category;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.Member;
import quack.ddbl.core.commands.Command;
import quack.ddbl.core.commands.ICommand;
import quack.ddbl.core.event.ExtendedMessageReceivedEvent;

@Command(aliases={"getid"}, category=Category.ADMIN, jdaPermissions={Permission.ADMINISTRATOR}, isJDAPermission=true, description="Get the ID of an User.")
public class GetIDCommand implements ICommand {

	@Override
	public void execute(ExtendedMessageReceivedEvent e) {
		if(e.isGuildMessage()) {
			if(e.args.length==2) {
				Member m = e.getGuild().getMembersByName(e.args[1].replaceFirst("@", ""), false).get(0);
				if(m==null) {
					e.sendMessage("Cannot find requested Member.");
					return;
				}
				e.sendMessage(m.getEffectiveName()+" ID: "+m.getUser().getId());
			}
		} else {
			e.sendMessage("Your ID: "+e.getAuthor().getId());
		}
	}
	
}
