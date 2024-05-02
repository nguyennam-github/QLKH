
# Ứng dụng Quản lý kho hàng

Ứng dụng Quản lý kho hàng cung cấp các dịch vụ:
 - `Đăng ký`, `Đăng nhập` và `Quản lý Tài khoản`
 - `Xem`, `Thêm`, `Sửa`, `Xóa` sản phẩm
 - `Sắp xếp` và `Tìm kiếm` sản phẩm theo các tiêu chí
 - `Thống kê` và `Biểu đồ hóa` dữ liệu kho hàng

## Mô tả ứng dụng

### Tên ứng dụng

Quản lý kho hàng

### Tài khoản

Tài khoản admin

- Tên tài khoản : admin

- Mật khẩu: admin123

Tài khoản đọc và ghi

- Tên tài khoản: manager1

- Mật khẩu: manager123

Tài khoản chỉ đọc

- Tên tài khoản: client1

- Mật khẩu: client123

### Chức năng

#### Đăng ký, Đăng nhập và Quản lý Tài khoản

- Đăng ký

`Tên tài khoản` : Duy nhất, không trùng lặp, kiểu dữ liệu String, dài từ 5 - 15 ký tự và không chứa ký tự đặc biệt, dữ liệu đầu vào được kiểm tra định đang bằng biểu thức chính quy và hiển thị gợi ý cho người dùng nếu tên tài khoản không hợp lệ

`Mật khẩu` : Kiểu dữ liệu String, không ngắn hơn 8 ký tự, đồng thời chứa ký tự số và chữ cái, dữ liệu đầu vào được kiểm tra định đang bằng biểu thức chính quy và hiển thị gợi ý cho người dùng nếu mật khẩu không hợp lệ, mật khẩu được băm bằng hàm băm MD5 trước khi lưu vào cơ sở dữ liệu

`Nhập lại mật khẩu` : Ứng dụng thực hiện so khớp với trường `Mật khẩu` và thông báo cho người dùng nếu 2 trường không trùng nhau

- Quản lý Tài khoản

Cho phép người dùng admin quản lý và phân quyền cho các tài khoản trong hệ thống

Tài khoản gồm các mức quyền:

`admin` : tài khoản cao nhất

`đọc và ghi` : tài khoản được phép xem và sửa dữ liệu kho hàng

`chỉ đọc` : tài khoản chỉ được phép xem dữ liệu kho hàng

`chưa cấp quyền` : tài khoản không được xem và sửa dữ liệu kho hàng

#### Xem, Thêm, sửa, Xóa thông tin sản phẩm

`Mã số` : Duy nhất, không trùng lặp, không được để trống, kiểu dữ liệu String, không dài hơn 9 ký tự, chỉ gồm ký tự chữ cái và ký tự số, dữ liệu đầu vào được kiểm tra bằng biểu thức chính quy.

`Tên sản phẩm` : Duy nhất, không trùng lặp, không được để trống, kiểu dữ liệu String.

`Danh mục`: Đối tương JCombobox cho phép chọn danh mục phân loại sản phẩm

`Số lượng` : Không được để trống, kiểu dữ liệu int, dữ liệu đầu vào được kiểm tra bằng biểu thức chính quy và hiển thị gợi ý cho người dùng nếu định dạng dữ liệu đầu vào không hợp lệ

`Đơn giá` : Không được để trống, kiểu dữ liệu BigDecimal, dữ liệu đầu vào được kiểm tra bằng biểu thức chính quy và hiển thị gợi ý cho người dùng nếu định dạng dữ liệu đầu vào không hợp lệ

`Hạn sử dụng` : Đối tượng JDateChooser cho phép người dùng chọn hạn sử dụng cho sản phẩm, không được để trống, dữ liệu đầu vào được kiểm tra và hiển thị gợi ý cho người dùng nếu dữ liệu đầu vào không hợp lệ

`Nhà sản xuẩt` : Không được để trống, kiểu dữ liệu String

`Ảnh minh họa` : Đối tượng JFileChooser cho phép chọn ảnh minh họa cho sản phẩm

`Mô tả` : Kiểu dữ liệu String

#### Sắp xếp, tìm kiếm theo các tiêu chí

Sắp xếp theo:
 
- Mã số

- Tên sản phẩm

- Số lượng tăng

- Số lượng giảm

- Đơn giá tăng

- Đơn giá giảm

- Hạn sử dụng

Tìm kiếm theo:

- Mã số

- Tên sản phẩm

- Danh mục

- Đơn giá

- Hạn sử dụng

- Nhà sản xuất

#### Thống kê

Thống kê tổng số sản phẩm, số lượng sản phẩm, tổng số danh mục và tổng số nhà sản xuất

Biểu đồ hóa dữ liệu kho hàng

## Hướng dẫn sử dụng

Demo ứng dụng và hướng dẫn sử dụng xem tại:

https://youtu.be/W4rbMaeNBAI