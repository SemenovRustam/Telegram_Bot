package com.rustam_semenov.telegramm_bot.demo;

import com.rustam_semenov.telegramm_bot.demo.command.Command;
import com.rustam_semenov.telegramm_bot.demo.command.NoCommand;
import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.DisplayName;

import static com.rustam_semenov.telegramm_bot.demo.command.CommandName.NO;
import static com.rustam_semenov.telegramm_bot.demo.command.NoCommand.NO_MESSAGE;

@DisplayName("Unit-level testing for NoCommand")
public class noCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand((SendBotMessageServiceImpl) sendBotMessageService);
    }
}
