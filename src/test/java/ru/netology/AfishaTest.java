package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {
    @Test

    public void test() {
        Afisha afisha = new Afisha();
        afisha.addFilm("Film 1");
        afisha.addFilm("Film 2");
        afisha.addFilm("Film 3");
        afisha.addFilm("Film 4");
        afisha.addFilm("Film 5");
        afisha.addFilm("Film 6");
        afisha.addFilm("Film 7");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7"};
        String[] actual = afisha.findAll();
    }

    @Test

    public void test1() {
        Afisha afisha = new Afisha();
        afisha.addFilm("Film 1");
        afisha.addFilm("Film 2");

        afisha.addFilm("Film 4");
        afisha.addFilm("Film 5");
        afisha.addFilm("Film 6");
        afisha.addFilm("Film 7");


        String[] expected = {"Film 1", "Film 2", "Film 4", "Film 5", "Film 6", "Film 7"};
        String[] actual = afisha.findAll();
    }
    @Test

    public void test2() {
        Afisha afisha = new Afisha();
        afisha.addFilm("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = afisha.findAll();
    }



    @Test

    public void FindLast() {
        Afisha afisha = new Afisha();
        afisha.addFilm("Film 8");


        String[] expected = {"Film 8"};
        String[] actual = afisha.findLast();
    }

    @Test

    public void testLast() {
        Afisha afisha = new Afisha();
        afisha.addFilm("Film 1");
        afisha.addFilm("Film 2");
        afisha.addFilm("Film 3");
        afisha.addFilm("Film 4");
        afisha.addFilm("Film 5");
        afisha.addFilm("Film 6");
        afisha.addFilm("Film 7");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7"};
        String[] actual = afisha.findLast();
    }

    @Test

    public void testLast1() {
        Afisha afisha = new Afisha();

        afisha.addFilm("Film 7");


        String[] expected = {"Film 7"};
        String[] actual = afisha.findLast();
    }
}

