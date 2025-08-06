package Ex3_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SubscriberProperty implements PropertyChangeListener {

    @Override
    public void propertyChange(java.beans.PropertyChangeEvent evt) {
        if ("scoreLine".equals(evt.getPropertyName())) {
            System.out.println("Live result: " + evt.getNewValue());
        }
    }
    
}
