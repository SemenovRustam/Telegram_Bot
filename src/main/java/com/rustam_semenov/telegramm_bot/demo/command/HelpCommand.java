package com.rustam_semenov.telegramm_bot.demo.command;

import com.rustam_semenov.telegramm_bot.demo.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.rustam_semenov.telegramm_bot.demo.command.CommandName.*;


public class HelpCommand implements Command {

   private SendBotMessageServiceImpl sendBotMessageService;

    public static final String HELP_MESSAGE = String.format("✨<b>Доступные команды</b>✨\n\n"

                    + "<b>Начать\\закончить работу с ботом</b>\n"
                    + "%s - начать работу со мной\n"
                    + "%s - приостановить работу со мной\n\n"
                    + "%s - получить помощь в работе со мной\n",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());




    public HelpCommand(SendBotMessageServiceImpl sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE );
    }
}
