package Constants;

import java.util.ArrayList;
import java.util.Arrays;

public class Symbols_And_Letters {
    public static final ArrayList<Character> ALPHABET_EN_UPPER = new ArrayList<>(
            Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
            )
    );
    public static final ArrayList<Character> ALPHABET_EN_SMALLER = new ArrayList<>(
            Arrays.asList(
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
            )
    );

    public static final ArrayList<Character> ALPHABET_UA_UPPER = new ArrayList<>(
            Arrays.asList(
                    'A', 'Б', 'В', 'Г', 'Д', 'E', 'Є', 'Ж', 'З', 'И', 'I',
                    'Ї', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т',
                    'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ю', 'Я'
            )
    );

    public static final ArrayList<Character> ALPHABET_UA_SMALLER = new ArrayList<>(
            Arrays.asList(
                    'a', 'б' , 'в' , 'г', 'д', 'e', 'є', 'ж', 'з', 'и', 'i',
                    'ї', 'й', 'к', 'л' , 'м' , 'н', 'о', 'п', 'р', 'с', 'т',
                    'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ю', 'я'
            )
    );

    public static final ArrayList<Character> IGNORED_CHARS = new ArrayList<>(
            Arrays.asList('.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '
            )
    );

    public final String[] COMMON_WORDS_ENGLISH = {
            "hello", "good", "day", "yes", "no", "please", "thank", "sorry", "where",
            "how", "who", "why", "what", "when","you", "he", "she", "it", "we",
            "they", "good", "bad", "today", "tomorrow", "yesterday", "house", "car",
            "friend", "family", "child", "dog", "cat", "work", "school", "water", "food",
            "drink", "time", "night", "city", "country", "way", "road", "room", "book",
            "tree", "love", "life", "dream", "happy", "sad", "big", "small", "new",
            "old", "fast", "slow", "easy", "hard", "hot", "cold", "man", "woman",
            "boy", "girl", "father", "mother", "brother", "sister", "friendship", "weather",
            "morning", "evening", "computer", "phone", "table", "chair", "door", "window",
            "street", "park", "shop", "money", "job", "name", "number", "home", "world",
            "music", "movie", "question", "answer", "month", "year", "week", "hour",
            "minute", "second", "color", "animal", "flower", "forest"
    };


    public final String[] COMMON_WORDS_UKRAIN = {
            "привіт","доброго", "день", "будь", "ласка", "дякую",
            "вибачте", "чому", "коли", "він", "вона", "воно", "вони",
            "добре", "погано", "сьогодні", "завтра", "вчора", "будинок", "автомобіль",
            "друг", "родина", "дитина", "робота", "школа", "вода",
            "напій", "місто", "країна", "дорога", "вулиця", "кімната", "книга", "дерево", "любов",
            "життя", "мрія", "щастя", "великий", "малий", "новий", "старий",
            "швидкий", "повільний", "легкий", "важкий", "гарячий", "холодний", "чоловік",
            "жінка", "хлопець", "дівчина", "батько", "мати", "брат", "сестра", "дружба",
            "погода", "ранок", "вечір", "комп’ютер", "телефон", "стіл", "стілець",
            "двері", "вікно", "вулиця", "парк", "магазин", "гроші", "номер",
            "світ", "музика", "фільм", "питання", "відповідь", "місяць",
            "тиждень", "година", "хвилина", "секунда", "колір", "тварина",
            "квітка"
    };

}

