package ru.netology.manager;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.ToSeeMovie;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class ManagerPoster {
    private int max = 10;
    private ToSeeMovie[] managerPoster = new ToSeeMovie[0];

    public ManagerPoster(int max) {
        this.max = max;
    }

    public void add(ToSeeMovie movie) {
        ToSeeMovie[] tmp = new ToSeeMovie[managerPoster.length + 1];
        System.arraycopy(managerPoster, 0, tmp, 0, managerPoster.length);
        tmp[tmp.length - 1] = movie;
        managerPoster = tmp;
    }


    public ToSeeMovie[] catalogMovies(int max) {
        int numberLenght = 0;
        if (max < 10) {
            numberLenght = max;
        } else {
            numberLenght = 10;
        }
        ToSeeMovie[] number = new ToSeeMovie[numberLenght];
        ToSeeMovie[] movies = getManagerPoster();
        for (int i = 0; i < numberLenght; i++) {
            int a = movies.length - i - 1;
            number[i] = movies[a];
        }
        return number;
    }


}
