
--
-- Table structure for table `cakeclassinfo`
--
create database bekdb DEFAULT CHARSET=utf8mb4 ;
use bekdb;


DROP TABLE IF EXISTS `cakeclassinfo`;
CREATE TABLE `cakeclassinfo` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `classname` varchar(50) NOT NULL COMMENT '蛋糕分类名称',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifytime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='蛋糕分类信息表';

--
-- Dumping data for table `cakeclassinfo`
--

LOCK TABLES `cakeclassinfo` WRITE;
INSERT INTO `cakeclassinfo` VALUES (1,'经典','2022-05-23 10:19:00',NULL),(2,'女神','2022-05-23 10:19:38',NULL),(3,'全球购','2022-05-23 10:19:51',NULL),(4,'零食','2022-05-23 10:20:03',NULL),(5,'其他','2022-05-23 10:20:15',NULL);
UNLOCK TABLES;

--
-- Table structure for table `cakeinfo`
--

DROP TABLE IF EXISTS `cakeinfo`;
CREATE TABLE `cakeinfo` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cakename` varchar(50) NOT NULL COMMENT '蛋糕名称',
  `introduce` varchar(255) NOT NULL COMMENT '蛋糕介绍',
  `brand` varchar(50) DEFAULT NULL COMMENT '蛋糕品牌',
  `cakepic` varchar(255) NOT NULL COMMENT '蛋糕图片',
  `cakedetailpic` varchar(255) DEFAULT NULL COMMENT '蛋糕详情图片',
  `cakeclassid` int NOT NULL COMMENT '蛋糕分类id',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifytime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4 COMMENT='蛋糕信息表';

--
-- Dumping data for table `cakeinfo`
--

LOCK TABLES `cakeinfo` WRITE;
INSERT INTO `cakeinfo` VALUES (1,'美刀多',' 鸡蛋、奶油、小麦粉、芒果、榴莲肉、巧克力、干酪','幸福西饼','images/1.png','cakeinfoDetailImages/1.png',1,'2022-05-23 11:08:11',NULL),(2,'小沙皮',' 鸡蛋、奶油、小麦粉、芒果、榴莲肉、巧克力、干酪','幸福西饼','images/2.png','cakeinfoDetailImages/2.png',1,'2022-05-23 11:08:16',NULL),(3,'芒来芒趣','动物奶油，白砂糖，华夫脆，碱水饼干，火龙果，芒果，金莎巧克力','熊猫不走','images/3.png','cakeinfoDetailImages/3.png',2,NULL,NULL),(4,'兔小萌',' 鸡蛋、奶油、小麦粉、芒果、榴莲肉、巧克力、干酪','幸福西饼','images/4.png','cakeinfoDetailImages/4.png',2,NULL,NULL),(5,'茶色生香',' 鸡蛋、奶油、小麦粉、芒果、榴莲肉、巧克力、干酪','熊猫不走','images/5.png','cakeinfoDetailImages/5.png',3,NULL,NULL),(6,'旺旺旺',' 鸡蛋、奶油、小麦粉、芒果、榴莲肉、巧克力、干酪','幸福西饼','images/6.png','cakeinfoDetailImages/6.png',3,NULL,NULL),(7,'踏雪寻梅',' 鸡蛋、奶油、小麦粉、芒果、榴莲肉、巧克力、干酪','熊猫不走','images/7.png','cakeinfoDetailImages/7.png',4,NULL,NULL),(8,'新公爵提拉米苏',' 鸡蛋、奶油、小麦粉、芒果、榴莲肉、巧克力、干酪','幸福西饼','images/8.png','cakeinfoDetailImages/8.png',4,NULL,NULL),(9,'金色榴莲',' 鸡蛋、奶油、小麦粉、芒果、榴莲肉、巧克力、干酪','幸福西饼','images/9.png','cakeinfoDetailImages/9.png',5,NULL,NULL),(10,'黑白配',' 鸡蛋、奶油、小麦粉、芒果、榴莲肉、巧克力、干酪','熊猫不走','images/10.png','cakeinfoDetailImages/10.png',5,NULL,NULL);
UNLOCK TABLES;

--
-- Table structure for table `cakescaleinfo`
--

DROP TABLE IF EXISTS `cakescaleinfo`;
CREATE TABLE `cakescaleinfo` (
  `cakeid` int NOT NULL COMMENT '蛋糕id',
  `scaleid` int NOT NULL COMMENT '蛋糕规格id',
  `price` double NOT NULL COMMENT '蛋糕价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifytime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`cakeid`,`scaleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='蛋糕信息表和蛋糕规格信息表的中间表';

--
-- Dumping data for table `cakescaleinfo`
--

LOCK TABLES `cakescaleinfo` WRITE;
INSERT INTO `cakescaleinfo` VALUES (1,1,188,NULL,NULL),(1,2,218,NULL,NULL),(2,1,128,NULL,NULL),(2,4,555,NULL,NULL),(3,1,133,NULL,NULL),(3,2,266,NULL,NULL),(4,3,199,NULL,NULL),(5,4,288,NULL,NULL),(6,5,388,NULL,NULL),(7,1,223,NULL,NULL),(8,1,266,NULL,NULL),(9,1,233,NULL,NULL),(10,1,66,NULL,NULL);
UNLOCK TABLES;

--
-- Table structure for table `linkuserinfo`
--

DROP TABLE IF EXISTS `linkuserinfo`;
CREATE TABLE `linkuserinfo` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `linkusername` varchar(25) NOT NULL COMMENT '收件人姓名',
  `phone` varchar(20) NOT NULL COMMENT '收件人手机号',
  `address` varchar(255) NOT NULL COMMENT '收件人地址',
  `userid` int NOT NULL COMMENT '用户id',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifytime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COMMENT='收货人信息表';
--
-- Dumping data for table `linkuserinfo`
--

LOCK TABLES `linkuserinfo` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `orderdetail`
--

DROP TABLE IF EXISTS `orderdetail`;
CREATE TABLE `orderdetail` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `orderno` varchar(255) NOT NULL COMMENT '订单编号',
  `cakecounts` int NOT NULL COMMENT '蛋糕数量',
  `size` int NOT NULL COMMENT '蛋糕尺寸',
  `price` double NOT NULL COMMENT '蛋糕单价',
  `cakeid` int NOT NULL COMMENT '蛋糕id',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifytime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COMMENT='订单明细表';

LOCK TABLES `orderdetail` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `orderno` varchar(255) NOT NULL COMMENT '订单编号',
  `tradeno` varchar(255) DEFAULT NULL COMMENT '交易编号',
  `status` int NOT NULL COMMENT '订单状态（0:待支付、1:已支付、2:已取消 ）',
  `payamount` double NOT NULL COMMENT '支付金额',
  `linkuserid` int NOT NULL COMMENT '收货人id',
  `userid` int NOT NULL COMMENT '用户id',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifytime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderno` (`orderno`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COMMENT='订单信息表';


--
-- Table structure for table `scaleinfo`
--

DROP TABLE IF EXISTS `scaleinfo`;
CREATE TABLE `scaleinfo` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `size` int NOT NULL COMMENT '蛋糕尺寸（单位：磅）',
  `sharenumber` varchar(200) NOT NULL COMMENT '适合分享的人数',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifytime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COMMENT='蛋糕规格信息表';

--
-- Dumping data for table `scaleinfo`
--

LOCK TABLES `scaleinfo` WRITE;
INSERT INTO `scaleinfo` VALUES (1,1,'适合1-2个人','2022-05-23 11:41:42',NULL),(2,2,'适合2-3个人','2022-05-23 11:41:45',NULL),(3,3,'适合3-4个人','2022-05-23 11:41:49',NULL),(4,4,'适合 4-5个人','2022-05-23 11:34:46',NULL),(5,5,'适合 6-10 个人','2022-05-23 11:35:49',NULL);
UNLOCK TABLES;

--
-- Table structure for table `userinfo`
--

DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(25) NOT NULL COMMENT '用户名',
  `usernickname` varchar(25) NOT NULL COMMENT '用户昵称',
  `password` varchar(25) NOT NULL COMMENT '用户密码',
  `sex` char(2) NOT NULL COMMENT '用户性别（0:男、1:女）',
  `phone` varchar(20) DEFAULT NULL COMMENT '用户手机号',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifytime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';


--
-- Dumping data for table `userinfo`
--

LOCK TABLES `userinfo` WRITE;
UNLOCK TABLES;
