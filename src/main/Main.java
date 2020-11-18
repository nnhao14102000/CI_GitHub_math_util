/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fu.util.MathUtility;
//câu lệnh từ JDK 8 (5), khai báo sẵn hàm static,
//ở dưới gọi hàm static ko cần chấm, y chang C, chỉ áp dụng cho static
/**
 *
 * @author giao-lang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120; //tớ hy vọng thấy 120 nếu tớ gọi 5!
        long actual = MathUtility.getFactorial(5);
        //in ra kiểm tra sự khớp nhau giữa cái ta muốn và cái ta làm
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);

        //tiếp tục cho các tình huống 6! 7!, 21! -5! 0!....
        //             các tình huống cần phải test ta gọi là test cases
        //về lí thuyết ta phải test hết các tình huống...
        //về thực hành: kì 5 sẽ rõ SWT301
        System.out.println("6!: 720, actual: " + MathUtility.getFactorial(6));
        System.out.println("0!: 1, actual: " + MathUtility.getFactorial(0));
        //tao kì vọng mày ném về ngoại lệ, phải là ngoại lệ
        //IllegalArgumentException nếu tao cố tình, người xài hàm
        //này của tao đưa tham số âm, tham số > 20
        System.out.println("expected: IllegalArgumentException: " + MathUtility.getFactorial(-5));
       
        System.out.println("Chúc cuối tuần thứ 9 vui vẻ");
        
        System.out.println("Check Green & Red");
    }

}

//MÌNH MÚN KẾT LUẬN HÀM NGON, MÌNH PHẢI TEST CÁC TRƯỜNG HỢP XÀI HÀM
//TRƯỜNG HỢP 5! 0! -5! 21! 20! ....
//mình phải thiết kế các test case, tình huống test để sau đó mình verify
//giữa giá trị trả về của hàm (actual) có khớp với expected cái mình dự đoán
//hàm chạy phải trả về
//và nếu mọi thứ khớp, tức là actual == expected, mình mới dám gáy: HÀM NGON
//CÁCH NÀY CÓ NHƯỢC ĐIỂM: NHÌN BẰNG MẮT VÀ SO SÁNH KẾT QUẢ CỦA TỪNG CASE 
//                                                                  tình huống test
//Cách này ổn, nhưng tiềm ẩn sai sót do nhìn = mắt nhiều case

//CÁCH NÂNG CAO
//CŨNG NHÌN = MẮT, NHƯNG CHỈ NHÌN 2 MÀU XANH - ĐỎ CHO MỌI TEST CASES
//có nghĩa: nếu bạn xài hàm với 100 tham số, chạy hàm 100 tình huống khác nhau
//bạn chỉ cần nhìn duy nhất 2 màu xanh, đỏ
//XANH, CODE ỔN CHO MỌI TEST CASE, MỌI TÌNH HUỐNG GỌI HÀM
//      MỌI CASE PHẢI CÓ EXPECTED = ACTUAL THÌ MỚI XANH
//ĐỎ, MỌI CASE MÀU XANH, CHỈ CÓ ÍT NHẤT 1 THẰNG ĐỎ, KẾT LUẬN CẢ ĐÁM ĐỎ
//      hàm đúng cho 99 trường hợp, expected = actual cho 99% tình huống
//      chỉ có 1 tình huống sai, ko khớp, kết luận luôn, hàm ko ổn định
//      ai dám xài khi ko ổn định, ổn định và chính xác phải cho mọi trường hợp
//CHỈ CẦN ÍT NHẤT 1 CÁI KHÔNG ỔN, ĐỎ CẢ ĐÁM ĐỂ ĐẢM BẢO RẰNG HÀM PHẢI CHÍNH XÁC MỌI
//TÌNH HUỐNG

//MÚN LÀM ĐC ĐIỀU NÀY, CẦN SỰ PHỤ GIÚP CỦA CÁC THƯ VIỆN BÊN NGOÀI JDK, GỌI LÀ
//UNIT TEST FRAMEWORK
//CÁC BỘ UNIT TEST NỔI TIẾNG: JUnit, TestNG, NUnit, xUnit, PHPUnit, ...
//bữa nay mình học xanh đỏ qua JUnit
//vẫn với mục tiêu test hàm có ngon ko, nhưng chỉ nhìn đúng 2 màu, ko care chi
//tiết các tình huống chạy hàm

