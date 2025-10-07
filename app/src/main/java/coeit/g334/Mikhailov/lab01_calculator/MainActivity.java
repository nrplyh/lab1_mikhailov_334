package coeit.g334.Mikhailov.lab01_calculator;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    EditText ta;
    EditText tb;
    TextView lr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.txt_a);
        tb = findViewById(R.id.txt_b);
        lr = findViewById(R.id.super_result);
    }

    public void my_add_click(View v) {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        if (sa.isEmpty() || sb.isEmpty()) {
            lr.setText("Введите числа!");
            return;
        }
        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        float c = a + b;
        String ac = String.valueOf(c);

        lr.setText(ac);
    }

    public void my_sub_click(View v) {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        if (sa.isEmpty() || sb.isEmpty()) {
            lr.setText("Введите числа!");
            return;
        }
        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        float c = a - b;
        String ac = String.valueOf(c);

        lr.setText(ac);
    }

    public void my_div_click(View v) {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        if (sa.isEmpty() || sb.isEmpty()) {
            lr.setText("Введите числа!");
            return;
        }
        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        if (b == 0) {
            lr.setText("На ноль делить нельзя!");
            return;
        }

        float c = a / b;
        String ac = String.valueOf(c);

        lr.setText(ac);
    }

    public void my_mul_click(View v) {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        if (sa.isEmpty() || sb.isEmpty()) {
            lr.setText("Введите числа!");
            return;
        }
        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        float c = a * b;
        String ac = String.valueOf(c);

        lr.setText(ac);
    }

    public void my_sin_click(View v) {
        String sa = ta.getText().toString();
        if (sa.isEmpty()) {
            lr.setText("Введите число!");
            return;
        }
        float a = Float.parseFloat(sa);
        double radians = Math.toRadians(a);
        double result = Math.sin(radians);
        lr.setText(String.valueOf(result));
    }

    public void my_cos_click(View v) {
        String sa = ta.getText().toString();
        if (sa.isEmpty()) {
            lr.setText("Введите число!");
            return;
        }
        float a = Float.parseFloat(sa);
        double radians = Math.toRadians(a);
        double result = Math.cos(radians);
        lr.setText(String.valueOf(result));
    }

    public void my_tan_click(View v) {
        String sa = ta.getText().toString();
        if (sa.isEmpty()) {
            lr.setText("Введите число!");
            return;
        }
        float a = Float.parseFloat(sa);

        if (a % 90 == 0 && a % 180 != 0) {
            lr.setText("Не определено");
            return;
        }

        double radians = Math.toRadians(a);
        double result = Math.tan(radians);
        lr.setText(String.valueOf(result));
    }
}