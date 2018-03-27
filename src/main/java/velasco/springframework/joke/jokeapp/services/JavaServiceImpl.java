package velasco.springframework.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JavaServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes; //https://mvnrepository.com/artifact/guru.springframework/chuck-norris-for-actuator/0.0.2

    public JavaServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
