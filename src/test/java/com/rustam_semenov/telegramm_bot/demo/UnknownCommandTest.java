package com.rustam_semenov.telegramm_bot.demo;

import com.rustam_semenov.telegramm_bot.demo.command.Command;
import com.rustam_semenov.telegramm_bot.demo.command.UnknownCommand;
import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.DisplayName;

import static com.rustam_semenov.telegramm_bot.demo.command.UnknownCommand.UNKNOWN_MESSAGE;


@DisplayName("Unit-level testing for UnknownCommand")
public class UnknownCommandTest extends AbstractCommandTest {


    @Override
    String getCommandName() {
        return "/fdgdfgdfgdbd";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand((SendBotMessageServiceImpl) sendBotMessageService);
    }
}
