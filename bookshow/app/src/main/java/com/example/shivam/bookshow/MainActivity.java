package com.example.shivam.bookshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] metrocity={"select metro city","kolkata","mumbai","chennai","lucknow","delhi"};
    String[] kolkata={"select theatre","pvr","inox","arti cinemas","cinepolis"};
    String[] mumbai={"select theatre","carnival","cinepolis","fun cinemas","PVR"};
    String[] chennai={"select theatre","cinepolis","PVR","velachery PVR"};
    String[] lucknow={"select theatre","cinepolis","srs","PVR","phoenix"};
    String[] delhi={"select theatre","cinepolis","PVR","DT cinemas","PVR shalimar"};
    String[] movies={"SELECT MOVIE","tubelight","bahubali","despicable me 3","mummy"};
    String[] time={"SELECT TIME","9:00-12:00","12:00-3:00","3:00-6:00","6:00-9:00"};
    Button pro1;
    Spinner metro;
    Spinner theatre;
    Spinner movie;
    Spinner shows;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metro= (Spinner) findViewById(R.id.metrocity);
        ArrayAdapter<String> aA=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,metrocity);
        metro.setAdapter(aA);
        metro.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String city=adapterView.getItemAtPosition(i).toString();

                ArrayAdapter<String> aB;
                switch (city)
                {
                    case "kolkata":
                        theatre= (Spinner) findViewById(R.id.theatre);
                        aB=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,kolkata);
                        theatre.setAdapter(aB);
                        theatre.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                movie= (Spinner) findViewById(R.id.movie);
                                ArrayAdapter<String> aC=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,movies);
                                movie.setAdapter(aC);
                                movie.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        shows= (Spinner) findViewById(R.id.time);
                                        ArrayAdapter<String> aD=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,time);
                                        shows.setAdapter(aD);
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                        break;
                    case "mumbai":
                        theatre = (Spinner) findViewById(R.id.theatre);
                        aB = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, mumbai);
                        theatre.setAdapter(aB);
                        theatre.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                movie= (Spinner) findViewById(R.id.movie);
                                ArrayAdapter<String> aC=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,movies);
                                movie.setAdapter(aC);
                                movie.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        shows= (Spinner) findViewById(R.id.time);
                                        ArrayAdapter<String> aD=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,time);
                                        shows.setAdapter(aD);
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                        break;
                    case "chennai":
                        theatre = (Spinner) findViewById(R.id.theatre);
                        aB=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,chennai);
                        theatre.setAdapter(aB);
                        theatre.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                movie= (Spinner) findViewById(R.id.movie);
                                ArrayAdapter<String> aC=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,movies);
                                movie.setAdapter(aC);
                                movie.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        shows= (Spinner) findViewById(R.id.time);
                                        ArrayAdapter<String> aD=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,time);
                                        shows.setAdapter(aD);
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                        break;
                    case "lucknow":
                        theatre= (Spinner) findViewById(R.id.theatre);
                        aB=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,lucknow);
                        theatre.setAdapter(aB);
                        theatre.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                movie= (Spinner) findViewById(R.id.movie);
                                ArrayAdapter<String> aC=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,movies);
                                movie.setAdapter(aC);
                                movie.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        shows= (Spinner) findViewById(R.id.time);
                                        ArrayAdapter<String> aD=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,time);
                                        shows.setAdapter(aD);
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                        break;
                    case "delhi":
                        theatre= (Spinner) findViewById(R.id.theatre);
                        aB=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,delhi);
                        theatre.setAdapter(aB);
                        theatre.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                movie= (Spinner) findViewById(R.id.movie);
                                ArrayAdapter<String> aC=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,movies);
                                movie.setAdapter(aC);
                                movie.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        shows= (Spinner) findViewById(R.id.time);
                                        ArrayAdapter<String> aD=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,time);
                                        shows.setAdapter(aD);
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        pro1= (Button) findViewById(R.id.pro1);
        pro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(metro.getSelectedItem().toString()!="select metro city"&&theatre.getSelectedItem().toString()!="select theatre"&&movie.getSelectedItem().toString()!="SELECT MOVIE"&&shows.getSelectedItem().toString()!="SELECT TIME") {
                    Intent i = new Intent(MainActivity.this, seatbook.class);
                    Bundle b=new Bundle();
                    b.putString("cname",metro.getSelectedItem().toString());
                    b.putString("tname",theatre.getSelectedItem().toString());
                    b.putString("mname",movie.getSelectedItem().toString());
                    b.putString("stime",shows.getSelectedItem().toString());
                    i.putExtras(b);
                    startActivity(i);
                }
                else
                    Toast.makeText(MainActivity.this, "select valid DETAILS", Toast.LENGTH_SHORT).show();
            }
        });
    }
}