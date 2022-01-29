package com.rustam_semenov.telegramm_bot.demo;

import com.rustam_semenov.telegramm_bot.demo.command.Command;
import com.rustam_semenov.telegramm_bot.demo.command.StopCommand;
import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.DisplayName;

import static com.rustam_semenov.telegramm_bot.demo.command.CommandName.STOP;
import static com.rustam_semenov.telegramm_bot.demo.command.StopCommand.STOP_MESSAGE;

@DisplayName("Unit-level testing for StopCommand")
public class StopCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand((SendBotMessageServiceImpl) sendBotMessageService);
    }
}

