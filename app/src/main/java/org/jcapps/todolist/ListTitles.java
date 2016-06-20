package org.jcapps.todolist;

import java.util.ArrayList;

/**
 * Created by JC on 6/16/16.
 */
public class ListTitles extends ArrayList<Items> {
    ListTitles(){}

    private String mTitleName;

    public ListTitles(String name) {
        this.mTitleName = name;
    }

    public String getmTitleName() {
        return mTitleName;
    }

    public void setmTitleName(String mTitleName) {
        this.mTitleName = mTitleName;
    }

    public String toString() {
        return this.mTitleName;
    }

}
