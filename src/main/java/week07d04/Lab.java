package week07d04;

import java.time.LocalDate;

public class Lab {
    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        //this.completed = true;
        completed = true;
        this.completedAt = completedAt;
    }
    //állapot beállító
    public void complete(LocalDate completedAt){
        completed = true;
        this.completedAt = completedAt;
    }

    //állapot beállító
    public void complete(){
        completed = true;
        completedAt = LocalDate.now();
    }

    //eredményt visszaadó, query, van visszatérési értéke
    public boolean isTitleLongerThanTwoCharacter(){
        return title != null && title.length() > 2;
    }

    public String titleAndCompleted(String singIfCompleted, String singIfNotCompleted){
        return title + " " + (completed ? singIfCompleted : singIfNotCompleted);
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }
}
