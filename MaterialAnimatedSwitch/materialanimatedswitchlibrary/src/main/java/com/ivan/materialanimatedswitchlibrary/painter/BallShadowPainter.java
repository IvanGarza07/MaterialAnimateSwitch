package com.ivan.materialanimatedswitchlibrary.painter;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;

import com.ivan.materialanimatedswitchlibrary.observer.BallFinishObservable;
import com.ivan.materialanimatedswitchlibrary.observer.BallMoveObservable;

public class BallShadowPainter extends BallPainter {

    public BallShadowPainter(int bgColor, int toBgColor, int padding, int shadowColor,
                             BallFinishObservable ballFinishObservable, BallMoveObservable ballMoveObservable,
                             Context context) {
        super(bgColor, toBgColor, padding, ballFinishObservable, ballMoveObservable, context);
        paint.setColor(shadowColor);
        paint.setMaskFilter(new BlurMaskFilter(3, BlurMaskFilter.Blur.NORMAL));
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(ballPositionX, (height / 2) + 2, radius, paint);
    }
}
