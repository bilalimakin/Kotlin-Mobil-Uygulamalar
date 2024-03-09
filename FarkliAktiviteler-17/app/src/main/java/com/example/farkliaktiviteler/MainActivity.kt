package com.example.farkliaktiviteler

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var username: EditText // editText değişkenini tanımla Username
    private lateinit var password: EditText // editText değişkenini tanımla Pasword

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        username = findViewById(R.id.username) // EditText'i layout dosyasındaki ID ile bağla Username
        password = findViewById(R.id.password) // EditText'i layout dosyasındaki ID ile bağla password

        //Toast - Alert
        //applicationContext -> app context
        //this , this@MainActivity ->aktivitenin contex'i

        //KOD-1: - Toast.makeText(this,"Hoşgeldin!",Toast.LENGTH_LONG).show()
        //KOD-2: - Toast.makeText(applicationContext,"Hoşgeldin!",Toast.LENGTH_LONG).show()
    }

    fun kayitGit(view: View){
        val intent = Intent(applicationContext,kayitSayfasi::class.java)
        startActivity(intent)
    }

    fun girisYap(view: View){

        // Butona tıklayınca Veri alma
        val kullaniciAdi = username.text.toString()
        val kullaniciSifre = password.text.toString()

        val adi = "bilal"
        val sif = "a"

        // aşağıdak if kodunu açarsak bu aşağıdaki iki satır kodu silelim
        val intent = Intent(applicationContext,IkinciActivity::class.java)
        startActivity(intent)
        finish()

        /*
        if (kullaniciAdi == adi) {
            if (kullaniciSifre == sif){
                val intent = Intent(
                    applicationContext,
                    IkinciActivity::class.java
                ) // Intent oluştururken this kullan
                intent.putExtra(
                    "yollananVeri",
                    kullaniciAdi + kullaniciSifre
                ) // putExtra metodu düzeltilmiş hali
                startActivity(intent)
                Toast.makeText(this,"Hoşgeldin!",Toast.LENGTH_LONG).show()
                finish()
            }else{


                // Uyarı Mesajı - Alert
                // Dialog oluşturma
                val uyariMesaji = AlertDialog.Builder(this)
                uyariMesaji.setTitle("Hatalı Şifre")
                uyariMesaji.setMessage("Yeniden Dene !")

                // Pozitif Buton Oluşturma
                uyariMesaji.setPositiveButton("Evet") { dialogInterface, i ->
                    Toast.makeText(this, "Yeniden Başlatılıyor ..", Toast.LENGTH_LONG).show()

                    // EditText alanlarını temizle
                    username.text.clear()
                    password.text.clear()
                }

                // Negatif Buton Oluşturma
                uyariMesaji.setNegativeButton("Hayır") { dialogInterface, i ->
                    Toast.makeText(this, "Sonlandırılıyor ..", Toast.LENGTH_SHORT).show()
                }

                // AlertDialog'u göster
                uyariMesaji.show()

            }
        }else{
            Toast.makeText(this,"Kullanıcı Adı Hatalı!",Toast.LENGTH_LONG).show()

        }*/
        // EditText alanlarını temizle
        username.text.clear()
        password.text.clear()
    }

    fun ac(view: View){
        val intent = Intent(applicationContext,navigasyon::class.java)
        startActivity(intent)
    }
}