package com.rustam_semenov.telegramm_bot.demo.command;

import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StopCommand implements Command{

    private SendBotMessageServiceImpl sendBotMessageService;

    public static final String STOP_MESSAGE = "Я закончил свою работу!";

    public StopCommand(SendBotMessageServiceImpl sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }


    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
    }
}
