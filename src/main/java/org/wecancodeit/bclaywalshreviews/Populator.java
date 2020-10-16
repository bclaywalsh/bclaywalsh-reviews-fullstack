package org.wecancodeit.bclaywalshreviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.bclaywalshreviews.models.BookReview;
import org.wecancodeit.bclaywalshreviews.models.GameReview;
import org.wecancodeit.bclaywalshreviews.models.MovieReview;
import org.wecancodeit.bclaywalshreviews.repositories.BookReviewsRepository;
import org.wecancodeit.bclaywalshreviews.repositories.GameReviewsRepository;
import org.wecancodeit.bclaywalshreviews.repositories.MovieReviewsRepository;

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
        GameReview axiomVerge = new GameReview("Axiom-Verge", "Indie Game", "/images/axiomverge.jpeg", "Thomas Happ Games LLC", "A side-scrolling metroid-like that pays homage to the old days of metroid, including all of the intriguingly exploitable glitches. In this game you do all the metroid things, such as collecting new weapons and gear to advance to new unexplored zones.","This game....is great. As I understand it this game was made by a single person over the course of 5 years, and thats honestly not even affecting the high score Im going to give it. Axiom Verge is a metroidvania that takes sci-fi and cyberpunk into a whole new realm. The rough on-screen pixels are intentional, all the glitchy graphics are SUPPOSED to be there, and the character your playing knows that everything is more than a little off. The action is classic, the music is nice and moody, and the story is mind-blowing. 9/10");
        GameReview hyperLightDrifter = new GameReview("Hyper-Light-Drifter", "Indie Game", "/images/hyperlightdrifter2.png", "Heart Machine, Abylight S.L.","A pixelated top-down adventure game reminiscent of Zelda and other stick-shooters.","A predominant theme in Hyper Light Drifter is chronic illness and something being subtly, terribly wrong in the world. The jarringly bright colors and high-contrast environments hide many things in their shadows, and throughout the game you are rewarded for thinking outside the box. The game has hands-down the most intriguing and jaw-dropping opening Ive ever seen, and while the game is quite enjoyable I wish that sense of awe continued, but sadly the game ends on a somewhat bland note. The action is good old-fashioned top-down sword and gunplay, and the music is just okay. 7/10");
        GameReview transistor = new GameReview( "Transistor", "Indie Game", "/images/transistor.jpg", "Supergiant Games", "A top down action/strategy game","Transistor is an indie game by the small group Supergiant Games. It features a unique programmable battle system and an incredibly artsy ambiance. The only way I can describe the games mood is possibly as warmly bleak, as you are one of the last people left alive in a city which is rapidly becoming a ghost-town as people start disappearing. The music in Transistor is a key component. It is ever-present and subtly complex in a way that bewitched my brain and brought me along with the incredible journey. 9/10");
        GameReview bastion = new GameReview( "Bastion", "Indie Game", "/images/bastion.jpg", "Supergiant Games", "A top-down 2.5D action game, narrated every step of the way.","Bastion is the first game by indie group Supegiant Games. Its unique art and music style are what draw you in and may or may not keep you hooked. One of the most interesting aspects is that your every move is narrated (quite skillfully). The action of the game is fast and rewarding, but for me it was the story that kept me around. It is...strange. Its quite obvious from the very beginning that this world is different from any you have ever dreamt of before. 8/10");
        GameReview blasphemous = new GameReview("Blasphemous","Indie Game","/images/blasphemous.jpg","The Game Kitchen","A side-scrolling metroidvania exploring extremely dark and adult themes","Blasphemous is one of those games you never show your kids or your parents. Some would call it needlessly grotesque or even gore-porn, but this game seldom does anything frivolously. The setting is an illustration of extreme Spanish Catholicism, in which suffering is touted as the best cure for wickedness. The gore illustrates an exceptionally grim world where the highest calling is to be a kisser of wounds, a so-called healer of the dying. The music is quite moody, but it is the sound effects that steal the show here. The voice-acting is quite nice, and the script is well written using a large amount of choice latin phrases to set the dark and solemn mood. Be warned before starting this game, the grimness never gives way to light. The whole experience is simultaneously exalting and condemning religion seemingly en-mass.Blasphemous is dark through and through. 9/10");
        GameReview derelictStar = new GameReview("Derelict-Star","Indie Game","/images/Bridge2.jpg","bclaywalsh-studio name pending","A side-scrolling metroidvania set in a dystopian future in which mankind is essentially extinct.","Derelict Star is my own personal project and tribute to the Metroid franchise. This game was my gateway to programming and a new lifestyle. The dark atmospheric mood is intended to be in the spotlight, coaxing players to explore the dangerous environments of a crumbling starship and hostile alien world. Exploration is key to survival, as vital upgrades can be found almost anywhere if you follow the visual hints. As the game progresses there will be choices to be made, and like few games before non-violence is often quite beneficial, as well as life-saving. The game is incomplete at the moment and cannot be scored, but of course I am biased and will probably heap praise upon it when finished.");
        gamesRepos.save(axiomVerge);
        gamesRepos.save(hyperLightDrifter);
        gamesRepos.save(transistor);
        gamesRepos.save(bastion);
        gamesRepos.save(blasphemous);
        gamesRepos.save(derelictStar);

        MovieReview pansLabyrinth = new MovieReview("Pans-Labyrinth","Foreign Film","/images/PansLabyrinth.jpg","Guillermo del Toro","A fantastic adventure in the reality or fantasies of a young Spanish girl living through terrible times.","Ill say up front that Pans Labyrinth is my favorite movie full stop. Guillermo Del Toro is a brilliant director who hits this grim-fairy (like) tale out of the park. The costume design and set design are flabbergasting, the music is haunting and has never left my bones. The on-screen talent is amazing (the spanish script flows like poetry from from the satyrs lips), and the story is bittersweet beyond words. 10/10");
        MovieReview jacobsLadder = new MovieReview("Jacobs-Ladder","Horror","/images/Jacobsladderposter.jpg","Adrian Lyne", "A classic psychological horror film from 1990 that inspired generations of tributes. Jacobs ladder follows the strange occurences around veteran Jacob Singer years after his return from the front lines.","The impact of Jacobs Ladder cannot be overstated. I first watched this movie after hearing it referenced time and time again as inspiration for my favorite horror media, most notably Silent Hill. The cinematography on display here was revolutionary to an incredible degree. The effects themselves werent all that advanced in any technological way, but from an art and psychological perspective they were decades ahead of their time. The psychological adventure and Trauma suffered by Jacob Singer are best summed up as disturbing, and are quite open to interpretation. The internal philosophical debate this movie inspired in me took a long time to play out. 10/10");
        MovieReview nausicaa = new MovieReview("Nausicaa-and-the-Valley-of-the-Wind", "Anime","/images/Nausicaa.jpg","Hayao Miazaki","A dystopian sci-fi set in a world of drifting dunes and jungles of toxic waste. Small islands of civilization remain in delicate biomes that must be preserved at all cost.","Nausicaa is a star-studded anime and a beautiful vision of a terrible future. The despair of the end of the world has almost entirely faded after generations of survival. High-technology is in steady decline, but relics from the past can still be unearthed to terrible effect.");
        moviesRepos.save(pansLabyrinth);
        moviesRepos.save(jacobsLadder);
        moviesRepos.save(nausicaa);

        BookReview endersGame = new BookReview("Enders-Game","Science Fiction","/images/endersgame.jpg","Orson Scott Card","The elevator pitch is kids in space, going through battle school to become the commanders to save mankind against a terrible alien threat.","Enders game is an amazing book and series. It follows the life of a brilliant child who is raised with the responsibility to save the world. All around him the adults are manipulating him, molding him into the perfect commander and killing machine. All the while his big heart resents everything theyre doing to him, but it is his very empathy that qualifies him the most for the responsibility.");
        BookReview theMartian = new BookReview("The-Martian","Science Fiction","/images/themartian.png","Andy Weir","One man on the surface of mars, left behind by his evacuating crew. He must find away to survive.","This book is extraordinarily well written. The tone and word choice are very effective at conveying both humor and despair. Mark Watney is a great guy, and your always rooting for him but you really do never know if hes going to make it out alive.");
        BookReview theBladeItself = new BookReview("The-Blade-Itself","Fantasy","/images/the-blade-itself.jpg","Joe Abercrombie","A grim fantasy set in a gritty world where most dont even believe in magic anymore","The characters here are excellent. The barbarian Logan Nine-Fingers is always so fun to read about as he encounters the more civilized people. Glochter is incredibly pragmatic, and plays the role of anti-hero so very well. Some supporting characters are fun to watch fail, some are fun to watch overcome their difficulties. Overall this has become one of my favorite book series.");
        booksRepos.save(endersGame);
        booksRepos.save(theMartian);
        booksRepos.save(theBladeItself);
    }
}
