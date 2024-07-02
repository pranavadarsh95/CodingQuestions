package SystemDesign.Events.Listener;

import SystemDesign.Events.ComedyCircusEvent;
import SystemDesign.Events.TheBigBangTheoryEvent;

public class AbhilashListner {
    public void watchTheBigBangTheory(String epNo){
        System.out.println("Abhilash: Started Watching TheBigBangTheory");
        System.out.println("Abhilash: playing TheBigBangTheory : " + epNo);
    }

    @EventListner
    public void onApplicationEvent(TheBigBangTheoryEvent event){
        watchTheBigBangTheory(event.getEpisodeNo());
    }

}
