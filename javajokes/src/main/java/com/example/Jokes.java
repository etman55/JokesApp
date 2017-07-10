package com.example;

public class Jokes {
    public String[] jokes = new String[]
            {
                    "There are 10 types of people in the world: those who understand binary, and those who don't."
                    , "How many programmers does it take to change a light bulb/? None. It's a hardware problem.",
                    "A SEO couple had twins. For the first time they were happy with duplicate content.",
                    "Why is it that programmers always confuse Halloween with Christmas/? Because 31 OCT = 25 DEC "
                    ,
                    "Why do they call it hyper text/? Too much JAVA.",
                    " Why was the JavaScript developer sad/?Because he didn 't Node how to Express himself"
                    ,
                    "In order to understand recursion you must first understand recursion. "
                    , "Why do Java developers wear glasses?Because they can 't C# "
                    ,
                    "What do you call 8 hobbits /? A hobbyte"
                    ,
                    "    Why did the developer go broke/? Because he used up all his cache"
                    ,
                    "An SEO expert walks into a bar, bars, pub, tavern,public house, Irish pub, drinks, beer, alcohol"
                    ,
                    "I would tell you a UDP joke, but you might not get it."
                    ,
                    "If you put a million monkeys on a million keyboards, one of them will eventually write a Java program.The rest of them will write Perl programs."
                    , "There are only two hard things in computer science:cache invalidation, naming things, and off - by - one errors."
            };

    public String getJoke() {
        return jokes[(int) (Math.random() * 12)];
    }

}
