package com.example.recipe_api_spring.Recipe;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecipeConfig {
    @Bean
    CommandLineRunner commandLineRunner(RecipeRepository recipeRepository) {
        return args -> {

            Recipe r1 = new Recipe("Chicken Wings with Dipping Sauces", 3.5, "05 h 00 min",
                    "https://lh3.googleusercontent.com/P_eAWJOey-MMLb9kJHnfC3_KXNioNxQ9fCbPkzUiiuwGAdIgBOQAIORF_nKg8PRDwn3ukiTqBFhKlsuqC98-=s360",
                    "Use a classic French technique to make melt-in-the-mouth confit chicken wings, served with a trio of uniquely-flavored (but quick and easy) sauces, including Richard's signature 'sri-rancha.' Be sure to set aside plenty of time for brining and cooking these flavor-packed wings!");
            Recipe r2 = new Recipe("Creamy Avocado Dip with Tomato Salsa, Queso Fresco, and Homemade Taro Chips", 4.5,
                    "1 h 55 min",
                    "https://lh3.googleusercontent.com/bNkCTOELLNReYB5aWuBZFETD5z3DoPKJTk6MWpKoBeEz_T32koN7NysBebxTFa_-GRTjImaHCZcKKkSE3T8xUWQ=s360",
                    "Taro root makes gorgeous (and crunch-tastic) chips to complement a magical avocado dip that won't turn brown in the fridge! Learn how to spice up your salsa, use a mandoline, and fry safely at home.");
            Recipe r3 = new Recipe("Cheez-It-Ice-Cream-Sundaes-9097439", 5.0,
                    "13 h 30 min",
                    "https://lh3.googleusercontent.com/0aVTiIwX39Vapz2myHk4QhNdH14-fpAhgyMGx1Mw1Rndg3OHrCAP4xkVUZ4hdkKdQ-s9ho3eAi10lq2sgfNRrWs=s360",
                    "You read that right. Cheez-It® ice cream is here! Learn the secret to making ice cream without an ice cream maker, and indulge your inner child with a chocolate-and-peanut-butter sundae topping. Be sure to plan ahead - this recipe needs some time to 'chill'! Cheez-It® is a registered trademark of Kellogg North America Company.");
            Recipe r4 = new Recipe("30-Minute Smoky Black Bean Soup", 4.0,
                    "25 min",
                    "https://lh3.googleusercontent.com/3bqGQhDQkARm2WvBEQDKpF_aofJ6VcJoR3apvngKtj8S6OCn1htvwsj3rWiXs5IoKycsweUP5ETIaq_XcznX9w=s360",
                    "Ea incididunt quis fugiat velit officia. Aliqua magna consectetur labore quis ea velit nostrud. Cillum id Lorem consectetur ullamco velit laboris velit incididunt veniam aliquip et enim officia. Consequat do minim id laborum reprehenderit do commodo quis aliqua ut consectetur incididunt. Ea reprehenderit amet cillum ad dolor magna sint occaecat pariatur. Esse cillum deserunt id pariatur ipsum ipsum. Aute cupidatat laboris sunt incididunt ullamco do adipisicing minim dolor veniam elit ut.");
            Recipe r5 = new Recipe("Easy Chicken Marsala", 4.0,
                    "21 min",
                    "https://lh3.googleusercontent.com/IylDtQAXuJxgHSaO6n28Gs1ofIstuhVjWw2ojSiP2u17ctOdPxkLZrFUrySbKf5JrJn3fGe86AXO9PxT_N4_=s360",
                    "Sunt laboris commodo in officia magna amet fugiat nostrud tempor deserunt eu proident mollit sint. Nisi velit dolor consectetur sint cupidatat pariatur aliquip dolore aliqua veniam dolor aliquip enim et. Deserunt dolore laborum nisi id consequat quis sunt anim in enim. Dolore occaecat cupidatat eu reprehenderit. Ullamco incididunt excepteur laborum reprehenderit quis. Aliqua elit adipisicing ex dolor elit cupidatat do officia quis fugiat ipsum in ullamco.");
            Recipe r6 = new Recipe("Texas Chili", 3.0,
                    "1 hr 25 min",
                    "https://lh3.googleusercontent.com/pAYVDQNTwDTaerO31w9jk5ppmdbkXll-65Q_Kh3bzSuEiJ3eWRNulRiIrp7nCgM_Xg1a-4S2r1Rgq-bh9KE3dQk=s360",
                    "Consequat magna proident aliqua id nostrud dolor labore nostrud. Sunt qui officia amet cupidatat culpa magna consectetur officia qui nisi voluptate id deserunt ipsum. Exercitation anim excepteur proident labore in consectetur velit incididunt aute ipsum mollit.");
            Recipe r7 = new Recipe("Slow Cooker Pork Ribs", 4.5,
                    "50 min",
                    "https://lh3.googleusercontent.com/u5Co61S411Hm4SVUiMsuabWZ7ulMfDq2n-awJZlTih1iZkMb8K_8jH7MMHGLznP-hb_GnMNFdQoRqtZbPgePu4U=s360",
                    "Velit fugiat deserunt elit labore Lorem cillum amet cillum ipsum. Dolore Lorem qui duis nostrud do exercitation fugiat magna nulla deserunt laborum quis tempor dolor. Eu cupidatat laboris do proident et nostrud nulla fugiat incididunt fugiat velit do ullamco. Sit id id adipisicing proident ea dolor irure non. Occaecat non minim mollit duis.");
            Recipe r8 = new Recipe("Overnight Sausage and Egg Breakfast Casserole", 4.0,
                    "1 hr",
                    "https://lh3.googleusercontent.com/TT6thMSsx-eOFCx35HoFmV4E1Ma4cPGNywgGmrpxQrqRggdkkvGsDyqXfZKwrfJrk0Mwi0qmbIkDXp6lhuBY7A=s360",
                    "In consequat culpa velit veniam cupidatat nulla. Enim enim laboris cupidatat velit in anim nisi sint Lorem ullamco mollit. Labore dolor quis aliqua laborum occaecat et eu non aute.");
            Recipe r9 = new Recipe("Chicken and Barley Soup", 5.0,
                    "1 hr 10 min",
                    "https://lh3.googleusercontent.com/3DJkh5fDAX2xKPoOuyOtctJFdQ5ksJynIx1cyH0ycqN-xCo1IIIgFRb54Ai3c2i5wqEozSW_s0nk51JDqelFtQ=s360",
                    "Lorem labore quis non eiusmod. Consectetur cupidatat enim fugiat esse. Excepteur proident laboris ipsum duis ipsum. Culpa consectetur elit quis sunt.");
            Recipe r10 = new Recipe("Creamy Avocado Dip with Tomato Salsa, Queso Fresco, and Homemade Taro Chips", 3.5,
                    "1 hr 55 min",
                    "https://lh3.googleusercontent.com/gukh_ZZ59mQYh-rUCzGOD_qyXnGC297BhMfLksGt0oPeCKYKfeVyics3GSrxZUINcsW9aTjpnERfAygyPmsucg=s360",
                    "Lorem labore quis non eiusmod. Consectetur cupidatat enim fugiat esse. Excepteur proident laboris ipsum duis ipsum. Culpa consectetur elit quis sunt.");
            Recipe r11 = new Recipe("Breakfast Skillet With Diced Red Potatoes", 4.5,
                    "30 min",
                    "https://lh3.googleusercontent.com/JdeIFjne3NZqWxHudUss18-d1z1zJdVlR1Cvgo3heQaUG9XrcPut1Pm43KW4kiqZ3xvyQYYm4B7s6i3jIhwuBwQ=s360",
                    "Ad et consequat cillum culpa incididunt tempor nostrud non. Cillum et proident pariatur laboris sunt dolore nostrud. Quis sint et nostrud sit.");
            Recipe r12 = new Recipe("Sauteed Spinach with Garlic", 5.0,
                    "7 min",
                    "https://lh3.googleusercontent.com/wfB__l-edWLoUiCkL137Rr9Eaqmc_dTjSKTbIbm2NDYcLRhXbiSVfqZWFAAQDHuFoRX-tjHREBbWQt60EOU1UhU=s360",
                    "Labore nisi irure quis excepteur ipsum proident incididunt pariatur elit duis labore. Culpa et ut deserunt ex. Aute elit officia ad labore commodo non adipisicing cillum eiusmod Lorem excepteur. Id et elit non ullamco sunt consectetur aute mollit magna velit labore et. Occaecat minim veniam id elit sit consectetur elit cillum proident. Excepteur adipisicing proident reprehenderit officia proident adipisicing non elit elit commodo labore. Dolor anim sunt elit est dolor proident labore aliqua voluptate dolor.");
            recipeRepository.saveAll(List.of(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12));
        };
    }
}
