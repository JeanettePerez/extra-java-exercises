package streams;


import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void streamDemo(){
//  ========= Streams ========
//        List<Movie> movies = List.of(
//                new Movie("a",10),
//                new Movie("b",15),
//                new Movie("c",20)
//        );
//        // imperative programming: statements that specify how something should be done
//        int count = 0;
//        for(var movie : movies)
//            if(movie.getLikes() > 10)
//                count++; // count number of movies with more than 10 likes
        // Declarative(functional programming)
//        var count2 = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)// applied to every movie in the collection but applied only to those who satisfy will be pulled out of the collection
//                .count(); // count number of movies that come out of the stream
// ========= Mapping Elements =========
//        List<Movie> movies = List.of(
//                new Movie("a",10),
//                new Movie("b",15),
//                new Movie("c",20)
//        );
//// TODO: get name of movies with map()
//        movies.stream()
//                .map(Movie::getTitle)
//                .forEach(System.out::println);
// === flatMap()
//    var stream = Stream.of(List.of(1,2,3), List.of(4,5,6));
//    stream
//            .flatMap(list -> list.stream()) // takes list of intergers and returns a stream
//            .forEach(n -> System.out.println(n));
//    // if you want to wok with individual number you use flatmap

// ========== Filtering Elements =========
//        List<Movie> movies = List.of(
//                new Movie("a",10),
//                new Movie("b",15),
//                new Movie("c",20)
//        );
//
//        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
//        movies.stream()
//                .filter(isPopular)
//                .forEach(m -> System.out.println(m.getTitle()));

// ========= Slicing a Stream =========
//    List<Movie> movies = List.of(
//            new Movie("a", 10),
//            new Movie("b",20),
//            new Movie("c",30)
//    );
//
//    // TODO: hypothetically we have 1000 movies and we want to display 10 movies per page. we are only interested in the 3rd page
//    movies.stream()
//            .skip(20)
//            .limit(10)
//            .forEach(m -> System.out.println(m.getTitle()));



    }

    public static void main(String[] args) {
        streamDemo();
    }
}