package sml;

/**
 * This class creates a brigde/wrapper for subclass to access the Labels class which is a final class and can
 * only be accessed by classes in the same level of the package.
 *
 * @author Yathurshen Muralitharan (GitHub: yatu360)
 */
public class LabelsBridge {

    Labels labels;

    public LabelsBridge(Labels labels) {
        this.labels = labels;
    }

    public int indexOf(String label){
        return this.labels.indexOf(label);
    }
}
