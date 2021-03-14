public class TextBox extends UIControl {

    private String text = ""; // field

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text){ // void is the return type because you don't want to return values here
        this.text = text; // when the name of a parameter is the same as the name of the field you can use
        // the this keyword. this keyword is a reference to the current object. this.text = value of parameter
    }
    public void clear() {
       text = "";
    }
}
