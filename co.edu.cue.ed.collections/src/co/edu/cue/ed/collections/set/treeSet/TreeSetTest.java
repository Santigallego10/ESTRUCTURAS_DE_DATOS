package co.edu.cue.ed.collections.set.treeSet;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Article a1 = new Article(1, "Camiseta");
        Article a2 = new Article(2, "Jeans");
        Article a3 = new Article(3, "Tacones");
        Article a4 = new Article(2, "Vestido");
        Article a5 = new Article(5, "Pantaloneta");

        Set<Article> articles = new TreeSet<>();

        articles.add(a3);
        articles.add(a1);
        articles.add(a2);
        articles.add(a4);
        articles.add(a5);

        for (Article article : articles) {
            System.out.println(article);
        }

        //articles.
    }
}
