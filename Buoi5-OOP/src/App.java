public class App {
    public static void main(String[] args) {
        //Constructor mặc định
        Student sv1 = new Student();
        sv1.msv = 1711;
        sv1.hoTen = "Pho";
        sv1.diemThucHanh = 8;
        sv1.diemLyThuyet = 9;

        Student sv2 = new Student();
        sv2.msv = 1716;
        sv2.hoTen = "Son";
        sv2.diemThucHanh = 7;
        sv2.diemLyThuyet = 9;

        Student sv3 = new Student();
        sv3.msv = 17965;
        sv3.hoTen = "Tung";
        sv3.diemThucHanh = 9;
        sv3.diemLyThuyet = 9;

        //Constructor có tham số
        Student sv4 = new Student(1548,"Ha",9,5);

        // in kết quả ra màn hình
        System.out.printf("%3s %9s %20s %20s %20s \n","MaSV","Ho ten","Diem ly thuyet", "Diem thuc hanh", "Diem Trung Binh");
        sv1.display();
        sv2.display();
        sv3.display();
        sv4.display();
    }
}
