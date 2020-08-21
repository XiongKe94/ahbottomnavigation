package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;

/**
 * AHBottomNavigationItem
 * The item is display in the AHBottomNavigation layout
 */
public class AHBottomNavigationItem {
    private String title = "";
    private Drawable drawable;
    @ColorInt
    private int color = Color.GRAY;

    public AHBottomNavigationItem(@NonNull String title, @Nullable Drawable drawable) {
        this.title = title;
        this.drawable = drawable;
    }

    public AHBottomNavigationItem(@NonNull String title, @Nullable Drawable drawable, @ColorInt int bgAnimColor) {
        this.title = title;
        this.drawable = drawable;
        this.color = bgAnimColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getColor() {
        return color;
    }

    public void setColor(@ColorInt int color) {
        this.color = color;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    @Nullable
    public Drawable getDrawable() {
        return drawable;
    }
}
