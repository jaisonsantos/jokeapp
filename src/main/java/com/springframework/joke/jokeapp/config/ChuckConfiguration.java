package com.springframework.joke.jokeapp.config;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by Jaison 09/19/2018
 */
//@Configuration
public class ChuckConfiguration {

    /**@Bean **/
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

}
