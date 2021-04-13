import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
public class App {
    public static void main(String[] args) throws Exception {
        Date date = new Date(); // lấy ngày hiện tại
        SimpleDateFormat jDateFormat = new SimpleDateFormat("dd/mm/yyyy");      
        String currentDate = jDateFormat.format(date);
        System.out.println(currentDate);
        String currentDate2 = new SimpleDateFormat("dd/yyyy/mm").format(new Date());    // cach viet gop
        System.out.println(currentDate2);
    }
}
