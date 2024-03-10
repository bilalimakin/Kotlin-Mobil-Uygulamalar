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
            // Veri Ekleme
            /*tarihveritabani.execSQL("INSERT INTO islamiyetoncesi (Soru,CevapID,Cevap) VALUES ('Asya Hun  ?',1,'Teoman')")
            tarihveritabani.execSQL("INSERT INTO islamiyetoncesi (Soru,CevapID,Cevap) VALUES ('Karahanlılar  ?',2,'Kadir Buğra han')")
            tarihveritabani.execSQL("INSERT INTO islamiyetoncesi (Soru,CevapID,Cevap) VALUES ('TolunOğlulları  ?',3,'Ahmet')")
            tarihveritabani.execSQL("INSERT INTO islamiyetoncesi (Soru,CevapID,Cevap) VALUES ('Osmanlı  ?',4,'Osman')")*/

            //TÜm Verieri Çekme
            //val cursor = tarihveritabani.rawQuery("SELECT * FROM islamiyetoncesi",null)

            //Veri Filtreleme Koşull
            //val cursor = tarihveritabani.rawQuery("SELECT * FROM islamiyetoncesi WHERE CevapID = 2 ",null)

            //verinin baş Harfine Göre çekme
            //val cursor = tarihveritabani.rawQuery("SELECT * FROM islamiyetoncesi WHERE Cevap LIKE 'A%' ",null)

            //verinin son Harfine Göre çekme
            //val cursor = tarihveritabani.rawQuery("SELECT * FROM islamiyetoncesi WHERE Cevap LIKE '%A' ",null)

            //veri Silme
            //tarihveritabani.execSQL("DELETE FROM islamiyetoncesi WHERE id = 2")

            //veri Güncelleme
            //tarihveritabani.execSQL("UPDATE islamiyetoncesi SET Cevap = 'YUSUF KADİR BUĞRA HAN' WHERE CevapID = 2")







            //TÜm Verieri Çekme
            val cursor = tarihveritabani.rawQuery("SELECT * FROM islamiyetoncesi",null)

            //Verileri değişkene atama
            val idColumnIndex = cursor.getColumnIndex("id")
            val SoruColumnIndex = cursor.getColumnIndex("Soru")
            val CevapIDColumnIndex = cursor.getColumnIndex("CevapID")
            val CevapColumnIndex = cursor.getColumnIndex("Cevap")

            //Verileri Yazdırma
            while (cursor.moveToNext()){
                println("ID : ${cursor.getInt(idColumnIndex)} - SORU : ${cursor.getString(SoruColumnIndex)} CEVAP ID : ${cursor.getInt(CevapIDColumnIndex)}  CEVAP : ${cursor.getString(CevapColumnIndex)}")
                //println("ID : ${cursor.getInt(idColumnIndex)}")
                //println("SORU : ${cursor.getString(SoruColumnIndex)}")
                //println("CEVAP ID : ${cursor.getInt(CevapIDColumnIndex)}")
                //println("CEVAP : ${cursor.getString(CevapColumnIndex)}")
            }




            cursor.close() //kursör kapatma




        }catch(e: Exception)
        {
            e.printStackTrace()
        }








    }
}