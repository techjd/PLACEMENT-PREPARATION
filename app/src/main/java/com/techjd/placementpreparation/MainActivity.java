package com.techjd.placementpreparation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageView img1 = (ImageView) findViewById(R.id.img1);
        ImageView img2 = (ImageView) findViewById(R.id.img2);
        ImageView img3 = (ImageView) findViewById(R.id.img3);
        ImageView img4 = (ImageView) findViewById(R.id.img4);
        ImageView img5 = (ImageView) findViewById(R.id.img5);
        ImageView img6 = (ImageView) findViewById(R.id.img6);
        ImageView img7 = (ImageView) findViewById(R.id.img7);
        ImageView img8 = (ImageView) findViewById(R.id.img8);
        ImageView img9 = (ImageView) findViewById(R.id.img9);
        ImageView img10 = (ImageView) findViewById(R.id.img10);
        ImageView img11 = (ImageView) findViewById(R.id.img11);
        ImageView img12 = (ImageView) findViewById(R.id.img12);
        ImageView img13 = (ImageView) findViewById(R.id.img13);
        ImageView img14 = (ImageView) findViewById(R.id.img14);
        ImageView img15 = (ImageView) findViewById(R.id.img15);
        ImageView img16 = (ImageView) findViewById(R.id.img16);
        ImageView img17 = (ImageView) findViewById(R.id.img17);
        ImageView img18 = (ImageView) findViewById(R.id.img18);
        ImageView img19 = (ImageView) findViewById(R.id.img19);
        ImageView img20 = (ImageView) findViewById(R.id.img20);
        ImageView img21 = (ImageView) findViewById(R.id.img21);
        ImageView img22 = (ImageView) findViewById(R.id.img22);
        ImageView img23 = (ImageView) findViewById(R.id.img23);
        ImageView img24 = (ImageView) findViewById(R.id.img24);
        ImageView img25 = (ImageView) findViewById(R.id.img25);
        ImageView img26 = (ImageView) findViewById(R.id.img26);


        String[] urls = {
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Finfosys.jpg?alt=media&token=76e45cf7-0a1a-4a7f-99ce-3760a658cf8b",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Ftcs.png?alt=media&token=5488fce2-7080-45d5-869e-b5d06f7598d9",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fwipro.png?alt=media&token=cc07617f-5b71-4338-8ce7-9d1f990a87fc",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fion.png?alt=media&token=a0ff42d3-266d-4ad9-b3c4-de97fa3c05b3",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fibm.png?alt=media&token=801c19d8-b162-4ba3-a17c-dc61b416a6d1",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Flt.png?alt=media&token=99b0ae51-e2a0-4b12-9aaf-d36be6a9b4ba",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fmindtree.png?alt=media&token=55cfbdab-aba5-41a8-8e38-7400fc4ee4bf",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fhuwaei.jpg?alt=media&token=d57ddc67-7801-4353-a95d-1348a355f778",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fbosch.png?alt=media&token=fa24beb4-f1dd-4549-ad96-bb5cfc8797aa",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fcocubes.jpg?alt=media&token=246856af-f440-435c-b5f7-465661c87e8c",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Faccenture2.png?alt=media&token=92c21e65-05b9-4747-a7ed-371ea7c51613",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Famcat.png?alt=media&token=05b4b30e-ee7e-44fb-8195-7b536670c2ab",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fsecure.jpg?alt=media&token=e97b83ba-fc27-45b7-b9e2-966ad57032a7",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fcapg.jpg?alt=media&token=ff14c713-f422-435f-8182-45fa72b2bc67",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Funisys.png?alt=media&token=54250959-f778-430a-913a-61e4070ab913",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Flg.png?alt=media&token=08b88f64-891d-48df-a5d0-3a26eb86c016",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Ftek.png?alt=media&token=0a2a466f-d13b-4a32-932d-5d4966a08fe6",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fcognizant.png?alt=media&token=200a30b8-fe70-4047-82fa-7e75a99313fd",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Flumen.png?alt=media&token=5552034a-bb6e-4c4f-bab5-fe5b13c81ec9",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fmphasis.jpg?alt=media&token=3696495f-45a2-4df3-85e0-3fa999396b6f",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Faudi.png?alt=media&token=85c508f8-2dd1-4251-9ca4-2a9af92a35fa",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fzenq.png?alt=media&token=1801b4a4-c509-44b8-a2e1-534ebd0605be",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fcode.png?alt=media&token=77485059-37a8-469a-8594-beb14a6c1d7c",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Flogic.png?alt=media&token=e41b71c1-29ea-4907-a726-307cb66739f0",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fgrammar.png?alt=media&token=db01bd18-2e7a-4dc0-be0e-7c8655cb51d5",
                "https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/Logos%2Fcoding_interview.jpg?alt=media&token=9606b2f9-3e8e-4463-9502-2cc9c4f72552",};

        Glide.with(this).load(urls[0]).into(img1);
        Glide.with(this).load(urls[1]).into(img2);
        Glide.with(this).load(urls[2]).into(img3);
        Glide.with(this).load(urls[3]).into(img4);
        Glide.with(this).load(urls[4]).into(img5);
        Glide.with(this).load(urls[5]).into(img6);
        Glide.with(this).load(urls[6]).into(img7);
        Glide.with(this).load(urls[7]).into(img8);
        Glide.with(this).load(urls[8]).into(img9);
        Glide.with(this).load(urls[9]).into(img10);
        Glide.with(this).load(urls[10]).into(img11);
        Glide.with(this).load(urls[11]).into(img12);
        Glide.with(this).load(urls[12]).into(img13);
        Glide.with(this).load(urls[13]).into(img14);
        Glide.with(this).load(urls[14]).into(img15);
        Glide.with(this).load(urls[15]).into(img16);
        Glide.with(this).load(urls[16]).into(img17);
        Glide.with(this).load(urls[17]).into(img18);
        Glide.with(this).load(urls[18]).into(img19);
        Glide.with(this).load(urls[19]).into(img20);
        Glide.with(this).load(urls[20]).into(img21);
        Glide.with(this).load(urls[21]).into(img22);
        Glide.with(this).load(urls[22]).into(img23);
        Glide.with(this).load(urls[23]).into(img24);
        Glide.with(this).load(urls[24]).into(img25);
        Glide.with(this).load(urls[25]).into(img26);




        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this,infosys.class);
                startActivity(i1);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 =  new Intent(MainActivity.this,tcs.class);
                startActivity(i2);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(MainActivity.this,wipro.class);
                startActivity(i3);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(MainActivity.this,ion.class);
                startActivity(i4);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(MainActivity.this,ibm.class);
                startActivity(i5);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(MainActivity.this,lt.class);
                startActivity(i6);
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(MainActivity.this,mindtree.class);
                startActivity(i7);
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(MainActivity.this,huawei.class);
                startActivity(i8);
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9 = new Intent(MainActivity.this,bosch.class);
                startActivity(i9);
            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i10 = new Intent(MainActivity.this,cocubes.class);
                startActivity(i10);
            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11 = new Intent(MainActivity.this,accenture.class);
                startActivity(i11);
            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(MainActivity.this,amcat.class);
                startActivity(i12);
            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i13 = new Intent(MainActivity.this,secureeye.class);
                startActivity(i13);
            }
        });

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i14 = new Intent(MainActivity.this,capgemini.class);
                startActivity(i14);
            }
        });

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i15 = new Intent(MainActivity.this,unisys.class);
                startActivity(i15);
            }
        });

        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i16 = new Intent(MainActivity.this,lg.class);
                startActivity(i16);
            }
        });

        img17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i17 = new Intent(MainActivity.this,tek.class);
                startActivity(i17);
            }
        });

        img18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i18 = new Intent(MainActivity.this,cognizant.class);
                startActivity(i18);
            }
        });

        img19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i19 = new Intent(MainActivity.this,lumen.class);
                startActivity(i19);
            }
        });

        img20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i20 = new Intent(MainActivity.this,mphasis.class);
                startActivity(i20);
            }
        });

        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i21 = new Intent(MainActivity.this,audi.class);
                startActivity(i21);
            }
        });

        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i22 = new Intent(MainActivity.this,zenq.class);
                startActivity(i22);
            }
        });

        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i23 = new Intent(MainActivity.this,code.class);
                startActivity(i23);
            }
        });

        img24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i24 = new Intent(MainActivity.this,logical.class);
                startActivity(i24);
            }
        });

        img25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i25 = new Intent(MainActivity.this,grammar.class);
                startActivity(i25);
            }
        });

        img26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i26 = new Intent(MainActivity.this,book.class);
                startActivity(i26);
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        switch (item.getItemId()) {


            case R.id.menu1:
                Intent intent1 = new Intent(android.content.Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://techjd1.000webhostapp.com/privacy_policy.html"));
                this.startActivity(intent1);
                break;
            case R.id.menu2:
                Intent intent2 = new Intent(android.content.Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Jaydeepsinh+Parmar"));
                this.startActivity(intent2);
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }
}
