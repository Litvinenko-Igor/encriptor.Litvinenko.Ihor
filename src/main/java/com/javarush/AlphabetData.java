package com.javarush;

import java.util.ArrayList;
import java.util.Arrays;

public class AlphabetData {
    public static final ArrayList<Character> englishUppercaseAlphabet = new ArrayList<>(
            Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
            )
    );
    public static final ArrayList<Character> englishLowercaseAlphabet = new ArrayList<>(
            Arrays.asList(
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
            )
    );

    public static final ArrayList<Character> ukrainianUppercaseAlphabet = new ArrayList<>(
            Arrays.asList(
                    'A', 'Б', 'В', 'Г', 'Д', 'E', 'Є', 'Ж', 'З', 'И', 'I',
                    'Ї', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т',
                    'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ю', 'Я'
            )
    );

    public static final ArrayList<Character> ukrainianLowercaseAlphabet = new ArrayList<>(
            Arrays.asList(
                    'a', 'б' , 'в' , 'г', 'д', 'e', 'є', 'ж', 'з', 'и', 'i',
                    'ї', 'й', 'к', 'л' , 'м' , 'н', 'о', 'п', 'р', 'с', 'т',
                    'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ю', 'я'
            )
    );

    public static final ArrayList<Character> ignoredChars = new ArrayList<>(
            Arrays.asList('.', ',', '«', '»', '"', '\'', ':', '!', '?', ' ', '\n'
            )
    );

    public static final String[] englishCommonWords = {
            "house", "home", "apartment", "kitchen", "bedroom", "living", "garage",
            "garden", "city", "town", "countryside", "table", "chair", "sofa", "window",
            "family", "fridge", "machine", "shop",
            "mountains", "modern", "quiet", "bright", "large", "small",
            "love", "life", "morning", "evening", "money", "world", "music", "movie",
            "school", "computer", "phone", "park", "parking", "beautiful", "sunny", "weather", "night", "light", "dark", "water", "coffee", "drink", "breakfast",
            "lunch", "dinner", "apple", "banana", "orange", "grape", "carrot", "potato", "tomato",
            "milk", "bread", "butter", "cheese", "meat", "chicken", "fish","soup", "salad",
            "sugar", "salt", "pepper", "rice", "pasta", "cake", "cookie", "chocolate", "honey",
            "happy", "angry", "bored", "excited", "tired", "scared", "surprised", "cold", "warm", "fast", "slow", "easy", "hard", "strong", "weak", "soft",
            "clean", "dirty", "safe", "dangerous", "expensive", "cheap", "heavy",
            "light", "thick", "high", "near", "long", "short",
            "shallow", "full", "empty", "wide", "narrow", "round", "square", "sharp",
            "first", "last", "early", "late", "next", "before", "after", "yesterday",
            "tomorrow", "today", "always", "never", "sometimes", "often", "rarely",
            "usually", "again", "once", "twice", "many", "some", "none", "each",
            "other", "both", "every", "another", "this", "that", "these", "those", "here",
            "there", "where", "anywhere", "everywhere", "somewhere", "nowhere", "what",
            "which", "whose", "whom", "because", "then", "although",
            "while", "since", "until", "unless", "whether", "before", "after", "during",
            "inside", "outside", "above", "below", "between", "among", "next", "beside",
            "behind", "in front of", "over", "under", "left", "right", "down", "into",
            "onto", "out of", "away", "back", "together", "apart", "around", "through",
            "along", "across", "toward", "forward", "backward", "fast", "slow", "strong",
            "weak", "simple", "complex", "difficult", "easy", "possible", "impossible",
            "correct", "wrong", "true", "false", "right", "left", "north", "south", "east",
            "west", "morning", "afternoon", "evening", "night", "midnight", "week",
            "month", "year", "decade", "century", "moment", "second", "minute", "hour",
            "weekend", "holiday", "birthday", "wedding", "anniversary", "party", "celebration"
    };



    public static final String[] ukrainianCommonWords = {
            "привіт", "доброго", "будь", "ласка", "дякую", "вибачте", "чому", "коли",
            "вона", "вони", "добре", "погано", "сьогодні", "завтра", "вчора",
            "будинок", "автомобіль", "друг", "родина", "дитина", "робота", "школа",
            "комп’ютер", "телефон", "кімната", "напій", "місто", "країна", "дорога",
            "вулиця", "книга", "дерево", "любов", "життя", "мрія", "щастя", "великий",
            "малий", "новий", "старий", "швидкий", "повільний", "легкий", "важкий",
            "гарячий", "холодний", "чоловік", "жінка", "хлопець", "дівчина", "батько",
            "мати", "брат", "сестра", "дружба", "погода", "ранок", "вечір", "квітка",
            "сонце", "зірка", "веселка", "повітря", "будівля", "меблі", "вікно", "двері",
            "стілець", "світло", "сніг", "вітер", "осінь", "зима", "літо", "весна",
            "гори", "озеро", "ріка", "поле", "трава", "квіти", "овочі",
            "фрукти", "яблуко", "груша", "слива", "виноград", "персик", "полуниця",
            "буряк", "капуста", "помідор", "огірок", "морква", "картопля", "хліб",
            "молоко", "масло", "цукор", "сіль", "м’ясо", "риба", "борщ", "кава","печиво",
            "торт", "цукерка", "шоколад", "книжка", "газета", "журнал",
            "пошта", "лист", "повідомлення", "номер", "фільм", "музика", "картина",
            "парк", "магазин", "школа", "університет", "аптека", "лікарня", "театр",
            "кінотеатр", "музей", "палац", "фортеця", "замок", "стадіон", "аеропорт",
            "вокзал", "автобус", "трамвай", "поїзд", "літак", "корабель", "машина",
            "велосипед", "поїздка", "подорож", "відпочинок", "канікули", "відпустка",
            "свято", "вечірка", "день", "ночі", "тиждень", "місяць", "година",
            "хвилина", "секунда", "момент", "молодість", "старість", "робота",
            "відпочинок", "здоров’я", "дружба", "спогади", "успіх", "повага", "честь",
            "чесність", "радість", "горе", "злість", "щастя", "страх",
            "надія", "довіра", "знання", "мудрість", "розум", "сила", "слабкість",
            "сміливість", "краса", "любов", "світ", "природа", "родина"
    };

}

