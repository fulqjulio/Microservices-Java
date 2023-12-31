import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductsService {

    private static Retrofit retrofit;
    private static final String BASE_URL = "http://localhost:8080";

    public static ProductServiceInterface getInterface() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ProductServiceInterface.class);
    }
}