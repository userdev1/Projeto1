package lustoza.learning1.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bloder on 05/02/18.
 */

public class RestaurantsApi {

    public static List<Restaurant> getRestaurants() {
        return new ArrayList<Restaurant>() {{
            add(new Restaurant("Mc Donalds", "https://pbs.twimg.com/profile_images/658746945565954048/Zrf2h3RD_400x400.jpg"));
            add(new Restaurant("Burger King", "https://pbs.twimg.com/profile_images/936003791312191488/gcvNpwi2_400x400.jpg"));
            add(new Restaurant("KFC", "https://res-4.cloudinary.com/scentre-group-au/image/fetch/c_pad,f_auto,q_auto/http://res.cloudinary.com/scentre-group-au/image/upload/lbreotwgorjtfcqgrrop.png"));
            add(new Restaurant("Pizza Hut", "https://vignette.wikia.nocookie.net/logopedia/images/6/63/Pizza_Hut_2012_logo.png/revision/latest?cb=20140507122847"));
            add(new Restaurant("Habib's", "http://3.bp.blogspot.com/-NJw9aMf4pbA/U83NJelGXkI/AAAAAAABS6I/cQH7TjJ8B80/s1600/habibs+logo.jpg"));
            add(new Restaurant("Madero", "https://www.soumeier.com.br/wp-content/uploads/2017/11/madero-norteshopping-restaurante-logo-1132x670.jpg"));
        }};
    }
}
