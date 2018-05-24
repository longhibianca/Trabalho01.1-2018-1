package br.edu.iff.pooa20181.trabalho011_2018_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtArea;
    Button btnCalcular;
    TextView respGalao;
    TextView respLata;
    TextView respComb;
    TextView precoLata;
    TextView precoGalao;
    TextView precoComb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtArea = (EditText) findViewById(R.id.edtArea);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        respGalao = (TextView) findViewById(R.id.respGalao);
        respLata = (TextView) findViewById(R.id.respLatas);
        respComb = (TextView) findViewById(R.id.respComb);
        precoLata = (TextView) findViewById(R.id.precoLata);
        precoGalao = (TextView) findViewById(R.id.precoGalao);
        precoComb = (TextView) findViewById(R.id.precoComb);

        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calcularLata();
            }
        });

    }

    public void calcularLata()
    {
        float areaAPintar;
        float cobertura;
        cobertura = 6;
        float qtdLitrosNecessarios;
        double qtdLatasNecesarias;
        double preco;

        areaAPintar = Float.parseFloat(edtArea.getText().toString());
        qtdLitrosNecessarios = areaAPintar/cobertura;

        qtdLatasNecesarias = qtdLitrosNecessarios/18;
        /*resto = qtdLitrosNecessarios%18;

        if (resto > 0)
        {
            qtdLatasNecesarias += 1;
        }
        */
        qtdLatasNecesarias = Math.ceil(qtdLatasNecesarias);
        preco = qtdLatasNecesarias * 80;
        respLata.setText("Necessita de "+qtdLatasNecesarias+ " latas");
        precoLata.setText("Preço: "+ preco);
    }
}
