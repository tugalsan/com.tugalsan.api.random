package com.tugalsan.api.random.client;

import com.tugalsan.api.shape.client.*;
import com.tugalsan.api.unsafe.client.*;
import java.util.*;

public class TGS_RandomUtils {

    public static String getUUIDType5(String seed) {
        return TGS_UnSafe.catchMeIfUCanReturns(TGS_RandomUtils.class.getSimpleName(), "getUUIDType5", "not implemented");
    }

    public native static String nextUUIDType4() /*-{
    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g,
            function(c) {
                var r = Math.random() * 16 | 0, v = c == 'x' ? r
                        : (r & 0x3 | 0x8);
                return v.toString(16);
            });
}-*/;

    public static final Random driver() {
        if (driver == null) {
            driver = new Random();
        }
        return driver;
    }
    private static Random driver;

    public static TGS_ShapeLocation<Integer> nextLoc(TGS_ShapeDimension<Integer> boundary) {
        return TGS_RandomDriverUtils.nextLoc(driver(), boundary);
    }

    public static TGS_ShapeLocation<Integer> nextLoc(TGS_ShapeRectangle<Integer> boundary) {
        return TGS_RandomDriverUtils.nextLoc(driver(), boundary);
    }

    public static TGS_ShapeRectangle<Integer> nextRect(TGS_ShapeDimension<Integer> boundary) {
        return TGS_RandomDriverUtils.nextRect(driver(), new TGS_ShapeRectangle(0, 0, boundary.width, boundary.height));
    }

    public static TGS_ShapeRectangle<Integer> nextRect(TGS_ShapeRectangle<Integer> boundaryRect) {
        return TGS_RandomDriverUtils.nextRect(driver(), new TGS_ShapeRectangle(0, 0, boundaryRect.width, boundaryRect.height));
    }

    public static float nextFloat(float min, float max) {
        return TGS_RandomDriverUtils.nextFloat(driver(), min, max);
    }

    public static boolean nextBoolean() {
        return TGS_RandomDriverUtils.nextBoolean(driver());
    }

    public static long nextLong(long min, long max) {
        return TGS_RandomDriverUtils.nextLong(driver(), min, max);
    }

    public static int nextInt(int min, int max) {
        return TGS_RandomDriverUtils.nextInt(driver(), min, max);
    }

    public static String nextString(int charSize, boolean numberChars, boolean smallChars, boolean bigChars, boolean alphaChars, CharSequence customChars) {
        return TGS_RandomDriverUtils.nextString(driver(), charSize, numberChars, smallChars, bigChars, alphaChars, customChars);
    }

    public static String nextString(int charSize, CharSequence alphabet) {
        return TGS_RandomDriverUtils.nextString(driver(), charSize, alphabet);
    }

    public static int[] nextIntArray(int size, int minValue, int maxValue) {
        return TGS_RandomDriverUtils.nextIntArray(driver(), size, minValue, maxValue);
    }
}
