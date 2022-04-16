package sml;


public class LabelsBridge {
    Labels labels;

    public LabelsBridge(Labels labels) {
        this.labels = labels;
    }

    public int indexOf(String label){
        return this.labels.indexOf(label);
    }
}
