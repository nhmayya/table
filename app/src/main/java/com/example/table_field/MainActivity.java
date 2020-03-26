package com.example.table_field;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.jar.Attributes;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.listeners.TableDataClickListener;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

public class MainActivity extends AppCompatActivity {

    String[] sph={"ID","Name"};
    String[][] sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TableView<String[]> tb=(TableView<String[]>) findViewById(R.id.tableView);
        tb.setColumnCount(2);
        tb.setHeaderBackgroundColor(Color.parseColor("#2ecc71"));
        PopulateData();
        tb.setHeaderAdapter(new SimpleTableHeaderAdapter(this,sph));
        tb.setDataAdapter(new SimpleTableDataAdapter(this,sp));
        tb.addDataClickListener(new TableDataClickListener() {
            @Override
            public void onDataClicked(int rowIndex,Object clickedData) {
                Toast.makeText(MainActivity.this,((String[])clickedData)[1],Toast.LENGTH_SHORT).show();
            }
        });
    }
   private  void PopulateData(){
        SpaceProbe spaceProbe=new SpaceProbe();
       ArrayList<SpaceProbe> spaceProbeList=new ArrayList<>();
     /*  spaceProbe=new SpaceProbe();
       spaceProbe.setId("1");
       spaceProbe.setName("hari");
       spaceProbeList.add(spaceProbe);

       spaceProbe=new SpaceProbe();
       spaceProbe.setId("2");
       spaceProbe.setName("dattha");
       spaceProbeList.add(spaceProbe);
       spaceProbe=new SpaceProbe();
       spaceProbe.setId("3");
       spaceProbe.setName("dattha");
       spaceProbeList.add(spaceProbe);
       spaceProbe=new SpaceProbe();
       spaceProbe.setId("2");
       spaceProbe.setName("dattha");
       spaceProbeList.add(spaceProbe);
       spaceProbe=new SpaceProbe();
       spaceProbe.setId("2");
       spaceProbe.setName("dattha");
       spaceProbeList.add(spaceProbe);*/



     //  sp=new String[spaceProbeList.size()][5];
      // for(int i=0;i<spaceProbeList.size();i++){
       //    SpaceProbe s=spaceProbeList.get(i);
       //    sp[i][0]=s.getId();
       //    sp[i][1]=s.getName();
      // }
       sp=new String[5][5];
       for(int i=0;i<5;i++){
           String var="dp";
           sp[i][0]=String.valueOf(i);
              sp[i][1]=var+sp[i][0];
       }
    }
}
