package com.example.effetivejavachapter6.item46;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ToMapOtherExample {


    @Getter
    @RequiredArgsConstructor
    static class Artist{
        private final String name;

    }

    @Getter
    @RequiredArgsConstructor
    static class Album {
        private final String name;
        private final Artist artist;
        private final int sales;
    }

    public static void main(String[] args) {
        Artist artist = new Artist("Artist1");
        Album albumA = new Album("album-a", artist, 1000);
        Album albumB = new Album("album-b", artist, 5000);
        Album albumC = new Album("album-c", artist, 2000);

        List<Album> albums = List.of(albumA, albumB, albumC);
        Map<Artist, Integer> result = albums.stream().collect(toMap(Album::getArtist, Album::getSales, Math::max));
        result.forEach((art, sales) -> System.out.printf("artist : %s / sales : %d", art.getName(), sales));

        // 원소 1개짜리 GroupingBy
        Map<Artist, List<Album>> collect = albums.stream().collect(groupingBy(Album::getArtist));

        // 원소 2개짜리 GroupingBy
        Map<Artist, Long> collect1 = albums.stream().collect(groupingBy(Album::getArtist, counting()));


    }
}
