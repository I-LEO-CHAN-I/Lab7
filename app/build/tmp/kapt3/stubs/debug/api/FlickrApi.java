package api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\bH\'\u00a8\u0006\u000b"}, d2 = {"Lapi/FlickrApi;", "", "fetchPhotos", "Lretrofit2/Call;", "Lapi/FlickrResponse;", "fetchUrlBytes", "Lokhttp3/ResponseBody;", "url", "", "searchPhotos", "query", "app_debug"})
public abstract interface FlickrApi {
    
    @retrofit2.http.GET(value = "services/rest?method=flickr.interestingness.getList")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<api.FlickrResponse> fetchPhotos();
    
    @retrofit2.http.GET
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<okhttp3.ResponseBody> fetchUrlBytes(@retrofit2.http.Url
    @org.jetbrains.annotations.NotNull
    java.lang.String url);
    
    @retrofit2.http.GET(value = "services/rest?method=flickr.photos.search")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<api.FlickrResponse> searchPhotos(@retrofit2.http.Query(value = "text")
    @org.jetbrains.annotations.NotNull
    java.lang.String query);
}