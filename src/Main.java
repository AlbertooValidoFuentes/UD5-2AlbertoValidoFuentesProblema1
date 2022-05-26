public class Main {
    public static void main(String[] args) {
        SuperList<Integer> list = new SuperList<Integer>();

        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);

        list.removeElement(3);

        list.showElements();

        list.showReversedElements();
    }
}