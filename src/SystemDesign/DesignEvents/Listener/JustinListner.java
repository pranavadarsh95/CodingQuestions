package SystemDesign.Events.Listener;

import SystemDesign.Events.ComedyCircusEvent;

public class JustinListner {
    public void watchComedyCircus(String epNo){
        System.out.println("Justin: Started Watching ComedyCircus");
        System.out.println("Justin: playing ComedyCircus : " + epNo);
    }

    @EventListner
    public void onApplicationEvent(ComedyCircusEvent event){
        watchComedyCircus(event.getEpisodeNo());
    }

}
