package com.rustam_semenov.telegramm_bot.demo.command;

import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command {

    private final SendBotMessageServiceImpl sendBotMessageService;

    public static final  String  START_MESSAGE = "Hello world! Я еще маленький и только учусь!";


    public StartCommand(SendBotMessageServiceImpl sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }

}

