import java.io.IOException;
import java.io.FileWriter;
class UserDataWriter {
    private final FileWriter writer;

    public UserDataWriter(String fileName) {
        try {
            writer = new FileWriter(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeUserData(String lastName, String firstName, String middleName, String dateOfBirthString,
                              String phoneNumberString, String genderString) {
        try {
            writer.write(lastName + "," + firstName + "," + middleName + "," + dateOfBirthString + "," + phoneNumberString + "," + genderString);
            writer.write(System.lineSeparator());
            System.out.println("Данные успешно записаны в файл " + writer.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка записи в файл");
        }
    }
}