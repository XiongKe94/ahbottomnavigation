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

    @StringRes
    private int titleRes = 0;

    private Drawable drawable;
    @ColorInt
    private int color = Color.GRAY;

    /**
     * @param title    Title
     * @param drawable Drawable
     * @param color    Background color
     */
    public AHBottomNavigationItem(@NonNull String title, @Nullable Drawable drawable, @NonNull @ColorInt int color) {
        this.title = title;
        this.drawable = drawable;
        this.color = color;
    }

    public String getTitle(Context context) {
        if (titleRes != 0) {
            return context.getString(titleRes);
        }
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.titleRes = 0;
    }

    public void setTitle(@StringRes int titleRes) {
        this.titleRes = titleRes;
        this.title = "";
    }

    public int getColor(Context context) {
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
