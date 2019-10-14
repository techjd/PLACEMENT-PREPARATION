package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class secureeye extends AppCompatActivity {

    PDFView pdfView;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secureeye);

        pdfView = findViewById(R.id.wv13);
        progressBar = findViewById(R.id.pb13);
        new RetrievePDFStream().execute("https://firebasestorage.googleapis.com/v0/b/placement-preparation.appspot.com/o/secureeyes.pdf?alt=media&token=2ec478b9-e331-4ac2-97fc-5c3d10f433f4");
    }
    class RetrievePDFStream extends AsyncTask<String, Void, InputStream> implements OnLoadCompleteListener {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try {
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                if (urlConnection.getResponseCode() == 200) {
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }
            } catch (IOException e) {
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).swipeHorizontal(false).onLoad(this).load();
        }

        @Override
        public void loadComplete(int nbPages) {
            progressBar.setVisibility(View.GONE);
        }
    }
}

