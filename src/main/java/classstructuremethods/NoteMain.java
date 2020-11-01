package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();

        note.setName("Peter");
        note.setTopic("cím");
        note.setText("ez meg a szöveg");

        note.getNoteText();
    }
}
