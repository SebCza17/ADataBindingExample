package com.example.sebastian.scastro;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sebastian.scastro.databinding.ActivityBlablablaBinding;


public class MainActivity extends AppCompatActivity implements IMainActivity {

    private ActivityBlablablaBinding mBinding;
    User user = new User("admin", "123456");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_blablabla);

        mBinding.setUser(user);


        mBinding.setIMainActivity((IMainActivity)this);


    }


    @Override
    public void myOnClick() {
        user.setLogin("zmienionyLogin");
        user.setPass("654321");
        mBinding.setUser(user);
    }
}
