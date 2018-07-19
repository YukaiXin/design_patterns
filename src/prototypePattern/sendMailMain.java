package prototypePattern;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class sendMailMain {

    public static void main(String[] args) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final Mail mail = new Mail(new MailTemp());


        for (int i = 0; i < 10 ; i ++){
            Mail cloneMail = null;
            try {
                cloneMail = mail.clone();
                cloneMail.setName(getRandString(3)+" 先生");
                ArrayList<String> cloneArrayList = cloneMail.getArrayList();

                cloneArrayList.add(getRandString(10));

                cloneMail.setTime(df.format(new Date()));
                sendMail(cloneMail);

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void sendMail(Mail mail){
        System.out.print("\n Name : "+ mail.getName() +
         "  time : "+ mail.getTime() +
        "  title : "+ mail.getTitle() +
        "   Context :"+ mail.getContext() + " ArrayList : "+ mail.getArrayList().toString());
    }

    private static String getRandString(int maxLength){

        StringBuffer buffer = new StringBuffer();


        for (int i = 0; i < maxLength ; i ++){
            buffer.append((char) (Math.random()*(120 - 65 + 1) + 65));
        }

        return buffer.toString();
    }
}
