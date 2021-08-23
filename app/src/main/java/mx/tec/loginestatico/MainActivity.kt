package mx.tec.loginestatico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val usuario = findViewById<EditText>(R.id.editUsuario)
        val password = findViewById<EditText>(R.id.editPassword)
        val logIn = findViewById<Button>(R.id.buttonLogin)
        val cancelar = findViewById<Button>(R.id.buttonCancelar)

        cancelar.setOnClickListener(this@MainActivity)
        logIn.setOnClickListener(this@MainActivity)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.buttonLogin -> {
                val intent = Intent(this@MainActivity, Otra::class.java)
                intent.putExtra("Usuario", editUsuario.text.toString())
                intent.putExtra("Password", editPassword.text.toString())
                startActivity(intent)
            }
            R.id.buttonCancelar -> {
                finish()
            }
        }
    }
}