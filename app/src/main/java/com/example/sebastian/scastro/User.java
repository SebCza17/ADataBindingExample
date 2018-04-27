package com.example.sebastian.scastro;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by Sebastian on 19.04.2018.
 */

public class User extends BaseObservable {
    private String login;
    private String pass;


    User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    @Bindable
    public String getLogin() {
        return login;
    }

    @Bindable
    public String getPass() {
        return pass;
    }

    public void setLogin(String login) {
        this.login = login;
        notifyPropertyChanged(BR.login);
    }

    public void setPass(String pass) {
        this.pass = pass;
        notifyPropertyChanged(BR.pass);
    }

}
