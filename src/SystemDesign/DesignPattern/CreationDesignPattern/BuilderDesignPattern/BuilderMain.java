package SystemDesign.DesignPattern.BuilderDesignPattern;

public class BuilderMain {
    public static void main(String[] args) {
        CarWithBuilder carWithBuilder = CarWithBuilder.builder()
                .withEngine("Present")
                .withFuel("10 litre")
                .withSteering("present steering")
                .withSeats("8 seater")
                .withMusicSystem("sony music")
                .withSunRoof("top angel")
                .build();
        System.out.println(carWithBuilder);
    }
}

// Must watch :- https://www.youtube.com/watch?v=6Wi2XZeAf-Q

// Q:- what is difference between setter and builder because by using setter
// specific to variable we can assign in same way like builder.

// Ans:- setter is mutable(means changable) so, one object has created still in that object we can do
// modifications but not with builder