package br.com.alura.poo.models;

import br.com.alura.poo.calculation.StarsCalculator;

public class Episiodes implements StarsCalculator {
  private int number;
  private String series;
  private String name;
  private double usersMedia;
  private int duration;
  private int season;

  // Constructor
  public Episiodes(Series series, int number, String name, int duration, int season) {
    this.series = series.getName();
    this.usersMedia = series.returnMedia();
    this.number = number;
    this.name = name;
    this.duration = duration;
    this.season = season;
  }

  // Getters

  public double getUsersMedia() {
    return usersMedia;
  }

  public int getNumber() {
    return number;
  }

  public String getSeries() {
    return series;
  }

  public String getName() {
    return name;
  }

  public int getDuration() {
    return duration;
  }

  public int getSeason() {
    return season;
  }

  // Setters
  public void setNumber(int number) {
    this.number = number;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public void setSeason(int season) {
    this.season = season;
  }

  // Methods
  @Override
  public int calculateStars(double rate) {
    return (int) rate / 2;
  }
}
