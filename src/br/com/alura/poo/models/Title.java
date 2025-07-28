package br.com.alura.poo.models;


import br.com.alura.poo.exception.IllegalYearException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
  private String name;
  private int releaseDate;
  private int usersRating;
  private double rating;
  private double averageRating;
  private boolean included;

  public Title(String name, int releaseDate) {
    this.name = name;
    if (String.valueOf(releaseDate).length() > 4){
      throw new IllegalYearException("The maximum length on the year field is four digits.");
    }
    this.releaseDate = releaseDate;
//    this.included = included;
  }

  // Methods
  public double returnMedia() {
    averageRating = rating / usersRating;
    return averageRating;
  }

  public void rate(double userRate) {
    usersRating++;
    rating += userRate;
  }

  // Getters
  public String getName() {
    return name;
  }


  public int getReleaseDate() {
    return releaseDate;
  }

  public boolean getIncluded() {
    return included;
  }

  public int getUsersRating() {
    return usersRating;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setReleaseDate(int releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String setIncluded(boolean included) {
    this.included = included;

    if (included) {
      return "Series is included in your subscription";
    } else {
      return "Series is not included in your subscription";
    }
  }

  @Override
  public String toString() {
    return this.getName() + " - " + this.getReleaseDate();
  }

  @Override
  public int compareTo(Title otherTitle) {
    return this.getName().compareTo(otherTitle.getName());
  }
}
