package com.example.farkliaktiviteler

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.content.SharedPreferences
import android.widget.EditText
import android.widget.TextView

class kayitSayfasi : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences // SharedPreferences nesnesi oluşturuldu, bu nesne uygulama verilerini saklamak için kullanılacak
    lateinit var textView8: TextView // TextView nesnesi oluşturuldu, kullanıcı adının gösterileceği alanı temsil eder
    private lateinit var username: EditText // EditText nesnesi oluşturuldu, kullanıcı adını girmek için kullanılacak
    private lateinit var mail: EditText // EditText nesnesi oluşturuldu, e-posta adresini girmek için kullanılacak
    private lateinit var password: EditText // EditText nesnesi oluşturuldu, şifreyi girmek için kullanılacak

    var alinanKullaniciAdi: String ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kayit_sayfasi)

        // XML dosyasında tanımlı bileşenlere erişim sağlanıyor
        textView8 = findViewById(R.id.textView8) // textView8 bileşenine erişim sağlanıyor
        username = findViewById(R.id.userNameInput) // Kullanıcı adı giriş alanına erişim sağlanıyor
        mail = findViewById(R.id.mailInput) // E-posta giriş alanına erişim sağlanıyor
        password = findViewById(R.id.passwordInput) // Şifre giriş alanına erişim sağlanıyor

        // SharedPreferences nesnesi oluşturuluyor
        sharedPreferences = this.getSharedPreferences("com.example.farkliaktiviteler", Context.MODE_PRIVATE)

        // SharedPreferences nesnesinden veri alınıyor
        alinanKullaniciAdi = sharedPreferences.getString("kullanici", "")
        if (alinanKullaniciAdi != null) {
            textView8.text = "kayıtlı Kullanıcı Adı : ${alinanKullaniciAdi}"
        }
    }

    fun etutKayitYap(view: View) {
        // Kullanıcı tarafından girilen veriler alınıyor
        val kAdi = username.text.toString() // Kullanıcı adı alınıyor
        val kmail = mail.text.toString() // E-posta alınıyor
        val ksifre = password.text.toString() // Şifre alınıyor

        // Girilen verilerin boş olup olmadığı kontrol ediliyor
        if (kAdi == "" || kmail == "" || ksifre == "") {
            // Eğer herhangi bir alan boşsa, kullanıcıya uyarı mesajı gösteriliyor
            Toast.makeText(this, "Tüm Alanları Doldurun!", Toast.LENGTH_LONG).show()
        } else {
            // Eğer boş alan yoksa, kullanıcı adı SharedPreferences'e kaydediliyor
            sharedPreferences.edit().putString("kullanici", kAdi).apply()
            // Kaydedilen kullanıcı adı textView8 bileşenine yazdırılıyor
            textView8.text = "Kaydedilen Kullanıcı Adı : ${kAdi}"
            /*val intent = Intent(applicationContext,SharedPreferencesKAYIT::class.java)
            startActivity(intent)*/
        }
    }
    fun btnsil(view: View){

        alinanKullaniciAdi = sharedPreferences.getString("kullanici","")

        if(alinanKullaniciAdi != null){
            textView8.text = "Silinen Kullanıcı Adı: ${alinanKullaniciAdi} "
            sharedPreferences.edit().remove("kullanici").apply()

        }
    }
}
