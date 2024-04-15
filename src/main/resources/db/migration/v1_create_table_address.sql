CREATE TABLE `addresses` (
	`id` SERIAL NOT NULL COMMENT 'id',
	`name_first` VARCHAR(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`name_last` VARCHAR(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`mail_address` VARCHAR(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`gender` VARCHAR(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
	`update_day` INT(4) NOT NULL,
	`make_day` INT(4) NOT NULL,
	`delete_day` INT(4),
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;