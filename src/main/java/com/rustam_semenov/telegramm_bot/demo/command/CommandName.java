package com.rustam_semenov.telegramm_bot.demo.command;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum CommandName {
    START("/start"),
    HELP("/help"),
    STOP("/stop"),
    NO("/no");

    private final String commandName;

    CommandName(String commandName){
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}
