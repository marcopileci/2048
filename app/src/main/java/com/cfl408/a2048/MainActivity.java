package com.cfl408.a2048;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        generar_ficha_aleatoria();
    }

    public void generar_ficha_aleatoria() {
        Random random = new Random();
        int fila = random.nextInt(4);
        int columna = random.nextInt(4);

        // Matriz con los IDs estáticos de los 16 cuadros en activity_main.xml
        int[][] gridIds = {
                {R.id.layout_vertical_1_1, R.id.layout_vertical_1_2, R.id.layout_vertical_1_3, R.id.layout_vertical_1_4},
                {R.id.layout_vertical_2_1, R.id.layout_vertical_2_2, R.id.layout_vertical_2_3, R.id.layout_vertical_2_4},
                {R.id.layout_vertical_3_1, R.id.layout_vertical_3_2, R.id.layout_vertical_3_3, R.id.layout_vertical_3_4},
                {R.id.layout_vertical_4_1, R.id.layout_vertical_4_2, R.id.layout_vertical_4_3, R.id.layout_vertical_4_4}
        };

        int resId = gridIds[fila][columna];
        LinearLayout cellLayout = findViewById(resId);
        if (cellLayout != null) {
            // Crea un TextView para mostrar la ficha (ej. número 2)
            TextView tileView = new TextView(this);
            tileView.setText("2");
            tileView.setTextSize(24);
            tileView.setGravity(Gravity.CENTER);
            tileView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT
            ));
            cellLayout.setBackgroundResource(R.drawable.border); // Color de fondo
            //cellLayout.setBackgroundColor(Color.parseColor("#EEE4DA")); // Color estilo 2048

            cellLayout.removeAllViews(); // Limpia la celda por si ya tenía ficha
            cellLayout.addView(tileView);
        }
    }
}