
# Ứng dụng Quản lý kho hàng
(https://github.com/nguyennam-github/QLKH.git)

Ứng dụng đã đóng gói nằm trong folder /QLKH/QLKH-jar

Ứng dụng Quản lý kho hàng cung cấp các dịch vụ:
 - `Đăng ký`, `Đăng nhập` và `Quản lý Tài khoản`
 - `Xem`, `Thêm`, `Sửa`, `Xóa` sản phẩm
 - `Sắp xếp` và `Tìm kiếm` sản phẩm theo các tiêu chí
 - `Thống kê` và `Biểu đồ hóa` dữ liệu kho hàng

## Tên ứng dụng

QUẢN LÝ KHO HÀNG

## Tài khoản

Tài khoản `admin`

- Tên tài khoản : admin

- Mật khẩu: admin123

Tài khoản `đọc và ghi`

- Tên tài khoản: manager1

- Mật khẩu: manager123

Tài khoản `chỉ đọc`

- Tên tài khoản: client1

- Mật khẩu: client123

Tài khoản `chưa cấp quyền`

- Tên tài khoản: client3

- Mật khẩu: client123

## Chức năng

#### Đăng ký, Đăng nhập và Quản lý Tài khoản

Đăng ký

![App Screenshot](https://i.ibb.co/9T0m9Pj/Screenshot-2024-04-19-140627.png)

- `Tên tài khoản` : Kiểu dữ liệu String, không trùng lặp, dài từ 5 - 15 ký tự và không chứa ký tự đặc biệt. Dữ liệu đầu vào được kiểm tra định dạng bằng biểu thức chính quy và hiển thị thông báo cho người dùng nếu tên tài khoản không hợp lệ.

- `Mật khẩu` : Kiểu dữ liệu String, không ngắn hơn 8 ký tự, chứa đồng thời ký tự số và chữ cái. Dữ liệu đầu vào được kiểm tra định dạng bằng biểu thức chính quy và hiển thị thông cho người dùng nếu mật khẩu không hợp lệ, mật khẩu được băm bằng hàm băm MD5 trước khi lưu vào cơ sở dữ liệu.

- `Nhập lại mật khẩu` : So khớp với trường `Mật khẩu` và thông báo cho người dùng nếu 2 trường không giống nhau.

Đăng nhập

![App Screenshot](https://i.ibb.co/BNcfJ0P/Screenshot-2024-04-19-135406.png)

Quản lý Tài khoản

![App Screenshot](https://i.ibb.co/txBcvBD/Screenshot-2024-05-02-201925.png)

- Cho phép người dùng `admin` quản lý và phân quyền cho các tài khoản trong hệ thống

Tài khoản gồm các mức quyền:

- `admin` : Tài khoản có quyền cao nhất

- `đọc và ghi` : Tài khoản được phép xem và sửa dữ liệu kho hàng

- `chỉ đọc` : Tài khoản chỉ được phép xem dữ liệu kho hàng

- `chưa cấp quyền` : Tài khoản không được xem và sửa dữ liệu kho hàng

#### Xem, Thêm, Sửa và Xóa thông tin sản phẩm

![App Screenshot](https://i.ibb.co/x77wwqz/Screenshot-2024-05-02-202452.png)

![App Screenshot](https://i.ibb.co/TvL52M2/Screenshot-2024-05-02-202505.png)

![App Screenshot](https://i.ibb.co/hVh0yF4/Screenshot-2024-05-02-202521.png)

- `Mã số` : Kiểu dữ liệu String, không trùng lặp, không được để trống,  không dài hơn 9 ký tự, chỉ gồm ký tự số và chữ cái. Dữ liệu đầu vào được kiểm tra định dạng bằng biểu thức chính quy và thông báo cho người dùng nếu mã số không hợp lệ.

- `Tên sản phẩm` : Kiểu dữ liệu String, không trùng lặp, không được để trống.

- `Danh mục`: Hiển thị đối tương JCombobox cho phép người dùng chọn danh mục phân loại sản phẩm.

- `Số lượng` : Kiểu dữ liệu int, không nhỏ hơn 0, không được để trống. Dữ liệu đầu vào được kiểm tra định dạng bằng biểu thức chính quy và thông báo cho người dùng nếu số lượng không hợp lệ.

- `Đơn giá` : Kiểu dữ liệu BigDecimal, không nhỏ hơn 0, không được để trống. Dữ liệu đầu vào được kiểm tra định dạng bằng biểu thức chính quy và thông báo cho người dùng nếu đơn giá không hợp lệ.

- `Hạn sử dụng` : Hiển thị đối tượng JDateChooser cho phép người dùng chọn hạn sử dụng cho sản phẩm, không được để trống. Dữ liệu đầu vào được kiểm tra và thông báo cho người dùng nếu dữ liệu đầu vào không hợp lệ.

- `Nhà sản xuẩt` : Kiểu dữ liệu String, không được để trống.

- `Ảnh minh họa` : Hiện thị đối tượng JFileChooser cho phép chọn ảnh minh họa cho sản phẩm, có thể để trống.

- `Mô tả` : Kiểu dữ liệu String, có thể để trống.

#### Sắp xếp và Tìm kiếm theo các tiêu chí

- Sắp xếp theo các tiêu chí: `Mã số`, `Tên sản phẩm`, `Số lượng tăng`, `Số lượng giảm`, `Đơn giá tăng`, `Đơn giá giảm`, `Hạn sử dụng`

- Tìm kiếm theo các tiêu chí: `Mã số`, `Tên sản phẩm`, `Danh mục`,  `Đơn giá`, `Hạn sử dụng`, `Nhà sản xuất`

#### Thống kê

![App Screenshot](https://i.ibb.co/2t4J0xh/Screenshot-2024-05-02-202839.png)

- Thống kê tổng số sản phẩm, số lượng sản phẩm, tổng số danh mục và tổng số nhà sản xuất

- Biểu đồ hóa dữ liệu kho hàng

## Hướng dẫn sử dụng

Demo ứng dụng và hướng dẫn sử dụng xem tại:

https://youtu.be/85UP5CFe_bs