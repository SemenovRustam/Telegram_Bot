package com.rustam_semenov.telegramm_bot.demo;

import com.rustam_semenov.telegramm_bot.demo.command.Command;
import com.rustam_semenov.telegramm_bot.demo.command.HelpCommand;

import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.DisplayName;

import static com.rustam_semenov.telegramm_bot.demo.command.CommandName.HELP;
import static com.rustam_semenov.telegramm_bot.demo.command.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit-level testing for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand((SendBotMessageServiceImpl) sendBotMessageService);
    }
}
