import com.sun.jdi.event.ExceptionEvent;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {
    final String botName;
    final String botToken;
    private int vari = 0;

    public MyBot(String botName, String botToken) {
        this.botName = botName;
        this.botToken = botToken;
    }

    @Override
    public String getBotUsername() {
        return this.botName;
    }

    @Override
    public String getBotToken() {
        return this.botToken;
    }

    public void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            setButtons(sendMessage);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void setButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        keyboardRow1.add(new KeyboardButton("V1"));
        keyboardRow1.add(new KeyboardButton("V2"));
        keyboardRow1.add(new KeyboardButton("V3"));
        keyboardRow1.add(new KeyboardButton("V4"));
        keyboardRow1.add(new KeyboardButton("V5"));
        keyboardRow1.add(new KeyboardButton("V6"));
        keyboardRow1.add(new KeyboardButton("V7"));

        keyboardRowList.add(keyboardRow1);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
    }

    public boolean chek(String mes,int count){
        boolean prov = true;
        int i = 0;
        for (String retval : mes.split(" ")) {
            i+=1;
            try{
                Double.parseDouble(retval.toString());
            }
            catch (Exception e){
                prov = false;
            }
        }
        if(count != i){
            prov = false;
        }
        return prov;
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Проверяем появление нового сообщения в чате, и если это текст


        Message message = update.getMessage();
        System.out.println(message.getText());
        if (message != null && message.hasText()) {
            if (message.getText().equals("/start")) {
                sendMsg(message, "Привет! Это бот для решения примеров. Нажмите на кнопку с необходимым вариантом.");
            }
            if (message.getText().equals("/help")) {
                sendMsg(message, "Чем могу помочь?");
            }
            if (message.getText().equals("V1") || message.getText().equals("V2") || message.getText().equals("V3") || message.getText().equals("V4") || message.getText().equals("V5") || message.getText().equals("V6") || message.getText().equals("V7")) {
                if (message.getText().equals("V1")) {
                    sendMsg(message, "Введите через пробел без запятых параметры a b c x n:");
                    this.vari = 1;
                }
                if (message.getText().equals("V2")) {
                    sendMsg(message, "Введите через пробел без запятых параметры a y x w:");
                    this.vari = 2;
                }
                if (message.getText().equals("V3")) {
                    sendMsg(message, "Введите через пробел без запятых параметры a0 a1 a2 x:");
                    this.vari = 3;
                }
                if (message.getText().equals("V4")) {
                    sendMsg(message, "Введите через пробел без запятых параметры a x:");
                    this.vari = 4;
                }
                if (message.getText().equals("V5")) {
                    sendMsg(message, "Введите через пробел без запятых параметры a b c d x:");
                    this.vari = 5;
                }
                if (message.getText().equals("V6")) {
                    sendMsg(message, "Введите через пробел без запятых параметры x:");
                    this.vari = 6;
                }
                if (message.getText().equals("V7")) {
                    sendMsg(message, "Введите через пробел без запятых параметр x:");
                    this.vari = 7;
                }
            } else {
                if (this.vari == 1) {
                    String mes = message.getText();
                    String rezult1 = "Выбранный вариант V1. Введенные данные: ";
                    rezult1 += mes;
                    rezult1 += ". Результат = ";
                    rezult1 += Variant1(mes);
                    sendMsg(message, rezult1);
                }
                if (this.vari == 2) {
                    String mes = message.getText();
                    String rezult2 = "Выбранный вариант V2. Введенные данные: ";
                    rezult2 += mes;
                    rezult2 += ". Результат = ";
                    rezult2 += Variant2(mes);
                    sendMsg(message, rezult2);
                }
                if (this.vari == 3) {
                    String mes = message.getText();
                    String rezult3 = "Выбранный вариант V3. Введенные данные: ";
                    rezult3 += mes;
                    rezult3 += ". Результат = ";
                    rezult3 += Variant3(mes);
                    sendMsg(message, rezult3);
                }
                if (this.vari == 4) {
                    String mes = message.getText();
                    String rezult4 = "Выбранный вариант V4. Введенные данные: ";
                    rezult4 += mes;
                    rezult4 += ". Результат = ";
                    rezult4 += Variant4(mes);
                    sendMsg(message, rezult4);
                }
                if (this.vari == 5) {
                    String mes = message.getText();
                    String rezult5 = "Выбранный вариант V5. Введенные данные: ";
                    rezult5 += mes;
                    rezult5 += ". Результат = ";
                    rezult5 += Variant5(mes);
                    sendMsg(message, rezult5);
                }
                if (this.vari == 6) {
                    String mes = message.getText();
                    String rezult6 = "Выбранный вариант V6. Введенные данные: ";
                    rezult6 += mes;
                    rezult6 += ". Результат = ";
                    rezult6 += Variant6(mes);
                    sendMsg(message, rezult6);
                }
                if (this.vari == 7) {
                    String mes = message.getText();
                    String rezult7 = "Выбранный вариант V7. Введенные данные: ";
                    rezult7 += mes;
                    rezult7 += ". Результат = ";
                    rezult7 += Variant7(mes);
                    sendMsg(message, rezult7);
                }
            }
        }
    }

    public String Variant1(String mes) {
        if(chek(mes, 5)){
            double[] mas = new double[5];
            int i = 0;
            for (String retval : mes.split(" ")) {
                System.out.println(retval);
                mas[i] = (Double.parseDouble(retval.toString()));
                i+=1;
            }
            //System.out.println(sa);
            double a = mas[0];
            double b = mas[1];
            double c = mas[2];
            double x = mas[3];
            double n = mas[4];
            this.vari = 0;
            double z = (5 * Math.pow(a, (n * x))) / (b + c) - Math.pow((Math.abs(Math.cos(Math.pow(x, 3)))), 0.5);
            return Double.toString(z);
        }
        else {
            return "Ошибка. Проверьте правильность введенных данных.";
        }
    }

    public String Variant2(String mes) {

        if(chek(mes,4)){
            double[] mas = new double[4];
            int i = 0;
            for (String retval : mes.split(" ")) {
                System.out.println(retval);
                mas[i] = Double.parseDouble(retval.toString());
                i+=1;
            }
            //System.out.println(sa);
            double a = mas[0];
            double y = mas[1];
            double x = mas[2];
            double w = mas[3];
            this.vari = 0;
            double z = (Math.abs(x - y)) / Math.pow((1 + 2 * x), a) - Math.pow(Math.E, Math.pow((1 + w), 0.5));
            return Double.toString(z);
        }
        else {
            return "Ошибка. Проверьте правильность введенных данных.";
        }
    }

    public String Variant3(String mes) {

        if(chek(mes,4)){
            double[] mas = new double[4];
            int i = 0;
            for (String retval : mes.split(" ")) {
                System.out.println(retval);
                mas[i] = Double.parseDouble(retval.toString());
                i+=1;
            }
            //System.out.println(sa);
            double a0 = mas[0];
            double a1 = mas[1];
            double a2 = mas[2];
            double x = mas[3];
            this.vari = 0;
            double z = Math.sqrt(a0 + a1 * x + a2 * (Math.pow((Math.abs(Math.sin(x))), (1.0 / 3.0))));
            return Double.toString(z);
        }
        else {
            return "Ошибка. Проверьте правильность введенных данных.";
        }
    }

    public String Variant4(String mes) {
        if(chek(mes,2)){
            double[] mas = new double[2];
            int i = 0;
            for (String retval : mes.split(" ")) {
                System.out.println(retval);
                mas[i] = Double.parseDouble(retval.toString());
                i+=1;
            }
            //System.out.println(sa);
            double a = mas[0];
            double x = mas[1];
            this.vari = 0;
            double z = Math.log(Math.abs(Math.pow(a, 7))) + Math.atan(Math.pow(x, 2)) + Math.PI / (Math.sqrt(Math.abs(a + x)));

            return Double.toString(z);
        }
        else {
            return "Ошибка. Проверьте правильность введенных данных.";
        }
    }

    public String Variant5(String mes) {
        if(chek(mes,5)){
            double[] mas = new double[5];
            int i = 0;
            for (String retval : mes.split(" ")) {
                System.out.println(retval);
                mas[i] = Double.parseDouble(retval.toString());
                i+=1;
            }
            //System.out.println(sa);
            double a = mas[0];
            double b = mas[1];
            double c = mas[2];
            double d = mas[3];
            double x = mas[4];
            this.vari = 0;
            double z = Math.pow(((Math.pow((a + b), 2)) / (c + d)), (1.0 / 5.0)) + Math.pow(Math.E, Math.sqrt(x + 1));

            return Double.toString(z);
        }
        else {
            return "Ошибка. Проверьте правильность введенных данных.";
        }
    }

    public String Variant6(String mes) {
        if(chek(mes,1)){
            double x = Double.parseDouble(mes);
            this.vari = 0;
            double z = Math.pow(Math.E, (((2 * Math.sin(4 * x)) + Math.pow(Math.cos(x * x), 2)) / (3 * x)));

            return Double.toString(z);
        }
        else {
            return "Ошибка. Проверьте правильность введенных данных.";
        }
    }

    public String Variant7(String mes) {

        if(chek(mes,1)){
            double x = Double.parseDouble(mes);
            this.vari = 0;
            double z = 0.25 * ((1 + x * x) / (1 - x) + 0.5 * Math.tan(x));
            return Double.toString(z);
        }
        else {
            return "Ошибка. Проверьте правильность введенных данных.";
        }
    }

}
