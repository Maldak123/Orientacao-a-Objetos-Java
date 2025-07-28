package br.com.alura.poo.models;

import br.com.alura.poo.calculation.StarsCalculator;

public class Series extends Title implements StarsCalculator {
  private int seasons;
  private int episodesPerSeason;
  private boolean onAir;

  public Series(String name, int releaseDate, int seasons, int episodesPerSeason, boolean onAir) {
    super(name, releaseDate);
    this.seasons = seasons;
    this.episodesPerSeason = episodesPerSeason;
    this.onAir = onAir;
  }

  // Setters
  public void setSeasons(int seasons) {
    this.seasons = seasons;
  }

  public void setEpisodesPerSeason(int episodesPerSeason) {
    this.episodesPerSeason = episodesPerSeason;
  }

  public void setOnAir(boolean onAir) {
    this.onAir = onAir;
  }

  // Getters
  public int getSeasons() {
    return seasons;
  }

  public int getEpisodesPerSeason() {
    return episodesPerSeason;
  }

  public boolean getOnAir() {
    return onAir;
  }

  @Override
  public int calculateStars(double rate) {
    return (int) rate / 2;
  }
}
