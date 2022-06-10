package Generyki.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library <T> {

    private List<T> mediaList;

    public Library(List<T> mediaList) {
        this.mediaList = mediaList;
    }

    public List<T> getMediaList() {
        return mediaList;
    }

    public void returnMediaToLibrary(T media) {
        mediaList.add(media);
    }

    public void borrowMediaToLibrary(T media) {
        mediaList.remove(media);
    }

    @Override
    public String toString() {
        return "Library{" +
                "mediaList=" + mediaList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library<?> library = (Library<?>) o;
        return Objects.equals(mediaList, library.mediaList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaList);
    }
}
