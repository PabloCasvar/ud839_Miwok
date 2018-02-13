/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        TextView colorsTextView = (TextView) findViewById(R.id.colors);
        TextView familyTextView = (TextView) findViewById(R.id.family);
        TextView numbersTextView = (TextView) findViewById(R.id.numbers);
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);

        colorsTextView.setOnClickListener(new ClickListener());
        familyTextView.setOnClickListener(new ClickListener());
        numbersTextView.setOnClickListener(new ClickListener());
        phrasesTextView.setOnClickListener(new ClickListener());

    }

    //Class that handles the clicks events
    private class ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.colors:
                    colorsTextViewClicked();
                    break;
                case R.id.family:
                    familyTextViewClicked();
                    break;
                case R.id.numbers:
                    numbersTextViewClicked();
                    break;
                case R.id.phrases:
                    phrasesTextViewClicked();
            }
        }
    }

    private void colorsTextViewClicked(){
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    private void familyTextViewClicked(){
        Intent i = new Intent(this, FamiliyActivity.class);
        startActivity(i);
    }

    private void numbersTextViewClicked(){
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    private void phrasesTextViewClicked(){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
}
