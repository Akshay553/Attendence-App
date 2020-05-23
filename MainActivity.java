package com.example.institutionaldatamanager;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    TextView rangeTextView;
    Button button;
    Button button2;
    Button button3;
    Button back1;
    Button back2;
    Button addno;
    ListView studentList;
    ListView branchList;
    EditText fromTextView;
    EditText toTextView;
    EditText addRollText;
    TextView selectBranchTextView;
    ListView compFunctionList;
    ListView entcFunctionList;
    ListView elecFunctionList;
    ListView instruFunctionList;
    ListView mechFunctionList;
    ListView prodFunctionList;
    ListView civilFunctionList;
    ListView planFunctionList;

    ArrayList<String> rollNo= new ArrayList<String>();

    @Override
    public void onBackPressed() {

        return ;
    }

    public void start(View view){

        imageView.setVisibility(View.INVISIBLE);
        rangeTextView.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        button.setVisibility(View.INVISIBLE);
        branchList.setVisibility(View.VISIBLE);
        selectBranchTextView.setVisibility(View.VISIBLE);


        ArrayList<String> branch= new ArrayList<String>();

        branch.add("Computer Science");
        branch.add("Entc");
        branch.add("Electrical");
        branch.add("Instrumentation");
        branch.add("Mechanical");
        branch.add("Production");
        branch.add("Civil");
        branch.add("Planning");

        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,branch);

        branchList.setAdapter(arrayAdapter);
        branchList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String tag = Integer.toString(position);
                if(tag.equals("0")){
                    Compfunctions();
                }
                else if(tag.equals("1")){
                    Entcfunctions();

                }
                else if(tag.equals("2")){
                    Elecfunctions();
                }
                if(tag.equals("3")){
                    Instrufunction();
                }
                else if(tag.equals("4")){
                    Mechfunctions();

                }
                else if(tag.equals("5")){
                    prodfunctions();
                }
                else if(tag.equals("6")){
                    Civilfunctions();

                }
                else if(tag.equals("7")){
                    planfunctions();
                }
            }
        });


    }

    public void Compfunctions(){

        branchList.setVisibility(View.INVISIBLE);
        selectBranchTextView.setVisibility(View.INVISIBLE);
        ArrayList<String> comp= new ArrayList<String>();
        compFunctionList.setVisibility(View.VISIBLE);


        comp.add("Attendance");
        comp.add("Results");
        comp.add("Announcements");
        comp.add("Assignments");
        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,comp);

        compFunctionList.setAdapter(arrayAdapter);


        compFunctionList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                String tag = Integer.toString(position);

                if(tag.equals("0")){
                    compFunctionList.setVisibility(View.INVISIBLE);
                    fromTextView.setVisibility(View.VISIBLE);
                    toTextView.setVisibility(View.VISIBLE);
                    rangeTextView.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    back2.setVisibility(View.VISIBLE);
                    addno.setVisibility(View.INVISIBLE);

                    }






                else if(tag.equals("1")){


                }
                else if(tag.equals("2")){

                }
                if(tag.equals("3")){

                }
            }
        });

    }
    public void Entcfunctions(){

        entcFunctionList.setVisibility(View.VISIBLE);
        branchList.setVisibility(View.INVISIBLE);
        selectBranchTextView.setVisibility(View.INVISIBLE);
        ArrayList<String> entc= new ArrayList<String>();


        entc.add("Attendance");
        entc.add("Results");
        entc.add("Announcements");
        entc.add("Assignments");

        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,entc);

        entcFunctionList.setAdapter(arrayAdapter);
        entcFunctionList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                String tag = Integer.toString(position);
                if(tag.equals("0")){
                    entcFunctionList.setVisibility(View.INVISIBLE);
                    fromTextView.setVisibility(View.VISIBLE);
                    toTextView.setVisibility(View.VISIBLE);
                    rangeTextView.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }
                else if(tag.equals("1")){


                }
                else if(tag.equals("2")){

                }
                if(tag.equals("3")){

                }
            }
        });
    }
    public void Elecfunctions(){
        elecFunctionList.setVisibility(View.VISIBLE);
        branchList.setVisibility(View.INVISIBLE);
        selectBranchTextView.setVisibility(View.INVISIBLE);
        ArrayList<String> elec= new ArrayList<String>();


        elec.add("Attendance");
        elec.add("Results");
        elec.add("Announcements");
        elec.add("Assignments");
        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,elec);

        elecFunctionList.setAdapter(arrayAdapter);
        elecFunctionList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                String tag = Integer.toString(position);
                if(tag.equals("0")){
                    elecFunctionList.setVisibility(View.INVISIBLE);
                    fromTextView.setVisibility(View.VISIBLE);
                    toTextView.setVisibility(View.VISIBLE);
                    rangeTextView.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }
                else if(tag.equals("1")){


                }
                else if(tag.equals("2")){

                }
                if(tag.equals("3")){

                }
            }
        });
    }
    public void Instrufunction(){
        instruFunctionList.setVisibility(View.VISIBLE);
        branchList.setVisibility(View.INVISIBLE);
        selectBranchTextView.setVisibility(View.INVISIBLE);
        ArrayList<String> instru = new ArrayList<String>();


        instru.add("Attendance");
        instru.add("Results");
        instru.add("Announcements");
        instru.add("Assignments");

        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,instru);

        instruFunctionList.setAdapter(arrayAdapter);
        instruFunctionList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                String tag = Integer.toString(position);
                if(tag.equals("0")){
                    instruFunctionList.setVisibility(View.INVISIBLE);
                    fromTextView.setVisibility(View.VISIBLE);
                    toTextView.setVisibility(View.VISIBLE);
                    rangeTextView.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }
                else if(tag.equals("1")){


                }
                else if(tag.equals("2")){

                }
                if(tag.equals("3")){

                }
            }
        });
    }
    public void Mechfunctions(){
        mechFunctionList.setVisibility(View.VISIBLE);
        branchList.setVisibility(View.INVISIBLE);
        selectBranchTextView.setVisibility(View.INVISIBLE);
        ArrayList<String> mech= new ArrayList<String>();

        mech.add("Attendance");
        mech.add("Results");
        mech.add("Announcements");
        mech.add("Assignments");

        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mech);

        mechFunctionList.setAdapter(arrayAdapter);
        mechFunctionList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                String tag = Integer.toString(position);
                if(tag.equals("0")){
                    mechFunctionList.setVisibility(View.INVISIBLE);
                    fromTextView.setVisibility(View.VISIBLE);
                    toTextView.setVisibility(View.VISIBLE);
                    rangeTextView.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }
                else if(tag.equals("1")){


                }
                else if(tag.equals("2")){

                }
                if(tag.equals("3")){

                }
            }
        });
    }
    public void prodfunctions(){
        prodFunctionList.setVisibility(View.VISIBLE);
        branchList.setVisibility(View.INVISIBLE);
        selectBranchTextView.setVisibility(View.INVISIBLE);
        ArrayList<String> prod= new ArrayList<String>();


        prod.add("Attendance");
        prod.add("Results");
        prod.add("Announcements");
        prod.add("Assignments");

        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,prod);

        prodFunctionList.setAdapter(arrayAdapter);
        prodFunctionList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                String tag = Integer.toString(position);
                if(tag.equals("0")){
                    prodFunctionList.setVisibility(View.INVISIBLE);
                    fromTextView.setVisibility(View.VISIBLE);
                    toTextView.setVisibility(View.VISIBLE);
                    rangeTextView.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }
                else if(tag.equals("1")){


                }
                else if(tag.equals("2")){

                }
                if(tag.equals("3")){

                }
            }
        });
    }
    public void Civilfunctions(){

        civilFunctionList.setVisibility(View.VISIBLE);
        branchList.setVisibility(View.INVISIBLE);
        selectBranchTextView.setVisibility(View.INVISIBLE);
        ArrayList<String> civil= new ArrayList<String>();


        civil.add("Attendance");
        civil.add("Results");
        civil.add("Announcements");
        civil.add("Assignments");

        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,civil);

        civilFunctionList.setAdapter(arrayAdapter);
        civilFunctionList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                String tag = Integer.toString(position);
                if(tag.equals("0")){
                    civilFunctionList.setVisibility(View.INVISIBLE);
                    fromTextView.setVisibility(View.VISIBLE);
                    toTextView.setVisibility(View.VISIBLE);
                    rangeTextView.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }
                else if(tag.equals("1")){


                }
                else if(tag.equals("2")){

                }
                if(tag.equals("3")){

                }
            }
        });
    }
    public void planfunctions(){
        planFunctionList.setVisibility(View.VISIBLE);
        branchList.setVisibility(View.INVISIBLE);
        selectBranchTextView.setVisibility(View.INVISIBLE);
        ArrayList<String> plan= new ArrayList<String>();

        plan.add("Attendance");
        plan.add("Results");
        plan.add("Announcements");
        plan.add("Assignments");

        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,plan);

        planFunctionList.setAdapter(arrayAdapter);
        planFunctionList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                String tag = Integer.toString(position);
                if(tag.equals("0")){
                    planFunctionList.setVisibility(View.INVISIBLE);
                    fromTextView.setVisibility(View.VISIBLE);
                    toTextView.setVisibility(View.VISIBLE);
                    rangeTextView.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }

                else if(tag.equals("1")){


                }
                else if(tag.equals("2")){

                }
                if(tag.equals("3")){

                }
            }
        });
    }

    public void tag0(View view){

        fromTextView.setVisibility(View.INVISIBLE);
        toTextView.setVisibility(View.INVISIBLE);
        rangeTextView.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        studentList.setVisibility(View.VISIBLE);
        back1.setVisibility(View.VISIBLE);


        String a = fromTextView.getText().toString();
        String b =toTextView.getText().toString();

        int aint = Integer.parseInt(a);
        int bint = Integer.parseInt(b);

        if(aint < bint && aint>0 && bint>0) {
            for(int i=aint ; i<=bint ; i++) {
                rollNo.add(Integer.toString(i));
            }
        }
        else{
            Toast.makeText(this,"Wrong Input",Toast.LENGTH_SHORT).show();
            return;
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rollNo);

        studentList.setAdapter(arrayAdapter);

        addno.setVisibility(View.VISIBLE);
        back1.setVisibility(View.VISIBLE);
        back2.setVisibility(View.INVISIBLE);
        studentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.GREEN);
            }
        });



    }
    public void add(View view){
        studentList.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        addRollText.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        addno.setVisibility(View.INVISIBLE);
        back1.setVisibility(View.INVISIBLE);
        back2.setVisibility(View.INVISIBLE);
    }

    public void okadd(View view){
        String a = addRollText.getText().toString();
        rollNo.add(a);
        studentList.setVisibility(View.VISIBLE);
        button2.setVisibility(View.INVISIBLE);
        addRollText.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        back1.setVisibility(View.VISIBLE);
        addno.setVisibility(View.VISIBLE);


    }
    public void back1(View view){

        studentList.setVisibility(View.INVISIBLE);
        rollNo.clear();
        compFunctionList.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.VISIBLE);
        rangeTextView.setVisibility(View.VISIBLE);
        fromTextView.setVisibility(View.VISIBLE);
        toTextView.setVisibility(View.VISIBLE);
        button3.setVisibility(View.INVISIBLE);
        back1.setVisibility(View.INVISIBLE);
        back2.setVisibility(View.VISIBLE);
    }

    public void back2(View view){

        studentList.setVisibility(View.INVISIBLE);
        compFunctionList.setVisibility(View.VISIBLE);
        button2.setVisibility(View.INVISIBLE);
        rangeTextView.setVisibility(View.INVISIBLE);
        fromTextView.setVisibility(View.INVISIBLE);
        toTextView.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        back1.setVisibility(View.INVISIBLE);
        back2.setVisibility(View.INVISIBLE);
        addno.setVisibility(View.INVISIBLE);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        rangeTextView = findViewById(R.id.rangeTextView);
        button = findViewById(R.id.button);
        addno = findViewById(R.id.addno);
        studentList = findViewById(R.id.studentList);
        branchList = findViewById(R.id.branchlist);
        fromTextView = findViewById(R.id.fromTextView);
        toTextView = findViewById(R.id.toTextView);
        selectBranchTextView = findViewById(R.id.selectBranchTextView);
        compFunctionList = findViewById(R.id.compFunctionlist);
        entcFunctionList = findViewById(R.id.entcFunctionlist);
        elecFunctionList = findViewById(R.id.elecFunctionlist);
        instruFunctionList = findViewById(R.id.instruFunctionlist);
        mechFunctionList = findViewById(R.id.mechFunctionlist);
        prodFunctionList = findViewById(R.id.prodFunctionlist);
        civilFunctionList = findViewById(R.id.civilFunctionlist);
        planFunctionList = findViewById(R.id.planFunctionlist);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        back1 =findViewById(R.id.back1);
        back2 =findViewById(R.id.back2);
        addRollText = findViewById(R.id.addRollText);
        button3 = findViewById(R.id.button3);

        imageView.setVisibility(View.VISIBLE);
        textView.setVisibility(View.VISIBLE);
        button.setVisibility(View.VISIBLE);
    }

}
