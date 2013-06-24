-- Creator:       MySQL Workbench 5.2.47/ExportSQLite plugin 2009.12.02
-- Author:        iStar
-- Caption:       New Model
-- Project:       Name of the project
-- Changed:       2013-06-06 09:37
-- Created:       2013-06-05 21:00
PRAGMA foreign_keys = OFF;

-- Schema: mydb
BEGIN;
CREATE TABLE "party_user"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "userID" VARCHAR(45) NOT NULL,-- 用户ID
  "partyID" VARCHAR(45) NOT NULL-- 活动ID
);
CREATE TABLE "user"(
  "userId" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,-- 用户主键ID
  "userName" VARCHAR(45) NOT NULL,-- 用户名
  "password" VARCHAR(45) NOT NULL,-- 密码
  "phoneNumber" VARCHAR(45),-- 手机号
  "name" VARCHAR(45) NOT NULL,-- 真实姓名
  "email" VARCHAR(45),
  "gender" INTEGER,-- 性别
  "birthday" DATETIME,-- 生日
  "avatarUrl" VARCHAR(100),-- 头像URL
  "registerTime" DATETIME,-- 注册时间
  "isErased" INTEGER DEFAULT 0,
--   是否注销：
--   0 - 未注销
--   1- 已注销
  "erasedTime" DATETIME,-- 注销时间
  "erasePeople" VARCHAR(45),-- 注销人
  CONSTRAINT "user_id_UNIQUE"
    UNIQUE("userId"),
  CONSTRAINT "userName_UNIQUE"
    UNIQUE("userName"),
  CONSTRAINT "password_UNIQUE"
    UNIQUE("password"),
  CONSTRAINT "phoneNumber_UNIQUE"
    UNIQUE("phoneNumber")
);
CREATE TABLE "party"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "partyID" VARCHAR(45) NOT NULL,-- 活动ID
  "name" VARCHAR(45) NOT NULL,-- 活动名称
  "description" VARCHAR(45),-- 活动描述
  "creator" VARCHAR(45) NOT NULL,-- 发起人
  "crateTime" DATETIME NOT NULL,-- 发起时间
  "startTime" DATETIME NOT NULL,-- 开始时间
  "endTime" DATETIME,-- 结束时间
  "partyAddress" VARCHAR(45) NOT NULL,-- 活动地点
  "budget" VARCHAR(45),-- 预算金额（每人）
  "status" INTEGER NOT NULL,
--   活动状态：
--   0-发起未确定
--   1-进行中
--   2-结束
--   3-失效
  "receiveSuccessCount" INTEGER,-- 成功接收消息人数
  "receiveFailedCount" VARCHAR(45),-- 接收消息失败人数
  "isErased" INTEGER DEFAULT 0,
--   是否注销：
--   0 - 未注销
--   1- 已注销
  "erasedTime" DATETIME,
  "erasePeople" VARCHAR(45),
  CONSTRAINT "partyID_UNIQUE"
    UNIQUE("partyID")
);
CREATE TABLE "group"(
  "groupID" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "name" VARCHAR(45) NOT NULL,
  "description" VARCHAR(45),
  "isErased" INTEGER DEFAULT 0,
--   是否注销：
--   0 - 未注销
--   1- 已注销
  "erasedTime" DATETIME,
  "erasePeople" VARCHAR(45)
);
CREATE TABLE "group_user"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "groupID" VARCHAR(45) NOT NULL,-- 群组ID
  "userID" VARCHAR(45) NOT NULL-- 用户ID
);
CREATE TABLE "costItem"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "partyID" VARCHAR(45) NOT NULL,
  "name" VARCHAR(45),
  "participant" TEXT NOT NULL,
  "time" DATETIME,
  "money" FLOAT,
  "address" VARCHAR(45),
  "typeUser" VARCHAR(45),-- 录入人
  "createTime" DATETIME,
  "isErased" INTEGER DEFAULT 0,
  "erasedTime" DATETIME,
  "erasePeople" VARCHAR(45)
);
CREATE TABLE "groupMoney"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "moneyTag" VARCHAR(45) NOT NULL,-- 本次交班费的标记
  "userID" VARCHAR(45) NOT NULL,
  "money" FLOAT,
  "time" DATETIME,
  "typeUser" VARCHAR(45),
  "typeTime" DATETIME,
  "partyID" VARCHAR(45),
  "isErased" INTEGER DEFAULT 0,
  "erasedTime" DATETIME,
  "erasePeople" VARCHAR(45)
);
CREATE TABLE "balance"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,-- 余额
  "time" DATETIME,
  "insum" FLOAT,-- 收入总额
  "outSum" FLOAT,-- 消费总额
  "balance" FLOAT NOT NULL-- 余额
);
CREATE TABLE "photo"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "path" VARCHAR(200) NOT NULL,
  "uploadUser" VARCHAR(45) NOT NULL,
  "uploadTime" DATETIME,
  "partyID" VARCHAR(45),
  "isErased" INTEGER DEFAULT 0,
  "erasedTime" DATETIME,
  "erasePeople" VARCHAR(45)
);
CREATE TABLE "photo_comment"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "photoID" VARCHAR(45) NOT NULL,-- 照片ID
  "content" VARCHAR(45) NOT NULL,-- 评论内容
  "createTime" DATETIME,-- 评论时间
  "userID" VARCHAR(45) NOT NULL,-- 评论人
  "isErased" INTEGER DEFAULT 0,
  "erasedTime" DATETIME,
  "erasedPeople" VARCHAR(45)
);
COMMIT;
