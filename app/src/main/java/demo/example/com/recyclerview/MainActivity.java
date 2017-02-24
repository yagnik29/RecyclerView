package demo.example.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
    String name[]={"a","b","c","d","e","f","g"};
    String email[]={"aa@gm","aa@gm","aa@gm","aa@gm","aa@gm","aa@gm","aa@gm"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView)findViewById(R.id.recycler);
        rv.setLayoutManager(new LinearLayoutManager(this));

        for(int i=0;i<name.length;i++){

            HashMap<String,String>hm=new HashMap<>();
            hm.put("name",name[i]);
            hm.put("email",email[i]);
            arrayList.add(hm);
        }

        CustomAdapter adapter=new CustomAdapter(this,arrayList);
        rv.setAdapter(adapter);


    }
}
