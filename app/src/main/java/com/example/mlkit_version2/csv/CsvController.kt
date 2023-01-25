package com.example.mlkit_version2.csv

import android.content.res.AssetManager
import android.util.Log
import com.opencsv.CSVReader
import java.io.InputStreamReader


open class CsvHelper {}
class CsvController constructor(assets: AssetManager) : CsvHelper() {
    private val assetManager : AssetManager = assets


    fun readAllCsvData(fileName: String) : List<String>? {
        return try {

            val inputStream = assetManager.open(fileName)
            val reader = CSVReader(InputStreamReader(inputStream))
            val allContent = reader.readAll()


            val resultCSV = ArrayList<String>()
            for(content in allContent){
                resultCSV.add(content.toList().toString())
            }

//            Log.i("read csv1", resultCSV.toString())

            // return
            resultCSV
        }catch (e: java.lang.Exception){
            Log.e("csv_bug", e.toString())
            // return
            null
        }
    }
}