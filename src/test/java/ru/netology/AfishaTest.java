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
        Assertions.assertArrayEquals(expected, actual);
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
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test2() {
        Afisha afisha = new Afisha();
        afisha.addFilm("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test3() {
        Afisha afisha = new Afisha();


        String[] expected = {};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test

    public void FindLast() {
        Afisha afisha = new Afisha();
        afisha.addFilm("Film 8");


        String[] expected = {"Film 8"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void FindLast10() {
        Afisha afisha = new Afisha();

        String[] expected = {};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
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


        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast12() {
        Afisha afisha = new Afisha(4);
        afisha.addFilm("Film 4");
        afisha.addFilm("Film 3");
        afisha.addFilm("Film 2");
        afisha.addFilm("Film 1");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast13() {
        Afisha afisha = new Afisha(12);
        afisha.addFilm("Film 12");
        afisha.addFilm("Film 11");
        afisha.addFilm("Film 10");
        afisha.addFilm("Film 9");
        afisha.addFilm("Film 8");
        afisha.addFilm("Film 7");
        afisha.addFilm("Film 6");
        afisha.addFilm("Film 5");
        afisha.addFilm("Film 4");
        afisha.addFilm("Film 3");
        afisha.addFilm("Film 2");
        afisha.addFilm("Film 1");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10", "Film 11", "Film 12"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast14() {
        Afisha afisha = new Afisha(10);

        afisha.addFilm("Film 10");
        afisha.addFilm("Film 9");
        afisha.addFilm("Film 8");
        afisha.addFilm("Film 7");
        afisha.addFilm("Film 6");
        afisha.addFilm("Film 5");
        afisha.addFilm("Film 4");
        afisha.addFilm("Film 3");
        afisha.addFilm("Film 2");
        afisha.addFilm("Film 1");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastNull() {
        Afisha afisha = new Afisha();


        String[] expected = {};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast1() {
        Afisha afisha = new Afisha();

        afisha.addFilm("Film 7");


        String[] expected = {"Film 7"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}

