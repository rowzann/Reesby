package main.java.PageObjects;

public interface LoginObjects {
    String username="//*[@id=\"root\"]/div/div/div/div/div[1]/form/div/div[1]/div/input";
    String password="//*[@id=\"root\"]/div/div/div/div/div[1]/form/div/div[2]/div/input";
    String signInButton="//*[@id=\"root\"]/div/div/div/div/div[1]/form/button[1]";
    String signInWithGoogle="//*[@id=\"root\"]/div/div/div/div/div[1]/form/button[2]";
    String createNewAccount="//*[@id=\"root\"]/div/div/div/div/div[1]/a";
    String emailErrorMessage="//*[@id=\"root\"]/div/div/div/div/div[1]/form/div/div[1]/p";




}
