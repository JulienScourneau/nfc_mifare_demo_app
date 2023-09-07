package com.example.nfcdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nxp.nfclib.CardType;
import com.nxp.nfclib.NxpNfcLib;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private static final String m_strPackageKey = "d50ec27fa5e8055fa2faf26e37be6cf4";
    private static final String m_strOfflinePackageKey = "7v15G8HCB9ew9abtrfFE/U3eMmjSUjlpaY1OM/GJ7tMBV9QLhJgyccGvI75cH7ajsa1+zAJkMEJCI5q+/IeJhYkGKL5aJud9/mbT5MqBGBGjwyyWhBR5ZxhXAAJ2nmZ7OStovNYJBayVoovqCwtrU45qc6iIQVd/YsKIsp2MQjtaiGacdnRitainrU1i1YFngbSJTi7HjPjA8B5+5evQBYU7XVJ/wKojfKwRTzqDOHh04roH4CFAfl+Yz49C4QJoiSDtr21Qa6iX8kx2KfQhrTzPkJRrK03hoFq58Re8V5jxebPR3gRBUQiPEbHUZE+Gb6XDJ2xgPdfQXdmrBOimpQ==";
    private NxpNfcLib m_libInstance = null;
    private final CardType m_cardType = CardType.UnknownCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_libInstance = NxpNfcLib.getInstance();
        m_libInstance.registerActivity(this, m_strPackageKey, m_strOfflinePackageKey);
    }
}