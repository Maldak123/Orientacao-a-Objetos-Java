package br.com.alura.poo.models;

import br.com.alura.poo.calculation.StarsCalculator;
import br.com.alura.poo.exception.IllegalYearException;

public class Movies extends Title  {
  private String director;
  private int duration;

//  public Movies(String name, int releaseDate, String director, int duration) {
//    super(name, releaseDate);
//    this.director = director;
//    this.duration = duration;
//  }

  public Movies(TitleApi titleApi) {
    super(titleApi.title(), Integer.parseInt(titleApi.year()));
    this.duration = (Integer.parseInt(titleApi.runtime().substring(0, 2)));
    this.director = (titleApi.director());
  }

//  public int getDuration() {
//    return duration;
//  }
//
//  public void setDuration(int duration) {
//    this.duration = duration;
//  }
//
//  public String getDirector() {
//    return director;
//  }
//
//  public void setDirector(String director) {
//    this.director = director;
//  }
//
//  @Override
//  public int calculateStars(double rate) {
//    return (int) rate / 2;
//  }
//
//  @Override
//  public String toString(){
//    return super.toString() +
//            "\nDuration: " + this.getDuration() +
//            "\nDirector: " + this.getDirector();
//  }
}
