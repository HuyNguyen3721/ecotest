package com.lam2000.base_module.view.smoothBottombar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/lam2000/base_module/view/smoothBottombar/BottomBarParser;", "", "context", "Landroid/content/Context;", "res", "", "(Landroid/content/Context;I)V", "parser", "Landroid/content/res/XmlResourceParser;", "getTabConfig", "Lcom/lam2000/base_module/view/smoothBottombar/BottomBarItem;", "parse", "", "Companion", "base-module_debug"})
public final class BottomBarParser {
    private final android.content.Context context = null;
    private final android.content.res.XmlResourceParser parser = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.smoothBottombar.BottomBarParser.Companion Companion = null;
    private static final java.lang.String ITEM_TAG = "item";
    private static final java.lang.String ICON_ATTRIBUTE = "icon";
    private static final java.lang.String TITLE_ATTRIBUTE = "title";
    
    public BottomBarParser(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.XmlRes()
    int res) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.lam2000.base_module.view.smoothBottombar.BottomBarItem> parse() {
        return null;
    }
    
    private final com.lam2000.base_module.view.smoothBottombar.BottomBarItem getTabConfig(android.content.res.XmlResourceParser parser) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/lam2000/base_module/view/smoothBottombar/BottomBarParser$Companion;", "", "()V", "ICON_ATTRIBUTE", "", "ITEM_TAG", "TITLE_ATTRIBUTE", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}