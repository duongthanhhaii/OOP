package Observer.Pseudocode;

import java.io.File;

public class Editor {
    public EventManager manager;
    private File file;

    public Editor() {
        this.manager = new EventManager();
    }

    public void openFile(String path) {
        this.file = new File(path);
        manager.notify("open", file.getName());
    }

    public void saveFile(){
        manager.notify("save", file.getName());
    }
}
