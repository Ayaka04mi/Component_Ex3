package Ex3_2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

class LiveScoreBean {
    private String scoreLine;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener l) {
        support.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        support.removePropertyChangeListener(l);
    }

    public void setScoreLine(String newScoreLine) {
        String oldScoreLine = this.scoreLine;
        this.scoreLine = newScoreLine;
        support.firePropertyChange("scoreLine", oldScoreLine, newScoreLine);
    }

    public String getScoreLine() {
        return scoreLine;
    }
}