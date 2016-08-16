package com.ivan.materialanimatedswitchlibrary.painter;


import android.graphics.Canvas;

public interface Painter<T extends Enum> {

    void draw(Canvas canvas);

    void setColor(int color);

    int getColor();

    void onSizeChanged(int height, int width);

    void setState(T state);
}
