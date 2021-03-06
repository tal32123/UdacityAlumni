package com.google.developer.udacityalumni.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;


/**
 * Created by Dell on 1/15/2017.
 */

public class AnimationUtils {

        public static void scaleXY(RecyclerView.ViewHolder holder) {
            holder.itemView.setScaleX(0);
            holder.itemView.setScaleY(0);

            PropertyValuesHolder propx = PropertyValuesHolder.ofFloat("scaleX", 1);
            PropertyValuesHolder propy = PropertyValuesHolder.ofFloat("scaleY", 1);

            ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(holder.itemView, propx, propy);


            animator.setDuration(800);
            animator.start();
        }




}


