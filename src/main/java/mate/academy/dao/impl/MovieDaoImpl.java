package mate.academy.dao.impl;

import java.util.List;
import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;

@Dao
public class MovieDaoImpl extends AbstractDao implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        return super.create(movie);
    }

    @Override
    public Optional<Movie> get(Long id) {
        return super.get(Movie.class, id);
    }

    @Override
    public List<Movie> getAll() {
        return super.getAll(Movie.class, "Movie");
    }
}
