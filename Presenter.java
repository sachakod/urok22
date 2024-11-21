
public class Presenter {
  View view;
  Model model;
  public Presenter(Model x, View y) {
    model =x;
    view=y;
}
public void buttonClick() {
    int a=view.getValue("2");
    int b=view.getValue("3");
}
}