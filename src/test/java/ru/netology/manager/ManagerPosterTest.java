package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.ToSeeMovie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerPosterTest {
    ManagerPoster manager = new ManagerPoster();

    @Test
    public void addMovie() {
        ToSeeMovie one = new ToSeeMovie("Фильм 1");
        ToSeeMovie too = new ToSeeMovie("Фильм 2");
        ToSeeMovie three = new ToSeeMovie("Фильм 3");

        manager.add(one);
        manager.add(too);
        manager.add(three);

        assertArrayEquals(manager.getManagerPoster(), new ToSeeMovie[]{one, too, three});
    }

    @Test
    public void listOfMovies() {

        ToSeeMovie one = new ToSeeMovie("Фильм 1");
        ToSeeMovie two = new ToSeeMovie("Фильм 2");
        ToSeeMovie three = new ToSeeMovie("Фильм 3");

        manager.add(one);
        manager.add(two);
        manager.add(three);

        assertArrayEquals(new ToSeeMovie[]{three, two, one}, manager.catalogMovies(3));
    }

    @Test
    public void lastTenMovies() {
        ToSeeMovie one = new ToSeeMovie("Фильм 1");
        ToSeeMovie two = new ToSeeMovie("Фильм 2");
        ToSeeMovie three = new ToSeeMovie("Фильм 3");
        ToSeeMovie four = new ToSeeMovie("Фильм 4");
        ToSeeMovie five = new ToSeeMovie("Фильм 5");
        ToSeeMovie six = new ToSeeMovie("Фильм 6");
        ToSeeMovie seven = new ToSeeMovie("Фильм 7");
        ToSeeMovie eight = new ToSeeMovie("Фильм 8");
        ToSeeMovie nine = new ToSeeMovie("Фильм 9");
        ToSeeMovie ten = new ToSeeMovie("Фильм 10");

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        assertArrayEquals(new ToSeeMovie[]{ten, nine, eight, seven, six, five, four, three, two, one}, manager.catalogMovies(10));
    }

    @Test
    public void listOfMoviesMoreTen() {
        ToSeeMovie one = new ToSeeMovie("Фильм 1");
        ToSeeMovie two = new ToSeeMovie("Фильм 2");
        ToSeeMovie three = new ToSeeMovie("Фильм 3");
        ToSeeMovie four = new ToSeeMovie("Фильм 4");
        ToSeeMovie five = new ToSeeMovie("Фильм 5");
        ToSeeMovie six = new ToSeeMovie("Фильм 6");
        ToSeeMovie seven = new ToSeeMovie("Фильм 7");
        ToSeeMovie eight = new ToSeeMovie("Фильм 8");
        ToSeeMovie nine = new ToSeeMovie("Фильм 9");
        ToSeeMovie ten = new ToSeeMovie("Фильм 10");
        ToSeeMovie eleven = new ToSeeMovie("Фильм 11");
        ToSeeMovie twelve = new ToSeeMovie("Фильм 12");

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        manager.add(twelve);

        assertArrayEquals(new ToSeeMovie[]{twelve, eleven, ten, nine, eight, seven, six, five, four, three}, manager.catalogMovies(12));
    }

    @Test
    public void listOfFilmFrom5() {
        ManagerPoster manager = new ManagerPoster(5);
        ToSeeMovie one = new ToSeeMovie("Фильм 1");
        ToSeeMovie two = new ToSeeMovie("Фильм 2");
        ToSeeMovie three = new ToSeeMovie("Фильм 3");
        ToSeeMovie four = new ToSeeMovie("Фильм 4");
        ToSeeMovie five = new ToSeeMovie("Фильм 5");
        ToSeeMovie six = new ToSeeMovie("Фильм 6");
        ToSeeMovie seven = new ToSeeMovie("Фильм 7");
        ToSeeMovie eight = new ToSeeMovie("Фильм 8");
        ToSeeMovie nine = new ToSeeMovie("Фильм 9");
        ToSeeMovie ten = new ToSeeMovie("Фильм 10");

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        assertArrayEquals(new ToSeeMovie[]{ten, nine, eight, seven, six}, manager.catalogMovies(5));
    }

}