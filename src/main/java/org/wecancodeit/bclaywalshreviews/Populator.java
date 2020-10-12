package org.wecancodeit.bclaywalshreviews;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.bclaywalshreviews.models.GameReview;
import org.wecancodeit.bclaywalshreviews.repositories.BookReviewsRepository;
import org.wecancodeit.bclaywalshreviews.repositories.GameReviewsRepository;
import org.wecancodeit.bclaywalshreviews.repositories.MovieReviewsRepository;/

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private GameReviewsRepository gamesRepos;

    @Resource
    private MovieReviewsRepository moviesRepos;

    @Resource
    private BookReviewsRepository booksRepos;

    @Override
    public void run(String... args) throws Exception {
        GameReview axiomVerge = new GameReview(3L, "Axiom Verge", "Indie Game", "/images/axiomverge.jpeg", "Thomas Happ Games LLC", "A side-scrolling metroid-like that pays homage to the old days of metroid, including all of the intriguingly exploitable glitches. In this game you do all the metroid things, such as collecting new weapons and gear to advance to new unexplored zones.","This game....is great. As I understand it this game was made by a single person over the course of 5 years, and that's honestly not even affecting the high score I'm going to give it. Axiom Verge is a metroidvania that takes sci-fi and cyberpunk into a whole new realm. The rough on-screen pixels are intentional, all the glitchy graphics are SUPPOSED to be there, and the character your playing knows that everything is more than a little off. The action is classic, the music is nice and moody, and the story is mind-blowing. 9/10");
        GameReview hyperLightDrifter = new GameReview(4L, "Hyper Light Drifter", "Indie Game", "/images/hyperlightdrifter2.png", "Heart Machine, Abylight S.L.","A pixelated top-down adventure game reminiscent of Zelda and other stick-shooters.","A predominant theme in Hyper Light Drifter is chronic illness and something being subtly, terribly wrong in the world. The jarringly bright colors and high-contrast environments hide many things in their shadows, and throughout the game you are rewarded for thinking outside the box. The game has hands-down the most intriguing and jaw-dropping opening I've ever seen, and while the game is quite enjoyable I wish that sense of awe continued, but sadly the game ends on a somewhat bland note. The action is good old-fashioned top-down sword and gunplay, and the music is just okay. 7/10");
        GameReview transistor = new GameReview(1L, "Transistor", "Indie Game", "/images/transistor.jpg", "Supergiant Games", "A top down action/strategy game","Transistor is an indie game by the small group Supergiant Games. It features a unique programmable battle system and an incredibly artsy ambiance. The only way I can describe the game's mood is possibly as warmly bleak, as you are one of the last people left alive in a city which is rapidly becoming a ghost-town as people start disappearing. The music in Transistor is a key component. It is ever-present and subtly complex in a way that bewitched my brain and brought me along with the incredible journey. 9/10");
        GameReview bastion = new GameReview(2L, "Bastion", "Indie Game", "/images/bastion.jpg", "Supergiant Games", "A top-down 2.5D action game, narrated every step of the way.","Bastion is the first game by indie group Supegiant Games. It's unique art and music style are what draw you in and may or may not keep you hooked. One of the most interesting aspects is that your every move is narrated (quite skillfully). The action of the game is fast and rewarding, but for me it was the story that kept me around. It is...strange. It's quite obvious from the very beginning that this world is different from any you have ever dreamt of before. 8/10");
        GameReview blasphemous = new GameReview(5L,"Blasphemous","Indie Game","/images/blasphemous.jpg","The Game Kitchen","A side-scrolling metroidvania exploring extremely dark and adult themes","Blasphemous is one of those games you never show your kids or your parents. Some would call it needlessly grotesque or even gore-porn, but this game seldom does anything frivolously. The setting is an illustration of extreme Spanish Catholicism, in which suffering is touted as the best cure for wickedness. The gore illustrates an exceptionally grim world where the highest calling is to be a 'kisser of wounds', a so-called healer of the dying. The music is quite moody, but it is the sound effects that steal the show here. The voice-acting is quite nice, and the script is well written using a large amount of choice latin phrases to set the dark and solemn mood. Be warned before starting this game, the grimness never gives way to light. The whole experience is simultaneously exalting and condemning religion seemingly en-mass.Blasphemous is dark through and through. 9/10");
        GameReview derelictStar = new GameReview(6L,"Derelict Star","Indie Game","images/Bridge2.jpg","bclaywalsh-studio name pending","A side-scrolling metroidvania set in a dystopian future in which mankind is essentially extinct.","Derelict Star is my own personal project and tribute to the Metroid franchise. This game was my gateway to programming and a new lifestyle. The dark atmospheric mood is intended to be in the spotlight, coaxing players to explore the dangerous environments of a crumbling starship and hostile alien world. Exploration is key to survival, as vital upgrades can be found almost anywhere if you follow the visual hints. As the game progresses there will be choices to be made, and like few games before non-violence is often quite beneficial, as well as life-saving. The game is incomplete at the moment and cannot be scored, but of course I am biased and will probably heap praise upon it when finished.");
        gamesRepos.save(axiomVerge);
        gamesRepos.save(hyperLightDrifter);
        gamesRepos.save(transistor);
        gamesRepos.save(bastion);
        gamesRepos.save(blasphemous);

    }
}
