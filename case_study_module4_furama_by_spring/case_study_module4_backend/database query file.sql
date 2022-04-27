INSERT INTO `case_study_module4_furama_by_spring`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('1', 'Diamond');
INSERT INTO `case_study_module4_furama_by_spring`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('2', 'Platinium');
INSERT INTO `case_study_module4_furama_by_spring`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('3', 'Gold');
INSERT INTO `case_study_module4_furama_by_spring`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('4', 'Silver');
INSERT INTO `case_study_module4_furama_by_spring`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('5', 'Member');


insert into customer(customer_id,`active`,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id)

values (1,b'1', 'Nguyễn Thị Hào', '1970-11-07', 0,'643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng',5),
(2,b'1', 'Phạm Xuân Diệu', '1992-08-08', 1,'865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị',3),
(3,b'1', 'Trương Đình Nghệ', '1990-02-27', 1,'488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh',1),
(4,b'1', 'Dương Văn Quan', '1981-07-08', 1,'543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng',1),
(5,b'1', 'Hoàng Trần Nhi Nhi', '1995-12-09', 0,'795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai',4),
(6,b'1', 'Tôn Nữ Mộc Châu', '2005-12-06', 0,'732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng',4),
(7,b'1', 'Nguyễn Mỹ Kim', '1984-04-08', 0,'856453123','0912345698','kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh',1),
(8,b'1', 'Nguyễn Thị Hào', '1999-04-08', 0,'965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum',3),
(9,b'1', 'Trần Đại Danh', '1989-07-01', 1,'432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi',1),
(10,b'1', 'Nguyễn Tâm Đắc', '1989-07-01',1,'344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng',2);


INSERT INTO `case_study_module4_furama_by_spring`.`position` (`position_id`, `position_name`) VALUES ('1', 'Quản Lý');
INSERT INTO `case_study_module4_furama_by_spring`.`position` (`position_id`, `position_name`) VALUES ('2', 'Nhân Viên');


INSERT INTO `case_study_module4_furama_by_spring`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('1', 'Trung Cấp');
INSERT INTO `case_study_module4_furama_by_spring`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('2', 'Cao Đẳng');
INSERT INTO `case_study_module4_furama_by_spring`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('3', 'Đại Học');
INSERT INTO `case_study_module4_furama_by_spring`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('4', 'Sau Đại Học');

INSERT INTO `case_study_module4_furama_by_spring`.`division` (`division_id`, `division_name`) VALUES ('1', 'Sale-Marketing');
INSERT INTO `case_study_module4_furama_by_spring`.`division` (`division_id`, `division_name`) VALUES ('2', 'Hành chính');
INSERT INTO `case_study_module4_furama_by_spring`.`division` (`division_id`, `division_name`) VALUES ('3', 'Phục vụ');
INSERT INTO `case_study_module4_furama_by_spring`.`division` (`division_id`, `division_name`) VALUES ('4', 'Quản lý');


INSERT INTO `case_study_module4_furama_by_spring`.`app_user` (`user_name`, `encryted_password`) VALUES ('a', 'a');
INSERT INTO `case_study_module4_furama_by_spring`.`app_user` (`user_name`, `encryted_password`) VALUES ('b', 'b');
INSERT INTO `case_study_module4_furama_by_spring`.`app_user` (`user_name`, `encryted_password`) VALUES ('c', 'c');
INSERT INTO `case_study_module4_furama_by_spring`.`app_user` (`user_name`, `encryted_password`) VALUES ('d', 'd');
INSERT INTO `case_study_module4_furama_by_spring`.`app_user` (`user_name`, `encryted_password`) VALUES ('e', 'e');
INSERT INTO `case_study_module4_furama_by_spring`.`app_user` (`user_name`, `encryted_password`) VALUES ('f', 'f');
INSERT INTO `case_study_module4_furama_by_spring`.`app_user` (`user_name`, `encryted_password`) VALUES ('g', 'g');
INSERT INTO `case_study_module4_furama_by_spring`.`app_user` (`user_name`, `encryted_password`) VALUES ('h', 'h');
INSERT INTO `case_study_module4_furama_by_spring`.`app_user` (`user_name`, `encryted_password`) VALUES ('i', 'i');
INSERT INTO `case_study_module4_furama_by_spring`.`app_user` (`user_name`, `encryted_password`) VALUES ('k', 'k');


-- add employee 

INSERT INTO `case_study_module4_furama_by_spring`.`employee` (`employee_id`,`active`, `employee_address`, `employee_birthday`, `employee_email`, `employee_id_card`, `employee_name`, `employee_phone`, `employee_salary`, `app_user`, `division_id`, `education_degree_id`, `position_id`) VALUES ('1',b'1', '295 Nguyễn Tất Thành, Đà Nẵng', '1970-11-07', 'annguyen@gmail.com', '456231786', 'Nguyễn Văn An', '0901234121', '10000000', 'a', '1', '3', '1');
INSERT INTO `case_study_module4_furama_by_spring`.`employee` (`employee_id`,`active`, `employee_address`, `employee_birthday`, `employee_email`, `employee_id_card`, `employee_name`, `employee_phone`, `employee_salary`, `app_user`, `division_id`, `education_degree_id`, `position_id`) VALUES ('2',b'1', '22 Yên Bái, Đà Nẵng', '1997-04-09', 'binhlv@gmail.com', '654231234', 'Lê Văn Bình', '0934212314', '7000000', 'b', '2', '2', '1');
INSERT INTO `case_study_module4_furama_by_spring`.`employee` (`employee_id`,`active`, `employee_address`, `employee_birthday`, `employee_email`, `employee_id_card`, `employee_name`, `employee_phone`, `employee_salary`, `app_user`, `division_id`, `education_degree_id`, `position_id`) VALUES ('3',b'1', 'K234/11 Điện Biên Phủ, Gia Lai', '1995-12-12', 'thiyen@gmail.com', '999231723', 'Hồ Thị Yến', '0412352315', '14000000', 'c', '2', '3', '1');
INSERT INTO `case_study_module4_furama_by_spring`.`employee` (`employee_id`,`active`, `employee_address`, `employee_birthday`, `employee_email`, `employee_id_card`, `employee_name`, `employee_phone`, `employee_salary`, `app_user`, `division_id`, `education_degree_id`, `position_id`) VALUES ('4',b'1', '77 Hoàng Diệu, Quảng Trị', '1980-04-04', 'toan0404@gmail.com', '123231365', 'Võ Công Toản', '0374443232', '17000000', 'd', '4', '4', '1');
INSERT INTO `case_study_module4_furama_by_spring`.`employee` (`employee_id`,`active`, `employee_address`, `employee_birthday`, `employee_email`, `employee_id_card`, `employee_name`, `employee_phone`, `employee_salary`, `app_user`, `division_id`, `education_degree_id`, `position_id`) VALUES ('5',b'1', '43 Yên Bái, Đà Nẵng', '1999-12-09', 'phatphat@gmail.com', '454363232', 'Nguyễn Bỉnh Phát', '0902341231', '6000000', 'e', '1', '1', '2');
INSERT INTO `case_study_module4_furama_by_spring`.`employee` (`employee_id`,`active`, `employee_address`, `employee_birthday`, `employee_email`, `employee_id_card`, `employee_name`, `employee_phone`, `employee_salary`, `app_user`, `division_id`, `education_degree_id`, `position_id`) VALUES ('6',b'1', '294 Nguyễn Tất Thành, Đà Nẵng', '2000-11-08', 'annghi20@gmail.com', '964542311', 'Khúc Nguyễn An Nghi', '0978653213', '7000000', 'f', '3', '2', '2');
INSERT INTO `case_study_module4_furama_by_spring`.`employee` (`employee_id`,`active`, `employee_address`, `employee_birthday`, `employee_email`, `employee_id_card`, `employee_name`, `employee_phone`, `employee_salary`, `app_user`, `division_id`, `education_degree_id`, `position_id`) VALUES ('7',b'1', '4 Nguyễn Chí Thanh, Huế', '1993-01-01', 'nhh0101@gmail.com', '534323231', 'Nguyễn Hữu Hà', '0941234553', '8000000', 'g', '2', '3', '2');
INSERT INTO `case_study_module4_furama_by_spring`.`employee` (`employee_id`,`active`, `employee_address`, `employee_birthday`, `employee_email`, `employee_id_card`, `employee_name`, `employee_phone`, `employee_salary`, `app_user`, `division_id`, `education_degree_id`, `position_id`) VALUES ('8',b'1', '111 Hùng Vương, Hà Nội', '1989-09-03', 'donghanguyen@gmail.com', '234414123', 'Nguyễn Hà Đông', '0642123111', '9000000', 'h', '4', '4', '2');
INSERT INTO `case_study_module4_furama_by_spring`.`employee` (`employee_id`,`active`, `employee_address`, `employee_birthday`, `employee_email`, `employee_id_card`, `employee_name`, `employee_phone`, `employee_salary`, `app_user`, `division_id`, `education_degree_id`, `position_id`) VALUES ('9',b'1', '213 Hàm Nghi, Đà Nẵng', '1982-09-03', 'hoangtong@gmail.com', '256781231', 'Tòng Hoang', '0245144444', '6000000', 'i', '4', '4', '2');
INSERT INTO `case_study_module4_furama_by_spring`.`employee` (`employee_id`,`active`, `employee_address`, `employee_birthday`, `employee_email`, `employee_id_card`, `employee_name`, `employee_phone`, `employee_salary`, `app_user`, `division_id`, `education_degree_id`, `position_id`) VALUES ('10',b'1', '6 Hoà Khánh, Đồng Nai', '1994-01-08', 'nguyencongdao12@gmail.com', '755434343', 'Nguyễn Công Đạo', '0988767111', '8000000', 'k', '2', '3', '2');


-- rent type
INSERT INTO `case_study_module4_furama_by_spring`.`rent_type` (`rent_type_id`, `rent_type_cost`, `rent_type_name`) VALUES ('1', '10000', 'year');
INSERT INTO `case_study_module4_furama_by_spring`.`rent_type` (`rent_type_id`, `rent_type_cost`, `rent_type_name`) VALUES ('2', '1000', 'month');
INSERT INTO `case_study_module4_furama_by_spring`.`rent_type` (`rent_type_id`, `rent_type_cost`, `rent_type_name`) VALUES ('3', '120', 'day');
INSERT INTO `case_study_module4_furama_by_spring`.`rent_type` (`rent_type_id`, `rent_type_cost`, `rent_type_name`) VALUES ('4', '20', 'hour');


-- service type
INSERT INTO `case_study_module4_furama_by_spring`.`service_type` (`service_type_id`, `service_type_name`) VALUES ('1', 'Villa');
INSERT INTO `case_study_module4_furama_by_spring`.`service_type` (`service_type_id`, `service_type_name`) VALUES ('2', 'House');
INSERT INTO `case_study_module4_furama_by_spring`.`service_type` (`service_type_id`, `service_type_name`) VALUES ('3', 'Room');

-- service
INSERT INTO `case_study_module4_furama_by_spring`.`service_entity` (`service_id`,`active`, `description_other_convenience`, `number_of_floors`, `pool_area`, `service_area`, `service_cost`, `service_max_people`, `service_name`, `standard_room`, `rent_type_id`, `service_type_id`) VALUES ('1',b'1', 'Có hồ bơi', '2', '500', '2500', '1000000', '10', 'Villa Beach Front', 'vip', '3', '1');


select customer.customer_name as customerName, service_entity.service_name as serviceName, service_entity.service_cost as serviceCost, contract.contract_deposit as contractDeposit, attach_service.attach_service_name as attachServiceName,attach_service.attach_service_cost as attachServiceCost, contract_detail.quantity as contractDetailQuantity
, ( ifnull(service_entity.service_cost,0) - ifnull(contract.contract_deposit,0) +( ifnull(attach_service.attach_service_cost,0) * ifnull(contract_detail.quantity,0)) ) as totalMoney
from contract
 join customer on customer.customer_id = contract.customer_id
 join service_entity on service_entity.service_id = contract.service_id
 left join contract_detail on contract_detail.contract_id = contract.contract_id
 left join attach_service on attach_service.attach_service_id = contract_detail.attact_service_id;