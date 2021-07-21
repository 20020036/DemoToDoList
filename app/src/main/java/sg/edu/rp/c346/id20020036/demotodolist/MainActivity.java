package sg.edu.rp.c346.id20020036.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<ToDoItem> al;
    CustomAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);
        al.add(new ToDoItem("Go for movie", date1));
        al.add(new ToDoItem("Go for haircut", date2));

        aa = new CustomAdapter(this, R.layout.row, al);
        lv.setAdapter(aa);

    }
}