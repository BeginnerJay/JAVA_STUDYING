package chapter11;

public class NotebookTest {

	public static void main(String[] args) {
		Notebook gram = new Notebook("i7", 16, 100, 27, "손흥민");

		gram.display_notebook();
		gram.person.intro();
	}

}
