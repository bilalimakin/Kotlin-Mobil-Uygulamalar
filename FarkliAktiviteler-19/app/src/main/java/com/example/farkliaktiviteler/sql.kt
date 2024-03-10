package com.example.farkliaktiviteler

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class sql : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sql)


    //try catch yapısı

        try{
            //veritabanı tanımlama
            val tarihveritabani = this.openOrCreateDatabase("tarihkonulari", Context.MODE_PRIVATE,null)

            //tablo Oluşturmak
            tarihveritabani.execSQL("CREATE TABLE IF NOT EXISTS islamiyetoncesi (id INTEGER PRIMARY KEY, Soru VARCHAR, CevapID INT, Cevap VARCHAR)")
            //tarihveritabani.execSQL("INSERT INTO islamiyetoncesi (Soru,CevapID,Cevap) VALUES ('Asya Hun Devletinin KurucusuKimdir ?',1,'Teoman')")

            val cursor = tarihveritabani.rawQuery("SELECT * FROM islamiyetoncesi",null)

            val idColumnIndex = cursor.getColumnIndex("id")
            val SoruColumnIndex = cursor.getColumnIndex("Soru")
            val CevapIDColumnIndex = cursor.getColumnIndex("CevapID")
            val CevapColumnIndex = cursor.getColumnIndex("Cevap")

            while (cursor.moveToNext()){
                println("ID : ${cursor.getInt(idColumnIndex)}")
                println("SORU : ${cursor.getString(SoruColumnIndex)}")
                println("CEVAP ID : ${cursor.getInt(CevapIDColumnIndex)}")
                println("CEVAP : ${cursor.getString(CevapColumnIndex)}")
            }

            cursor.close()
        }catch(e: Exception)
        {
            e.printStackTrace()
        }








    }
}