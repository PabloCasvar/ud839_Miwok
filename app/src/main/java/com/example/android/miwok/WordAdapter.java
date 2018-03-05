package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anzen Digital on 22/02/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, ArrayList<Word> resource) {
        super(context, 0, resource);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Word word = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text_view);

        englishTextView.setText(word.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView.setText(word.getMiwokTranslation());

        ImageView miwokImageView = (ImageView) listItemView.findViewById(R.id.image_image_view);

        if( word.hasImage() ){
            miwokImageView.setImageResource(word.getImageResourcesID());
        } else {
            miwokImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
