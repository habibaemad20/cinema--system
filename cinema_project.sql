#create database cinema_system;
#create table information(Name varchar(100), Phone int,Email varchar(100));
#create table booking_details(Name varchar(100),Movie varchar(100),Day varchar(50),Snacks varchar(50),Time varchar(50),Seats varchar(50),Payment varchar(50));
#insert into information values('Habiba Mohkatar',01018394936,'habibamohamed@gmail.com'),('Habiba Emad',01019602995,'habibaemad@gmail.com'),('Jomana Sameh',01110856129,'jo@gmail.com'),('Jana Khaled',01274195540,'janakhaled@gmail.com'),('Jana Mostafa',01021519646,'janamostafa@gmail.com');
#insert into booking_details values('Jomana Sameh','TheConjuring','Tuesday','None','10:30 p.m','A2','Cash'),('Habiba Emad','BladeRunner','Monday','Nachos','4:30 p.m','C3','VodafoneCash'),('Habiba Mohkatar','Barbie','Thursday','Pop Corn','7:00 p.m','A1,C2,B3','Visa'),('Jana Khaled','Wicked:for good','Friday','Nachos','12:00 p.m','A1','Visa'),('Jana Mostafa','SuperMan','Sunday','None','2:00 p.m','B2','Instapay');
#ALTER TABLE information MODIFY Phone VARCHAR(20);
#ALTER TABLE booking_details 
#ADD BookingID INT AUTO_INCREMENT PRIMARY KEY;
select *from booking_details;


#delete from booking_details where name='nada emad';
#delete from booking_details where name='nada';
#delete from booking_details where name='nada mohamed';
#delete from booking_details where name='nada mostafa';
#delete from booking_details where name='Habiba Emad';
#delete from booking_details where name='eman';