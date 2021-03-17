package codewithmosh;

public interface UIWidget
        extends Draggable, Resizeable {
    void render();



    // at the beginning of the tutorial we had 3 different methods that performed different jobs
        // void drag();
        // void size();
        // void render();
    // this interface has different concern that can effect each other
    // if changed even if they have nothing to do with each other
    // the interface segregation principles says we should divide those
    // above into smaller ones and that each interface should focus on one capability

    // now the 3 methods have their own interface and are not coupled together so if you change one
    // or add different implementations it
    // doesn't effect the other. using the extend keyword they can all still be used if you call the
}

