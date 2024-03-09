# Kotlin-Mobil-Uygulamalar

Kotlin-Mobil-Uygulamalar

**FarkliAktiviteler-10 :** FarkliAktiviteler-10. serisinde:
-Son Kulanıcıyı Kaydetme
-Sokoru kaydetme
-Doğru Yanlış sayısını Kaydetme gibi Geçici ve sınırlı verileri kayıt yapmamızı sağlayan SharedPreferences özelliğini Öğrendik

**FarkliAktiviteler-16 :** FarkliAktiviteler-16. serisinde:
-Fragmentler
-add :üstüstyazdırma
-replaca :yenilmee

User
bu kodlarımı düzenleyerek istediğimi yapa bilirmisin .mevcut fragmentı değiştirmek için kullanılacak bir buton oluşturabilirsin
ChatGPT
Tabii ki, mevcut fragmentı değiştirmek için bir buton eklemek için kodlarınızı düzenleyebiliriz. İşte bu amaca yönelik düzenlenmiş bir örnek:

Öncelikle, activity_fragment_kotlin.xml dosyasına bir buton ekleyeceğiz. Bu butonu, mevcut fragmentı değiştirmek için kullanacağız. Sonra, FragmentKotlin sınıfına butona tıklama işlevselliğini ekleyeceğiz.

İşte activity_fragment_kotlin.xml dosyasının güncellenmiş hali:

xml
Copy code
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".FragmentKotlin">

    <!-- TextView'yi burada tutuyoruz -->

    <Button
        android:id="@+id/changeFragmentButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Change Fragment"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_marginTop="16dp"
        android:onClick="changeFragmentOnClick" />

    <FrameLayout
        android:id="@+id/frameLayout"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        app:layout_constraintTop_toBottomOf="@id/changeFragmentButton"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
Yukarıdaki XML kodunda, changeFragmentButton adında bir buton ekledik. Bu butona tıklandığında mevcut fragmentın değişeceği changeFragmentOnClick adında bir onClick işlevi belirledik.

Şimdi, FragmentKotlin sınıfını düzenleyelim ve butona tıklama işlevselliğini ekleyelim:

kotlin
Copy code
class FragmentKotlin : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_fragment_kotlin)
}

    fun changeFragmentOnClick(view: View) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val currentFragment = fragmentManager.findFragmentById(R.id.frameLayout)
        val newFragment = if (currentFragment is BlankFragment) BlankFragment2() else BlankFragment()

        fragmentTransaction.replace(R.id.frameLayout, newFragment).commit()
    }

}
Yukarıdaki Kotlin kodunda, changeFragmentOnClick adında bir işlev tanımladık. Bu işlev, butona tıklandığında çağrılacak ve mevcut fragmentı değiştirecektir. İlk önce, mevcut fragmentı buluruz. Eğer mevcut fragment BlankFragment ise, BlankFragment2 ile değiştirilir, aksi takdirde BlankFragment ile değiştirilir. Sonra, yeni fragmentı frameLayout içine yerleştiririz.
