package homeworks.hw2.youtube.oop.oopdersi;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandi.");
    }
}
