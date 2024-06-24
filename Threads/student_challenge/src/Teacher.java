public class Teacher extends Thread{
    WhiteBoard wb;
    String[] notes = {"Java is OOP language", "Java use Multithreading", "String is an object", "Array must have a specified length", "end"};
    public Teacher(WhiteBoard w) {
        wb = w;
    }
    public void run(){
        for (int i = 0; i < notes.length; i++) {
            wb.write(notes[i]);
        }
    }
}
