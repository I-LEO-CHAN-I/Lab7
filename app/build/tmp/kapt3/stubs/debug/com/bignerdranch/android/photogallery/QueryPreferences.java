package com.bignerdranch.android.photogallery;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/bignerdranch/android/photogallery/QueryPreferences;", "", "()V", "getLastResultId", "", "context", "Landroid/content/Context;", "getStoredQuery", "isPolling", "", "setLastResultId", "", "lastResultId", "setPolling", "isOn", "setStoredQuery", "query", "app_debug"})
public final class QueryPreferences {
    @org.jetbrains.annotations.NotNull
    public static final com.bignerdranch.android.photogallery.QueryPreferences INSTANCE = null;
    
    private QueryPreferences() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStoredQuery(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final void setStoredQuery(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastResultId(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final void setLastResultId(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String lastResultId) {
    }
    
    public final boolean isPolling(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final void setPolling(@org.jetbrains.annotations.NotNull
    android.content.Context context, boolean isOn) {
    }
}