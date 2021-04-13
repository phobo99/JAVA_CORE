public class App {
    //Bài tập tính tiền lãi hàng tháng của khoản vay
    public static void main(String[] args) throws Exception {
        double debtAmount = 100000000;                      //Số nợ: 100.000.000
        double interestPerMonth, interestPaidMonthly;          
        double interestRestPerYear = 0.12;                  // 12% = 0.12

        interestPerMonth = debtAmount * (interestRestPerYear / 12);     //tiền lãi trả hàng tháng = Số nợ gốc là 100.000.000 * (Lãi suất tháng  / 12 tháng)

        interestPaidMonthly = (debtAmount / 12) + interestPerMonth;     // Tổng số tiền phải trả hàng tháng = tiền gốc/12 tháng + tiền lãi trả hàng tháng

        System.out.println("The amount of interest paid monthly is: " + interestPerMonth);
        System.out.println("The total amount payable every month is: " + interestPaidMonthly);
    }
}


