import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyDaylifeBot extends TelegramLongPollingBot implements mydaylifebot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());

            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public String getBotsUsername(){
        return "MyDaylifeBot";
    }

    @Override
    public String getBotUsername() {
        return "7106603458:AAHLZtkEU8u_i5oDVugHXWzvKeyayRgo178";
    }

    @Override
    public String getBotToken(){
        return "7106603458:AAHLZtkEU8u_i5oDVugHXWzvKeyayRgo178";
    }
}
