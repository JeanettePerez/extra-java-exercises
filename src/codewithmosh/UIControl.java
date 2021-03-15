package codewithmosh;

// abstract classes: we declare a class, but don't want to create new instances of the class
// it is meant to be a base for other classes to work wit

// this is a abstract concept so we can't instantiate the class anymore

public abstract class UIControl {

    private boolean isEnabled = true;



//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
////        System.out.println("UIControl");
//    }

//    public void render() {
//        // empty because the way you render different types of forms is different.
//        // since it is made and will default you can override it in the child classes
//    }

    public abstract void render();

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

}
