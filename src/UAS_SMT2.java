import java.util.Arrays;
public class UAS_SMT2 {
    public static void main(String[] args) {

        class Film {
            private String filmId;
            private String filmName;
            private int releaseYear;
            private double rating;

            public Film(String filmId, String filmName, int releaseYear, double rating) {
                this.filmId = filmId;
                this.filmName = filmName;
                this.releaseYear = releaseYear;
                this.rating = rating;
            }

            public String getFilmId() {
                return filmId;
            }

            public String getFilmName() {
                return filmName;
            }

            public int getReleaseYear() {
                return releaseYear;
            }

            public double getRating() {
                return rating;
            }

            @Override
            public String toString() {
                return "Film [filmId=" + filmId + ", filmName=" + filmName + ", releaseYear=" + releaseYear + ", rating=" + rating + "]";
            }
        }
        Film[] films = {
                new Film("tt0111161", "The Shawshank Redemption", 1994, 9.3),
                new Film("tt0068646", "The Godfather", 1972, 9.2),
                new Film("tt0071562", "The Godfather: Part II", 1974, 9.0),
                new Film("tt0468569", "The Dark Knight", 2008, 9.0),
                // Tambahkan film lainnya sesuai daftar ranking IMDB
        };

        System.out.println("Daftar Film Terlaris IMDB:");
        for (Film film : films) {
            System.out.println(film);
        }

        // Urutkan film berdasarkan rating menggunakan selection sort
        for (int i = 0; i < films.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < films.length; j++) {
                if (films[j].getRating() < films[minIndex].getRating()) {
                    minIndex = j;
                }
            }
            Film temp = films[minIndex];
            films[minIndex] = films[i];
            films[i] = temp;
        }

        System.out.println("\nDaftar Film Terlaris setelah diurutkan:");
        for (Film film : films) {
            System.out.println(film);
        }
    }
}