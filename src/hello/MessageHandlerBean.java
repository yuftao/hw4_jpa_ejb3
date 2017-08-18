package hello;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MessageHandlerBean implements MessageHandler {

    @PersistenceContext
    EntityManager em;
    
    public void saveMessages() {
        Message message = new Message("Hello World");
        em.persist(message);
    }
    
    public void showMessages() {
        List messages = em.createQuery("select m from Message m order by m.text asc").getResultList();
        
        System.out.println(messages.size() + " message(s) found:");
        
        for (Object m : messages) {
            Message loadedMsg = (Message) m;
            System.out.println(loadedMsg.getText());
        }
    }
}
