package SystemDesign.Events;

public class ZeeCafePublisher {

    @Autowired
    ApplicationEventPulisher applicationEventPulisher;

    public void streamBigBangTheory(String episodeNo){
        System.out.println("Zee Cafe : Starting BBT "+ episodeNo);
        applicationEventPulisher.publishEvent(new TheBigBangTheoryEvent(episodeNo));
    }

    public void streamComedyCircus(String epNo){
        System.out.println("Zee Cafe : Starting Comedy Circus "+ epNo);
        applicationEventPulisher.publishEvent(new ComedyCircusEvent(epNo));
    }
}
