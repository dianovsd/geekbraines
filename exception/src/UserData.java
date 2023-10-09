import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные пользователя в формате: Фамилия Имя Отчество датарождения номертелефона пол");
        String input = scanner.nextLine();
        String[] userData = input.split(" ");
        if (userData.length != 6) {
            throw new IllegalArgumentException("Вы ввели недостаточно или слишком много данных");
        }
        String lastName = userData[0];
        String firstName = userData[1];
        String middleName = userData[2];
        String dateOfBirthString = userData[3];
        String phoneNumberString = userData[4];
        String genderString = userData[5];

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOfBirth;
        try {
            dateOfBirth = dateFormat.parse(dateOfBirthString);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Дата рождения введена неверно");
        }

        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(phoneNumberString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Номер телефона введен неверно");
        }

        if (!genderString.equals("f") && !genderString.equals("m")) {
            throw new IllegalArgumentException("Пол введен неверно");
        }

        UserDataWriter writer = new UserDataWriter(lastName + ".txt");
        writer.writeUserData(lastName, firstName, middleName, dateOfBirthString, phoneNumberString, genderString);
    }
}
