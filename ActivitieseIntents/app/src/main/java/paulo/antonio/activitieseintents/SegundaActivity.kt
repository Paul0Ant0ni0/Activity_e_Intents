package paulo.antonio.activitieseintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        val btn_voltar = findViewById<Button>(R.id.btn_voltar)


        btn_voltar.setOnClickListener {
            finish()
        }
    }
}