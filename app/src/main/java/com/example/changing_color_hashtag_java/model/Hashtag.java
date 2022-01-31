package com.example.changing_color_hashtag_java.model;

import android.content.Context;
import android.graphics.Color;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Hashtag extends ClickableSpan {
    Context context;

    public Hashtag(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setColor(Color.BLUE);
        ds.setARGB(255, 30, 144, 255);
    }

    @Override
    public void onClick(View view) {
        TextView tv = (TextView) view;
        Spanned s = (Spanned) tv.getText();
        int start = s.getSpanStart(this);
        int end = s.getSpanEnd(this);
        String hashtag = s.subSequence(start + 1, end).toString();
        Toast.makeText(context, String.format("Tag : %s", hashtag), Toast.LENGTH_SHORT).show();

    }

}
