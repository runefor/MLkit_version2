package com.example.mlkit_version2.csv

import android.util.Log
import com.example.mlkit_version2.MainActivity

class CsvData {
    private val data = MainActivity.csvTest

    fun log(){
        Log.i("read", data?.toList().toString())
    }

    fun dataGet(): List<String>? {
        return data
    }
}