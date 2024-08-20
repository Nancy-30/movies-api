package nancy;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.*;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    private List<Review> reviewIds;
}
