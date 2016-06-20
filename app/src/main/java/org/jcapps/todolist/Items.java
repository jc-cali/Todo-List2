package org.jcapps.todolist;

/**
 * Created by JC on 6/16/16.
 */
public class Items {


    private String mListTitle;
    private String mListDesc;

    public Items (String listtitle, String listdesc) {
        this.mListTitle = listtitle;
        this.mListDesc = listdesc;

    }
    public String getmListTitle() {
        return mListTitle;
    }

    public void setmListTitle (String listtitle) {
        mListTitle = listtitle;
    }

    public String getmListDesc() {
        return mListDesc;
    }

    public void setmListDesc (String listdesc) {
        mListDesc = listdesc;
    }

    public String toString() {
        return this.mListTitle + " : " + this.mListDesc;
    }

}