package phoneBook;

import java.util.HashMap;
import java.util.Map;

public class E1 {
    public Map<String, PhoneDB> phoneBook = new HashMap<>();

    public void NewNumber(PhoneDB pd){
        phoneBook.putIfAbsent(pd.firstName.toLowerCase() + " " + pd.lastName.toLowerCase(), pd);
    }
    public PhoneDB GetRecord(String fName, String lName){
        if (phoneBook.containsKey(fName.toLowerCase() + lName.toLowerCase()))
            return phoneBook.get(fName.toLowerCase() + lName.toLowerCase());
        else
            throw new RuntimeException("Запись не найдена");
    }
}
