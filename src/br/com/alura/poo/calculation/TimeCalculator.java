package br.com.alura.poo.calculation;

public class TimeCalculator {
  private int totalTimeMovies;
  private int totalTimeSeries;

  // Methods

  public void addMovieTime(int movieDuration) {
    totalTimeMovies += movieDuration;
  }

  public void addSeriesTime(int seriesDuration) {
    totalTimeSeries += seriesDuration;
  }

  // Getters
  public int getTotalTime() {
    return totalTimeMovies + totalTimeSeries;
  }

  public int getTotalTimeMovies() {
    return totalTimeMovies;
  }

  public int getTotalTimeSeries() {
    return totalTimeSeries;
  }
}
