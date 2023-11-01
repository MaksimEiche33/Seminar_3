package mai.team2.seminar_23_10_23;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] cities = {"Moskau", "Samara", "Wologda", "Wolgograd", "Sratow", "Воронеж"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Получаем ссылку на элемент AutoCompleteTextView в разметке
        MultiAutoCompleteTextView autoCompleteTextView = findViewById(R.id.autocomplete);
        // Создаем адаптер для автозаполнения элемента MultiAutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, cities);
        autoCompleteTextView.setAdapter(adapter);
        // установка запятой в качестве разделителя
        autoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}