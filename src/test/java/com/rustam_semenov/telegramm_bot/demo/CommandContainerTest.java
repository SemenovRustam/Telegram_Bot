package com.rustam_semenov.telegramm_bot.demo;

import com.rustam_semenov.telegramm_bot.demo.command.Command;
import com.rustam_semenov.telegramm_bot.demo.command.CommandContainer;
import com.rustam_semenov.telegramm_bot.demo.command.CommandName;
import com.rustam_semenov.telegramm_bot.demo.command.UnknownCommand;
import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageService;
import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;
import com.rustam_semenov.telegramm_bot.demo.service.TelegramUserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

@DisplayName("Unit-level testing for CommandContainer")
public class CommandContainerTest {

    private CommandContainer commandContainer;

    @BeforeEach
    public void init() {
        SendBotMessageService sendBotMessageService = Mockito.mock(SendBotMessageService.class);
        TelegramUserService telegramUserService = Mockito.mock(TelegramUserService.class);
        commandContainer = new CommandContainer(sendBotMessageService, telegramUserService);
    }

    @Test
    public void shouldGetAllTheExistingCommands(){
        Arrays.stream(CommandName.values()).forEach(commandName -> {
            Command command = commandContainer.retrieveCommand(commandName.getCommandName());
            Assertions.assertNotEquals(UnknownCommand.class, command.getClass());
        });
    }

    @Test
    public void shouldReturnUnknownCommand(){

        String unknownCommand = "/dfgdfgd";

        Command command = commandContainer.retrieveCommand(unknownCommand);

        Assertions.assertNotEquals(UnknownCommand.class, command.getClass());
    }
}
