package com.android.launcher3.developerspace;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import com.android.launcher3.CellLayout;

public class MainLauncher extends Activity implements ILauncher,LhmDropTarget {

    private CellLayout mDropToLayout = null;


    @Override
    public Boolean finishAutoCancelActionMode() {
        return null;
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public LhmDragLayer getDragLayer() {
        return null;
    }

    @Override
    public LhmDragController getDragController() {
        return null;
    }

    @Override
    public View getRootView() {
        return null;
    }

    @Override
    public LhmDropTarget getDropTarget() {
        return null;
    }


    @Override
    public boolean isDropEnabled() {
        return false;
    }

    @Override
    public void onDrop(LhmDragObject dragObject) {

    }

    @Override
    public void onDragEnter(LhmDragObject dragObject) {


        mDropToLayout = null;
        mDragViewVisualCenter = d.getVisualCenter(mDragViewVisualCenter);
        setDropLayoutForDragObject(d, mDragViewVisualCenter[0], mDragViewVisualCenter[1]);
    }

    @Override
    public void onDragOver(LhmDragObject dragObject) {

    }

    @Override
    public void onDragExit(LhmDragObject dragObject) {

    }

    @Override
    public boolean acceptDrop(LhmDragObject dragObject) {
        return false;
    }

    @Override
    public void prepareAccessibilityDrop() {

    }

    @Override
    public void getHitRectRelativeToDragLayer(Rect outRect) {

    }
}
