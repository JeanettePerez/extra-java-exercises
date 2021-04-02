package streams;


import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
// ========== sorting streams =========
//            List<Movie> movies = List.of(
//            new Movie("b", 10),
//            new Movie("a",20),
//            new Movie("c",30)
//    );
//    movies.stream()
//            .sorted(Comparator.comparing(Movie::getTitle).reversed()) // to return in descending order with .reverse()
//            .forEach(m -> System.out.println(m.getTitle()));

// ========= getting unique Elements =========
//        List<Movie> movies = List.of(
//                new Movie("b", 10),
//                new Movie("b", 10),
//                new Movie("a",20),
//                new Movie("c",30)
//        );
//// TODO: if the likes were the price of a movie and you don't want to print something twice
//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach(System.out::println);
// ========= Peeking Elements =========
        // useful for trouble shooting problems
//        List<Movie> movies = List.of(
//            new Movie("a", 10),
//            new Movie("b",20),
//            new Movie("c",30)
//    );
//     movies.stream()
//             .filter(m -> m.getLikes() > 10)
//             .peek(m -> System.out.println("filtered: " + m.getTitle()))
//             .map(Movie::getTitle)
//             .peek(t -> System.out.println("Mapped: " + t))
//             .forEach(System.out::println);
// ========= Reducers =========
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b",20),
                new Movie("c",30)
        );
// if you want to add all the likes
//        Optional<Integer> sum = movies.stream()
//                .map(Movie::getLikes)
//                .reduce(Integer::sum); // sum is a method in Integer class
//        // .reduce((a,b) -> a+b) the accumulator
//        System.out.println(sum.orElse(0));
        Integer sum = movies.stream()
                .map(Movie::getLikes)
                .reduce(0, Integer::sum); // sum is a method in Integer class
        // .reduce((a,b) -> a+b) the accumulator
        System.out.println(sum);
        // reduce we can preform general purpose reduction
    }

    public static void main(String[] args) {
        streamDemo();
    }
}
