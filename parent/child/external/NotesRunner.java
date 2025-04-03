package parent.child.external;

import parent.child.internal.Notes;
import parent.child.internal.StudyNotes;

public class NotesRunner {
        public static void main(String[] args) {
            Notes notes = new Notes();
            notes.subject();
            notes.format();
            notes.length();
            notes.readability();
            notes.author();

            System.out.println("-------------------------");

            StudyNotes studyNotes = new StudyNotes();
            studyNotes.subject();
            studyNotes.format();
            studyNotes.length();
            studyNotes.readability();
            studyNotes.author();

            System.out.println("-------------------------");

            Notes notes1 = new StudyNotes();
            notes1.subject();
            notes1.format();
            notes1.length();
            notes1.readability();
            notes1.author();
        }
    }

