package com.rustam_semenov.telegramm_bot.demo.command;

import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class NoCommand implements Command {

    private SendBotMessageService sendBotMessageService;


    public static final String NO_MESSAGE = "Я поддерживаю команды, начинающиеся со слеша(/). \n"
            +"Чтобы посмотреть список всех команд нажмите /help.";


    public NoCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), NO_MESSAGE);
    }
}
