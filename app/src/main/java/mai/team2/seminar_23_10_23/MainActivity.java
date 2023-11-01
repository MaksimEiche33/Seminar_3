package mai.team2.seminar_23_10_23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        states.add(new State ("Бразилия", "Бразилиа", R.drawable.brazil));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.argent));
        states.add(new State ("Колумбия", "Богота", R.drawable.columb));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.urug));
        states.add(new State ("Чили", "Сантьяго", R.drawable.chili));
    }
}