package prototypePattern;

import java.util.ArrayList;

/**
 * Created by kxyu on 2018/7/18
 */
public class Mail implements Cloneable{

    private MailTemp mailTemp;

    private int ID;

    private String name;
    private String time;
    private String title;
    private String context;
    private ArrayList<String> arrayList = new ArrayList<>();


    public Mail(MailTemp temp){
        this.mailTemp = temp;
        this.title = temp.getTitle();
        this.context = temp.getContext();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public Mail clone() throws CloneNotSupportedException {
        Mail conleMail = null;

        conleMail = (Mail) super.clone();
        this.arrayList = (ArrayList<String>) arrayList.clone();

        return conleMail;
    }
}
