package UTS.example.afanjiysr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_intent_bundle.*

class IntentBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)

        val namapanggilan = intent.getStringExtra("Nama")
        val nama = intent.getStringExtra("Nama")
        val npm = intent.getStringExtra("Npm")
        val kelas = intent.getStringExtra("Kelas")
        val agama = intent.getStringExtra("Agama")
        val email = intent.getStringExtra("Email")
        val foto = intent.getStringExtra("Foto")


        Glide.with(this).load(foto).override(512, 512).error(R.drawable.fanji_mobile).into(ivFotoku)
        tvNamaku.text = namapanggilan
        tvNpm.text = npm
        tvKelas.text = kelas
        tvEmail.text = email
        tvAgama.text = agama
        tvEmail.text = email


    }
}
