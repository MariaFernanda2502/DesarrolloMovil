package mx.tec.loginestatico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class Otra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otra)

        val usuario = intent.getStringExtra("Usuario")
        val password = intent.getStringExtra("Password")

        val nombre = findViewById<TextView>(R.id.textCambiante)
        if (usuario == "root" && password == "root") {
            nombre.setText("Bienvenido")
        } else {
            nombre.setText("No es correcto!")
        }

        println(usuario)
        println(password)
    }
}