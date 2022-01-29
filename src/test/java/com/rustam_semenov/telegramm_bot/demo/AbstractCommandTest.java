package com.rustam_semenov.telegramm_bot.demo;

import com.rustam_semenov.telegramm_bot.demo.bot.TelegramBot;
import com.rustam_semenov.telegramm_bot.demo.command.Command;
import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageService;
import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

abstract class AbstractCommandTest {
    protected TelegramBot telegramBot = Mockito.mock(TelegramBot.class);
    protected SendBotMessageService sendBotMessageService = new SendBotMessageServiceImpl(telegramBot);

    abstract String getCommandName();

    abstract String getCommandMessage();

    abstract Command getCommand();

    public void shouldProperlyExecuteCommand() throws TelegramApiException{
        Long chatId = 1234567898797L;

        Update update = new Update();

        Message message = Mockito.mock(Message.class);
        Mockito.when(message.getChatId()).thenReturn(chatId);
        Mockito.when(message.getText()).thenReturn(getCommandName());
        update.setMessage(message);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText(getCommandMessage());
        sendMessage.enableHtml(true);

        //when
        getCommand().execute(update);

        //then
        Mockito.verify(telegramBot).execute(sendMessage);
    }
}
