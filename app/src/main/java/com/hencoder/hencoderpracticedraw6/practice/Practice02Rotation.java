package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    public static final String TAG = "ez";
    Button animateBt;
    ImageView imageView;
    int count=1;
    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "aaaaaa: --->"+count);
                // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转
                switch (count) {
                    case 1:
                        imageView.setRotation(180);
                        break;
                    case 2:
                        imageView.setRotation(0);
                        break;
                    case 3:
                        imageView.animate().rotationX(180);
                        break;
                    case 4:
                        imageView.animate().rotationX(0);
                        break;
                    case 5:
                        imageView.setRotationY(180);
                        break;
                    case 6:
                        imageView.setRotationY(0);
                        break;
                }
                count++;
                Log.d(TAG, "bbbbbb: --->"+count);
                if (count == 7) {
                    count=1;
                }
            }
        });
    }
}