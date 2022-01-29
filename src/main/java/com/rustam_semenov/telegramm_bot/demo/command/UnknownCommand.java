package com.rustam_semenov.telegramm_bot.demo.command;

import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UnknownCommand implements Command {

    private SendBotMessageServiceImpl sendBotMessageService;

    public static final String UNKNOWN_COMMAND = "Не понимаю вас \uD83D\uDE1F, " +
            "напишите /help чтобы узнать что я понимаю.";


    public UnknownCommand(SendBotMessageServiceImpl sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), UNKNOWN_COMMAND);
    }
}
