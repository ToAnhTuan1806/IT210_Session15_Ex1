Phần 1:
Sai sót 1:
Dùng LessThan (<) thay vì LessThanEqual (<=) nên các sản phẩm có giá đúng bằng maxPrice không được trả về
Ví dụ:
Sản phẩm: (iPhone 11, Điện thoại, 10000000, stock = 5)
Tìm với maxPrice = 10000000 → không trả về → sai

Sai sót 2:
Thiếu điều kiện stockQuantity > 0 nên các sản phẩm hết hàng vẫn xuất hiện trong kết quả
Ví dụ:
Sản phẩm: (Samsung A50, Điện thoại, 9000000, stock = 0)
Tìm với maxPrice = 10000000 → vẫn trả về → sai