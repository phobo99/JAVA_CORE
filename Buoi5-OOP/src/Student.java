public class Student {
    public int msv;
    public String hoTen;
    public float diemLyThuyet, diemThucHanh;
    public Student(){
    }
    //constructor thong tin
    public Student(int msv, String hoTen, float diemLyThuyet, float diemThucHanh){
        this.msv = msv;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }
    //Method tinh diem trung binh
    public float diemTrungBinh(){
        return (diemLyThuyet + diemThucHanh)/2;
    }
    public void display(){
        System.out.printf("%4d\t %-15s %8.2f %18.2f %19.2f \n", msv , hoTen , diemLyThuyet , diemThucHanh , diemTrungBinh());
    }
}
