package com.thatmg393.showhiddenchannels;

import android.content.Context;

import com.aliucord.annotations.AliucordPlugin;
import com.aliucord.api.CommandsAPI;
import com.aliucord.entities.Plugin;
import com.discord.models.user.CoreUser;
import java.util.Locale;


@AliucordPlugin(requiresRestart = true)
public class ShowHiddenChannels extends Plugin {
	@Override
	public void start(Context context) {
		commands.registerCommand(
			"test_cmd", "my custom command", cmdCtx -> {
				return new CommandsAPI.CommandResult(
					"PONGNGGGG",
					null,
					true
				);
			}
		);
		
		// patcher.patch(CoreUser.class, "")
	}
	
	@Override
	public void stop(Context context) {
		commands.unregisterAll();
		patcher.unpatchAll();
	}
}