//package br.com.alura.poo.specifications;
//
//import br.com.alura.poo.calculation.TimeCalculator;
//import br.com.alura.poo.models.Movies;
//import br.com.alura.poo.models.Series;
//import br.com.alura.poo.models.Episiodes;
//
//public class ShowSpecifications {
//  private TimeCalculator timeCalc;
//
//  public ShowSpecifications(TimeCalculator timeCalc) {
//    this.timeCalc = timeCalc;
//  }
//
//  public void showMoviesSpecifications(Movies movie) {
//    System.out.printf("%n%s%n", movie.getName());
//    System.out.printf("Release date: %s%n", movie.getReleaseDate());
//    System.out.println(movie.setIncluded(movie.getIncluded()));
//    System.out.printf("Average rating: %.2f (%s rates) %n", movie.returnMedia(), movie.getUsersRating());
//    System.out.printf("Duration: %s minutes %n", movie.getDuration());
//    System.out.printf("Total marathon time: %s minutes %n", timeCalc.getTotalTimeMovies());
//    System.out.printf("Total stars: %s %n", movie.calculateStars(movie.returnMedia()));
//  }
//
//  public void showSeriesSpecification(Series series) {
//    System.out.printf("%n%s%n", series.getName());
//    System.out.printf("Release date: %s%n", series.getReleaseDate());
//    System.out.println(series.setIncluded(series.getIncluded()));
//    System.out.printf("Average rating: %.2f (%s rates) %n", series.returnMedia(), series.getUsersRating());
//    System.out.printf("Seasons: %s %n", series.getSeasons());
//    System.out.printf("Episodes per season: %s %n", series.getEpisodesPerSeason());
//    System.out.printf("On air: %s %n", series.getOnAir());
//    System.out.printf("Total marathon time: %s minutes %n", timeCalc.getTotalTimeSeries());
//    System.out.printf("Total stars: %s %n", series.calculateStars(series.returnMedia()));
//  }
//
//  public void showEpisiodesSpecification(Episiodes episiodes) {
//    System.out.printf("%n%s%n", episiodes.getSeries());
//    System.out.printf("%s%n", episiodes.getName());
//    System.out.printf("Number: %s %n", episiodes.getNumber());
//    System.out.printf("Duration: %s minutes %n", episiodes.getDuration());
//    System.out.printf("Season: %s %n", episiodes.getSeason());
//    System.out.printf("Total stars: %s %n", episiodes.calculateStars(episiodes.getUsersMedia()));
//  }
//}
