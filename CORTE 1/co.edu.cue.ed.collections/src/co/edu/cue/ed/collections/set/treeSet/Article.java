package co.edu.cue.ed.collections.set.treeSet;


import java.util.Objects;

public class Article implements Comparable<Article> {
    private int number;
    private String description;

    public Article(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Article{" +
                "number=" + number +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Article o) {
        return number - o.getNumber();
    }
}
