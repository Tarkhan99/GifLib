package com.tarkhan.giflib.data;

import com.tarkhan.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2020,3,1), "Tarkhan", true,1),
            new Gif("ben-and-mike", LocalDate.of(2020,2,5), "Vusal", true,2),
            new Gif("book-dominos", LocalDate.of(2020,2,10), "Rauf", false,2),
            new Gif("compiler-bot", LocalDate.of(2020,2,27), "Tarkhan", false,3),
            new Gif("cowboy-coder", LocalDate.of(2020,2,4), "Tarkhan", true,1),
            new Gif("infinite-andrew", LocalDate.of(2020,1,16), "Rauf", true,3)
    );

    public Gif findByName(String name) {

        for(Gif gif: ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id) {
        List<Gif> gifList = new ArrayList<>();
        for(Gif gif: ALL_GIFS) {
            if (gif.getCategoryId() == id) {
                gifList.add(gif);
            }
        }
        return gifList;
    }
}
