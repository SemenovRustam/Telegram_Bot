package com.rustam_semenov.telegramm_bot.demo.command;

import com.google.common.collect.ImmutableMap;

import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;

import static com.rustam_semenov.telegramm_bot.demo.command.CommandName.*;


public class CommandContainer {

    private final ImmutableMap<String, Command> commandMap;

    private final Command unknownCommand;

    public CommandContainer(SendBotMessageServiceImpl sendBotMessageService) {

        commandMap = ImmutableMap.<String, Command>builder()
                .put(START.getCommandName(), new StartCommand((SendBotMessageServiceImpl) sendBotMessageService))
                .put(STOP.getCommandName(), new StopCommand((SendBotMessageServiceImpl) sendBotMessageService))
                .put(HELP.getCommandName(), new HelpCommand(sendBotMessageService))
                .put(NO.getCommandName(), new NoCommand(sendBotMessageService))
                .build();

        unknownCommand = new UnknownCommand(sendBotMessageService);
    }

    public Command retrieveCommand(String commandIdentifier){
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }
}
