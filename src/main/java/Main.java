import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        String botName = "seven_exercises_bot"; // В место звездочек указываем имя созданного вами ранее Бота
        String botToken = "6225298891:AAEfAno-9981-UbYdoKGeuNC5BwRLxZdQZ8"; // В место звездочек указываем токен созданного вами ранее Бота
        TelegramBotsApi telegramBotsApi = null;
        try {
            telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new MyBot(botName, botToken));
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}