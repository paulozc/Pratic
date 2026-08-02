import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        boolean insert = languages.add(language);
    }

    public void removeLanguage(String language) {
        boolean remove = languages.remove(language);
    }

    public String firstLanguage() {
        String first = languages.get(0);
        return first;
    }

    public int count() {
        int numberLanguage = languages.size();
        return numberLanguage;
    }

    public boolean containsLanguage(String language) {
        boolean contains = languages.contains(language);
        return contains;
    }

    public boolean isExciting() {
        boolean excited = languages.contains("Java") || languages.contains("Kotlin");
        return excited;
    }
}