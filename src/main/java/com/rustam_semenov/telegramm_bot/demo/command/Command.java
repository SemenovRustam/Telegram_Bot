package com.rustam_semenov.telegramm_bot.demo.command;


import org.telegram.telegrambots.meta.api.objects.Update;

public interface Command {

    void execute(Update update);
}
