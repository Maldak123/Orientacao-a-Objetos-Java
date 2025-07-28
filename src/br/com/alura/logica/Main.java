//package br.com.alura.logica;
//
//import br.com.alura.poo.models.Movies;
//// import br.com.alura.poo.models.Episiodes;
//import br.com.alura.poo.models.Series;
//import br.com.alura.poo.models.Title;
//// import br.com.alura.poo.specifications.ShowSpecifications;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//// import br.com.alura.poo.calculation.TimeCalculator;
//
//public class Main {
//    public static void main(String[] args) {
//        // TimeCalculator timeCalc = new TimeCalculator();
//        // ShowSpecifications showSpec = new ShowSpecifications(timeCalc);
//
//        Series mySeries = new Series("Invincible", 2021 , 3, 8, true);
//
//        // timeCalc.addSeriesTime(mySeries.getTitleDurationInMinutes());
//
//        Series otherSeries = new Series("The Boys", 2019 , 4, 7, false);
//
//        // timeCalc.addSeriesTime(otherSeries.getTitleDurationInMinutes());
//
//        // Episiodes myEpisiodes = new Episiodes(mySeries, 1, "Any name", 45, 1);
//
//        Movies myMovie = new Movies("Flow", 2024, "IDK", 120);
//
//        var titlesList = new ArrayList<Title>();
//        titlesList.add(mySeries);
//        mySeries.rate(7.5);
//        titlesList.add(otherSeries);
//        otherSeries.rate(9);
//        titlesList.add(myMovie);
//        myMovie.rate(8.5);
//
//        titlesList.forEach(title -> {
//            System.out.println(title);
//
//            if (title instanceof Series) {
//                Series series = (Series) title;
//                System.out.println(series.calculateStars(series.returnMedia()));
//            } else {
//                Movies movie = (Movies) title;
//                System.out.println(movie.calculateStars(movie.returnMedia()));
//            }
//        });
//
//        Collections.sort(titlesList);
//        System.out.printf("%n" + titlesList);
//
//        titlesList.sort(Comparator.comparing(Title::getReleaseDate));
//        System.out.printf("%n" + titlesList + "%n");
//    }
//}
