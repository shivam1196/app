package com.example.shivam.bookshow;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.R.layout.simple_spinner_dropdown_item;
import static android.graphics.Color.GREEN;

public class seatbook extends AppCompatActivity {
    Spinner s;
    String id[]=new String[10];
    //String[] c ={"0","1","2","3","4","5","6","7","8","9","10"};
    String[] num={"0","1","2","3","4","5","6","7","8","9","10"};
    int count=0;
    int pos;
    int var=0;
    ToggleButton a1, a2, a3, a4, a5,a6, b1, b2, b3, b4, b5,b6, c1, c2, c3, c4, c5,c6;
    Button pro2;
    String str;
    Object item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seatbook);
       // Toast.makeText(this, "Hi1", Toast.LENGTH_SHORT).show();
        Intent i = getIntent();
        final Bundle b=i.getExtras();
        final Dialog d = new Dialog(seatbook.this);
        d.setTitle("choose number of seats");
        d.setContentView(R.layout.custom);
        s = (Spinner) d.findViewById(R.id.spinner);
        ArrayAdapter<String> aA = new ArrayAdapter<String>(seatbook.this, android.R.layout.simple_spinner_dropdown_item, num);
        s.setAdapter(aA);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> adapterView, View view, final int i, long l) {
                Button btn = (Button) d.findViewById(R.id.button);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        item= adapterView.getItemAtPosition(i);

                        if(s.getSelectedItem().toString()=="0")
                            Toast.makeText(seatbook.this, "book atleast 1 seat", Toast.LENGTH_SHORT).show();
                        else
                            str= s.getSelectedItem().toString();
                        var=Integer.parseInt(str);
                     //   Toast.makeText(seatbook.this, var+"var value before", Toast.LENGTH_SHORT).show();
                            d.dismiss();
//
//                        Toast.makeText(seatbook.this, var+"var value after" , Toast.LENGTH_SHORT).show();
                    }
                });
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
       // Toast.makeText(seatbook.this, var+"var value", Toast.LENGTH_SHORT).show();
        d.show();
     //

        Toast.makeText(this, str+"", Toast.LENGTH_SHORT).show();
        a1 = (ToggleButton) findViewById(R.id.a1);
        a1.setBackgroundColor(Color.TRANSPARENT);
        a2 = (ToggleButton) findViewById(R.id.a2);
        a2.setBackgroundColor(Color.TRANSPARENT);
        a3 = (ToggleButton) findViewById(R.id.a3);
        a3.setBackgroundColor(Color.TRANSPARENT);
        a4 = (ToggleButton) findViewById(R.id.a4);
        a4.setBackgroundColor(Color.TRANSPARENT);
        a5 = (ToggleButton) findViewById(R.id.a5);
        a5.setBackgroundColor(Color.TRANSPARENT);
        a6 = (ToggleButton) findViewById(R.id.a6);
        a6.setBackgroundColor(Color.TRANSPARENT);
        b1 = (ToggleButton) findViewById(R.id.b1);
        b1.setBackgroundColor(Color.TRANSPARENT);
        b2 = (ToggleButton) findViewById(R.id.b2);
        b2.setBackgroundColor(Color.TRANSPARENT);
        b3 = (ToggleButton) findViewById(R.id.b3);
        b3.setBackgroundColor(Color.TRANSPARENT);
        b4 = (ToggleButton) findViewById(R.id.b4);
        b4.setBackgroundColor(Color.TRANSPARENT);
        b5 = (ToggleButton) findViewById(R.id.b5);
        b5.setBackgroundColor(Color.TRANSPARENT);
        b6 = (ToggleButton) findViewById(R.id.b6);
        b6.setBackgroundColor(Color.TRANSPARENT);
        c1 = (ToggleButton) findViewById(R.id.c1);
        c1.setBackgroundColor(Color.TRANSPARENT);
        c2 = (ToggleButton) findViewById(R.id.c2);
        c2.setBackgroundColor(Color.TRANSPARENT);
        c3 = (ToggleButton) findViewById(R.id.c3);
        c3.setBackgroundColor(Color.TRANSPARENT);
        c4 = (ToggleButton) findViewById(R.id.c4);
        c4.setBackgroundColor(Color.TRANSPARENT);
        c5 = (ToggleButton) findViewById(R.id.c5);
        c5.setBackgroundColor(Color.TRANSPARENT);
        c6 = (ToggleButton) findViewById(R.id.c6);
        c6.setBackgroundColor(Color.TRANSPARENT);

//        Toast.makeText(this, var+" value of var", Toast.LENGTH_SHORT).show();
//        Toast.makeText(seatbook.this, var+"var value", Toast.LENGTH_SHORT).show();
            a1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (a1.isChecked()&& var!=0) {
                      //  Toast.makeText(seatbook.this, str + "", Toast.LENGTH_SHORT).show();
                        a1.setBackgroundColor(Color.BLUE);
                        //Toast.makeText(seatbook.this, count+"", Toast.LENGTH_SHORT).show();
                        //Toast.makeText(seatbook.this, var+"var value", Toast.LENGTH_SHORT).show();
                        id[count]="a1";
                        count++;
                        var--;
                        //Toast.makeText(seatbook.this, var+" --", Toast.LENGTH_SHORT).show();
                    } else a1.setBackgroundColor(Color.TRANSPARENT);
                }
            });

            a2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (a2.isChecked() && var!=0) {
                        a2.setBackgroundColor(Color.BLUE);
                        id[count]="a2";
                        count++;
                        var--;
                    } else a2.setBackgroundColor(Color.TRANSPARENT);
                }
            });

            a3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (a3.isChecked() && var!=0) {
                        a3.setBackgroundColor(Color.BLUE);
                        id[count]="a3";
                        count++;
                        var--;
                    } else a3.setBackgroundColor(Color.TRANSPARENT);
                }
            });

            a4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (a4.isChecked()&& var!=0) {
                        a4.setBackgroundColor(Color.BLUE);
                        id[count]="a4";
                        count++;
                        var--;
                    } else a4.setBackgroundColor(Color.TRANSPARENT);
                }
            });

            a5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (a5.isChecked()&& var!=0) {
                        a5.setBackgroundColor(Color.BLUE);
                        id[count]="a5";
                        count++;
                        var--;
                    } else a5.setBackgroundColor(Color.TRANSPARENT);

                }
            });

            a6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (a6.isChecked()&& var!=0) {
                        a6.setBackgroundColor(Color.BLUE);
                        id[count]="a6";
                        count++;
                        var--;
                    } else a6.setBackgroundColor(Color.TRANSPARENT);

                }
            });

            b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b1.isChecked()&& var!=0) {
                        b1.setBackgroundColor(Color.BLUE);
                        id[count]="b1";
                        count++;
                        var--;
                    } else b1.setBackgroundColor(Color.TRANSPARENT);

                }
            });

            b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b2.isChecked()&& var!=0) {
                        b2.setBackgroundColor(Color.BLUE);
                        id[count]="b2";
                        count++;
                        var--;
                    } else b2.setBackgroundColor(Color.TRANSPARENT);

                }
            });

            b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b3.isChecked()&& var!=0) {
                        b3.setBackgroundColor(Color.BLUE);
                        id[count]="b3";
                        count++;
                        var--;
                    } else b3.setBackgroundColor(Color.TRANSPARENT);

                }
            });

            b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b4.isChecked()&& var!=0) {
                        b4.setBackgroundColor(Color.BLUE);
                        id[count]="b4";
                        count++;
                        var--;
                    } else b4.setBackgroundColor(Color.TRANSPARENT);
                }
            });

            b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b5.isChecked()&& var!=0) {
                        b5.setBackgroundColor(Color.BLUE);
                        id[count]="b5";
                        count++;
                        var--;
                    } else b5.setBackgroundColor(Color.TRANSPARENT);

                }
            });

            b6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b6.isChecked()&& var!=0) {
                        b6.setBackgroundColor(Color.BLUE);
                        id[count]="b6";
                        count++;
                        var--;
                    } else b6.setBackgroundColor(Color.TRANSPARENT);

                }
            });

            c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (c1.isChecked()&& var!=0) {
                        c1.setBackgroundColor(Color.BLUE);
                        id[count]="c1";
                        count++;
                        var--;
                    } else c1.setBackgroundColor(Color.TRANSPARENT);

                }
            });

            c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (c2.isChecked()&& var!=0) {
                        c2.setBackgroundColor(Color.BLUE);
                        id[count]="c2";
                        count++;
                        var--;
                    } else c2.setBackgroundColor(Color.TRANSPARENT);

                }
            });

            c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (c3.isChecked()&& var!=0) {
                        c3.setBackgroundColor(Color.BLUE);
                        id[count]="c3";
                        count++;
                        var--;
                    } else c3.setBackgroundColor(Color.TRANSPARENT);

                }
            });

            c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (c4.isChecked()&& var!=0) {
                        c4.setBackgroundColor(Color.BLUE);
                        id[count]="c4";
                        count++;
                        var--;
                    } else c4.setBackgroundColor(Color.TRANSPARENT);
                }
            });

            c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (c5.isChecked()&& var!=0) {
                        c5.setBackgroundColor(Color.BLUE);
                        id[count]="c5";
                        count++;
                        var--;
                    } else c5.setBackgroundColor(Color.TRANSPARENT);
                }
            });

            c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (c6.isChecked()&& var!=0) {
                        c6.setBackgroundColor(Color.BLUE);
                        id[count]="c6";
                        count++;
                        var--;
                    } else c6.setBackgroundColor(Color.TRANSPARENT);
                }
            });

        pro2= (Button) findViewById(R.id.pro2);
        pro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(seatbook.this,detail.class);
                //b.putIntArray("ids",ID);
                i2.putExtras(b);
                i2.putExtra("string-array",id);
                startActivity(i2);
            }
        });
    }
}
