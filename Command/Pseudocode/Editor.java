package Command.Pseudocode;

public class Editor {
    protected String text;

    public String getSelection() {
        return text;
    }

    public void deleteSelection() {
        text = "";
    }

    public void replaceSelection(String anotherText) {
        this.text = anotherText;
    }



}
