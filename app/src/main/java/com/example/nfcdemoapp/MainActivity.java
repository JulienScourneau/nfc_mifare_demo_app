package com.example.nfcdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nxp.nfclib.CardType;
import com.nxp.nfclib.NxpNfcLib;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private static final String m_strPackageKey = "";
    private NxpNfcLib m_libInstance = null;
    private final CardType m_cardType = CardType.UnknownCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}