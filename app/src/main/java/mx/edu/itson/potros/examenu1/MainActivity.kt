package mx.edu.itson.potros.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var convertirCF : Double = 0.0;
        var convertirFC : Double = 0.0;

        val gradosC : EditText = findViewById(R.id.etC);
        val gradosF : EditText = findViewById(R.id.etF);
        val btnGC : Button = findViewById(R.id.btnGC);
        val btnFC : Button = findViewById(R.id.btnGF);

        var grados : Double = 0.0;
        var valor : String = "";

        // Convertir de Celsius a Farenheit
        btnGC.setOnClickListener {
            if(!gradosC.equals("")){
                grados = gradosC.text.toString().toDouble();
                convertirCF = grados * 1.8 + 32;
                valor = convertirCF.toString();
                gradosF.setText(valor);
            }
        }

        // Convertir de Farenheit a Celsius
        btnFC.setOnClickListener {
            if(!gradosC.equals("")){
                grados = gradosF.text.toString().toDouble();
                convertirFC = (grados - 32) / 1.8;
                valor = convertirFC.toString();
                gradosC.setText(valor);
            }
        }
    }
}