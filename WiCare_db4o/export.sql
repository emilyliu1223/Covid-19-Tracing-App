--------------------------------------------------------
--  File created - Monday-April-20-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence ID_NUM
--------------------------------------------------------

   CREATE SEQUENCE  "ADMINISTRATOR"."ID_NUM"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 2060 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Table PEOPLE
--------------------------------------------------------

  CREATE TABLE "ADMINISTRATOR"."PEOPLE" 
   (	"ID" VARCHAR2(20 BYTE) COLLATE "USING_NLS_COMP", 
	"NAME" VARCHAR2(100 BYTE) COLLATE "USING_NLS_COMP", 
	"ADDRESS" VARCHAR2(100 BYTE) COLLATE "USING_NLS_COMP", 
	"PHONE" VARCHAR2(20 BYTE) COLLATE "USING_NLS_COMP", 
	"STATE" VARCHAR2(50 BYTE) COLLATE "USING_NLS_COMP", 
	"COUNTY" VARCHAR2(50 BYTE) COLLATE "USING_NLS_COMP", 
	"BIRTHDATE" DATE, 
	"AGE" NUMBER, 
	"GENDER" VARCHAR2(20 BYTE) COLLATE "USING_NLS_COMP", 
	"PICTURE" VARCHAR2(100 BYTE) COLLATE "USING_NLS_COMP"
   )  DEFAULT COLLATION "USING_NLS_COMP" SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table STATE
--------------------------------------------------------

  CREATE TABLE "ADMINISTRATOR"."STATE" 
   (	"STATE_NAME" VARCHAR2(20 BYTE) COLLATE "USING_NLS_COMP"
   )  DEFAULT COLLATION "USING_NLS_COMP" SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into ADMINISTRATOR.PEOPLE
SET DEFINE OFF;
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1160','Jamima Dumbellow','707 Crowley Junction','901-644-0051','Tennessee','38168',to_date('07-JAN-81','DD-MON-RR'),39,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data1.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1161','Anabel Dineen','13552 Brentwood Avenue','971-564-0724','Oregon','97255',to_date('31-AUG-46','DD-MON-RR'),74,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data2.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1162','Loise Seller','4678 Buell Drive','941-124-8804','Florida','34108',to_date('06-OCT-83','DD-MON-RR'),37,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data3.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1163','Allister Gronauer','0382 Bellgrove Park','234-358-6868','Ohio','44720',to_date('15-MAR-87','DD-MON-RR'),33,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data4.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1164','Ethelred Fforde','67543 Straubel Circle','203-695-6781','Connecticut','06538',to_date('17-NOV-41','DD-MON-RR'),78,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data5.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1165','Augy Lello','39486 International Street','419-883-7349','Ohio','44905',to_date('21-JAN-86','DD-MON-RR'),34,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data6.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1166','Angelle Skoate','9 Park Meadow Parkway','412-983-7219','Pennsylvania','15220',to_date('28-SEP-34','DD-MON-RR'),86,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data7.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1167','Gillan Peters','51 Texas Drive','412-461-8152','Pennsylvania','15286',to_date('13-JUN-00','DD-MON-RR'),20,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data8.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1168','Debbi Glentworth','35 Cardinal Street','727-665-0724','Florida','34615',to_date('13-OCT-31','DD-MON-RR'),89,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data9.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1169','Lonnard Drake','4 Hanover Terrace','513-491-4380','Ohio','45271',to_date('04-JAN-42','DD-MON-RR'),78,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data10.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1170','Karissa Dryden','4 Tomscot Place','209-616-7900','California','94544',to_date('29-SEP-51','DD-MON-RR'),69,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data11.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1171','Zsazsa Benedito','35 Schiller Way','713-979-5940','Texas','77201',to_date('14-APR-74','DD-MON-RR'),46,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data12.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1172','Ailis Knatt','93 Lien Pass','757-277-0258','Virginia','23509',to_date('20-DEC-35','DD-MON-RR'),84,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data13.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1173','Herbie Fulks','3597 Knutson Drive','865-360-4377','Tennessee','37919',to_date('12-DEC-11','DD-MON-RR'),8,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data14.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1174','Jammie Pinching','832 Manufacturers Trail','919-233-7534','North Carolina','27621',to_date('26-AUG-83','DD-MON-RR'),37,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data15.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1175','Sammy Henrichsen','35441 Hermina Lane','973-551-8134','New Jersey','07505',to_date('28-SEP-12','DD-MON-RR'),8,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data16.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1176','Sheelagh Mayfield','7364 Rigney Avenue','727-979-9683','Florida','33737',to_date('14-FEB-99','DD-MON-RR'),21,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data17.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1177','Shermy Dunlea','25418 Nobel Pass','858-599-1190','California','92668',to_date('15-MAY-39','DD-MON-RR'),81,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data18.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1179','Enrico Brunner','10746 Michigan Avenue','952-125-8054','Minnesota','55564',to_date('06-MAY-88','DD-MON-RR'),32,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data20.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1180','Mikey Leason','2 Duke Alley','617-257-4919','Massachusetts','02124',to_date('04-NOV-52','DD-MON-RR'),67,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data21.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1181','Bambie Mellody','3440 Michigan Center','602-911-9797','Arizona','85099',to_date('26-FEB-75','DD-MON-RR'),45,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data22.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1182','Flin Tym','56 Anniversary Lane','415-114-7758','California','94169',to_date('05-MAY-55','DD-MON-RR'),65,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data23.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1183','Scottie Chippendale','562 Comanche Crossing','609-382-4124','New Jersey','08650',to_date('15-AUG-83','DD-MON-RR'),37,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data24.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1184','Coleen Kesper','7665 Charing Cross Street','337-102-2311','Louisiana','70616',to_date('24-DEC-00','DD-MON-RR'),19,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data25.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1186','Ced Alpin','210 Oneill Drive','352-692-0223','Florida','34479',to_date('02-AUG-65','DD-MON-RR'),55,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data27.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1187','Bryce Beteriss','53 Fieldstone Place','786-107-6962','Florida','33245',to_date('12-NOV-94','DD-MON-RR'),25,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data28.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1188','Redford Gerren','6 Fremont Park','813-915-2964','Florida','33620',to_date('16-JUL-44','DD-MON-RR'),76,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data29.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1189','Maryjane Thornham','5910 Farragut Center','970-213-4025','Colorado','81505',to_date('20-JAN-70','DD-MON-RR'),50,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data30.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1190','Monro Ranking','77497 Mariners Cove Avenue','202-138-5774','District of Columbia','20420',to_date('23-DEC-41','DD-MON-RR'),78,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data31.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1192','Feodor Bastow','19262 Rowland Pass','903-312-5168','Texas','75705',to_date('24-JUL-12','DD-MON-RR'),8,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data33.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1193','Kermy Howard','8 Helena Plaza','239-122-6006','Florida','34114',to_date('03-MAR-70','DD-MON-RR'),50,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data34.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1194','Giacinta Autie','40 Monument Parkway','617-506-4833','Massachusetts','02298',to_date('01-AUG-38','DD-MON-RR'),82,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data35.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1195','Arleen Cisland','12 Russell Drive','619-638-7977','California','92186',to_date('25-APR-61','DD-MON-RR'),59,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data36.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1197','Cord Velez','91760 Kinsman Junction','309-716-3835','Illinois','61640',to_date('01-JAN-06','DD-MON-RR'),14,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data38.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1198','Maxine Ricardou','0099 Derek Street','513-133-8497','Ohio','45271',to_date('06-OCT-30','DD-MON-RR'),90,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data39.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1201','Kelwin Sichardt','35008 Rusk Center','215-400-1231','Pennsylvania','19125',to_date('24-JUN-87','DD-MON-RR'),33,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data42.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1202','Marketa Scurrah','44728 Mendota Alley','720-131-2979','Colorado','80299',to_date('21-JUN-87','DD-MON-RR'),33,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data43.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1204','Curtice Desbrow','8805 Bunker Hill Parkway','217-488-5733','Illinois','62794',to_date('04-SEP-48','DD-MON-RR'),72,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data45.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1206','Bridget Cortez','49 Bartillon Park','402-403-7789','Nebraska','68517',to_date('05-JUL-60','DD-MON-RR'),60,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data47.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1208','Beulah Bromby','91 Badeau Pass','202-590-7423','District of Columbia','20530',to_date('29-APR-34','DD-MON-RR'),86,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data49.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1209','Nicolais Delia','86898 Buhler Parkway','213-472-9664','California','90030',to_date('22-SEP-71','DD-MON-RR'),49,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data50.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1212','Mariellen Scripps','5 Larry Terrace','571-564-4950','Virginia','22212',to_date('16-MAR-49','DD-MON-RR'),71,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data53.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1213','Ferguson Joubert','516 Onsgard Hill','816-732-9676','Missouri','64125',to_date('31-DEC-11','DD-MON-RR'),8,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data54.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1216','Emmalynn Copley','8880 Oak Pass','716-686-0619','New York','14210',to_date('11-JAN-87','DD-MON-RR'),33,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data57.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1217','Stacee Priestley','6517 Ronald Regan Avenue','785-272-4921','Kansas','66611',to_date('06-AUG-52','DD-MON-RR'),68,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data58.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1218','Sully Kanwell','663 Oxford Court','214-611-9838','Texas','75216',to_date('07-JUL-10','DD-MON-RR'),10,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data59.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1214','Saunderson Belfelt','425 Onsgard Place','574-990-0481','Indiana','46614',to_date('14-JAN-48','DD-MON-RR'),72,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data55.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1219','Tanner Kelner','5 Bluejay Lane','786-975-4334','Florida','33169',to_date('07-JAN-02','DD-MON-RR'),18,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data60.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1178','Marco Dewer','522 Mallory Alley','412-439-7461','Pennsylvania','15286',to_date('09-JAN-66','DD-MON-RR'),54,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data19.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1199','Stanly Boxall','9363 Karstens Place','202-525-6247','District of Columbia','20414',to_date('13-AUG-41','DD-MON-RR'),79,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data40.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1185','Lib Tremblet','625 Butterfield Street','540-915-2176','Virginia','24009',to_date('02-FEB-41','DD-MON-RR'),79,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data26.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1191','Zonda Wheildon','27231 Dayton Circle','425-524-5427','Washington','98115',to_date('26-JUL-30','DD-MON-RR'),90,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data32.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1196','Bart Harrap','645 Elmside Point','937-294-1011','Ohio','45505',to_date('21-JUL-87','DD-MON-RR'),33,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data37.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1200','Nicolette Betts','1130 Brickson Park Parkway','520-147-7613','Arizona','85748',to_date('07-JUN-06','DD-MON-RR'),14,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data41.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1205','Melosa Studdal','73100 Hallows Circle','205-485-0184','Alabama','35231',to_date('03-SEP-02','DD-MON-RR'),18,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data46.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1210','Care Drowsfield','1 Lotheville Court','352-912-4476','Florida','32627',to_date('30-MAY-71','DD-MON-RR'),49,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data51.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1215','Fernandina Cullinan','728 Farwell Alley','510-271-6602','California','94622',to_date('18-MAR-97','DD-MON-RR'),23,'Female','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data56.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1220','Tildy Van Niekerk','14132 Hanover Lane','919-580-9970','North Carolina','27635',to_date('18-NOV-41','DD-MON-RR'),78,'Female','//Users/stacyhuang/twoGirls/db4odemo/picture data60.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1203','Gage Gosneye','170 Holmberg Point','304-131-9771','West Virginia','25305',to_date('08-JAN-31','DD-MON-RR'),89,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data44.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1207','Hayyim Nozzolii','708 Warrior Terrace','941-937-0415','Florida','34290',to_date('15-JUL-48','DD-MON-RR'),72,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data48.jpg');
Insert into ADMINISTRATOR.PEOPLE (ID,NAME,ADDRESS,PHONE,STATE,COUNTY,BIRTHDATE,AGE,GENDER,PICTURE) values ('1211','Garvy Hedderly','896 Hauk Park','571-911-6440','Virginia','20189',to_date('18-NOV-98','DD-MON-RR'),21,'Male','//Users/stacyhuang/twoGirls/WiCare_db4o/picture data52.jpg');
REM INSERTING into ADMINISTRATOR.STATE
SET DEFINE OFF;
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Georgia');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Delaware');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Michigan');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Florida');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Louisiana');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Idaho');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('North Dakota');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Tennessee');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Pennsylvania');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Indiana');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Kentucky');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Nevada');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('South Dakota');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Oregon');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('California');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('North Carolina');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Arizona');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Colorado');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Nebraska');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Mississippi');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Virginia');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Washington');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Illinois');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Arkansas');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Maryland');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('New Hampshire');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Connecticut');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Texas');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Minnesota');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('West Virginia');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Alabama');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('New York');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Iowa');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Oklahoma');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Utah');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('South Carolina');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('New Jersey');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Kansas');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Montana');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Vermont');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Ohio');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Massachusetts');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('District of Columbia');
Insert into ADMINISTRATOR.STATE (STATE_NAME) values ('Missouri');
--------------------------------------------------------
--  DDL for Index STATE_UNIQUE
--------------------------------------------------------

  CREATE UNIQUE INDEX "ADMINISTRATOR"."STATE_UNIQUE" ON "ADMINISTRATOR"."STATE" ("STATE_NAME") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table STATE
--------------------------------------------------------

  ALTER TABLE "ADMINISTRATOR"."STATE" ADD CONSTRAINT "STATE_UNIQUE" UNIQUE ("STATE_NAME")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PEOPLE
--------------------------------------------------------

  ALTER TABLE "ADMINISTRATOR"."PEOPLE" ADD CONSTRAINT "GENDER_CHECK" CHECK (gender in ('Male','Female')) ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PEOPLE
--------------------------------------------------------

  ALTER TABLE "ADMINISTRATOR"."PEOPLE" ADD CONSTRAINT "STATE_CONTRAINT" FOREIGN KEY ("STATE")
	  REFERENCES "ADMINISTRATOR"."STATE" ("STATE_NAME") ENABLE;
