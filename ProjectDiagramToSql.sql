-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Customer` (
  `idCustomer` INT NOT NULL AUTO_INCREMENT,
  `TcCustomer` VARCHAR(11) NOT NULL,
  `nameCustomer` VARCHAR(50) NOT NULL,
  `surnameCustomer` VARCHAR(50) NOT NULL,
  `birthdateCustomer` DATE NOT NULL,
  `genderCustomer` VARCHAR(1) NULL,
  `licenceNumCustomer` VARCHAR(20) NOT NULL,
  `licenceTypesCustomer` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idCustomer`),
  UNIQUE INDEX `TCMember_UNIQUE` (`TcCustomer` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Vehicle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Vehicle` (
  `idVehicle` INT NOT NULL AUTO_INCREMENT,
  `brandVehicle` VARCHAR(15) NOT NULL,
  `modelVehicle` VARCHAR(20) NOT NULL,
  `typeVehicle` VARCHAR(15) NOT NULL,
  `prodYearVehicle` DATE NOT NULL,
  `transmissionTypeVehicle` VARCHAR(20) NOT NULL,
  `fuelTypeVehicle` VARCHAR(15) NOT NULL,
  `colorVehicle` VARCHAR(10) NOT NULL,
  `trafficInsuranceVehicle` DATE NOT NULL,
  `motorInsuranceVehicle` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idVehicle`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Login` (
  `idLogin` INT NOT NULL ,
  `usernameLogin` VARCHAR(45) NOT NULL,
  `passwordLogin` VARCHAR(45) NOT NULL,
  `dateLogin` DATE NOT NULL,
  PRIMARY KEY (`idLogin`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Employee` (
  `idEmployee` INT NOT NULL AUTO_INCREMENT,
  `TCEmployee` VARCHAR(11) NOT NULL,
  `nameEmployee` VARCHAR(50) NOT NULL,
  `surnameEmployee` VARCHAR(50) NOT NULL,
  `birthdateEmployee` DATE NOT NULL,
  `genderEmployee` VARCHAR(1) NULL,
  `telNoEmployee` VARCHAR(15) NOT NULL,
  `emailEmployee` VARCHAR(50) NOT NULL,
  `addressEmployee` VARCHAR(200) NOT NULL,
  `licenceNumEmployee` VARCHAR(20) NOT NULL,
  `licenceTypeEmployee` VARCHAR(15) NOT NULL,
  `educStatEmployee` VARCHAR(15) NOT NULL,
  `departmentEmployee` VARCHAR(20) NOT NULL,
  `salaryEmployee` INT NOT NULL,
  `IBANEmployee` VARCHAR(26) NOT NULL,
  `Login_idLogin` INT NOT NULL,
  PRIMARY KEY (`idEmployee`, `Login_idLogin`),
  UNIQUE INDEX `TCEmployee_UNIQUE` (`TCEmployee` ASC) VISIBLE,
  INDEX `fk_Employee_Login1_idx` (`Login_idLogin` ASC) VISIBLE,
  CONSTRAINT `fk_Employee_Login1`
    FOREIGN KEY (`Login_idLogin`)
    REFERENCES `mydb`.`Login` (`idLogin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Rent`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Rent` (
  `Customer_idCustomer` INT NOT NULL,
  `Vehicle_idVehicle` INT NOT NULL,
  `idRent` INT NOT NULL,
  `acqusitionDate` DATE NOT NULL,
  `dueDate` DATE NOT NULL,
  `Employee_idEmployee` INT NOT NULL,
  `Employee_Login_idLogin` INT NOT NULL,
  PRIMARY KEY (`Customer_idCustomer`, `Vehicle_idVehicle`, `idRent`, `Employee_idEmployee`, `Employee_Login_idLogin`),
  INDEX `fk_Customer_has_Vehicle_Vehicle1_idx` (`Vehicle_idVehicle` ASC) VISIBLE,
  INDEX `fk_Customer_has_Vehicle_Customer_idx` (`Customer_idCustomer` ASC) VISIBLE,
  INDEX `fk_Rent_Employee1_idx` (`Employee_idEmployee` ASC, `Employee_Login_idLogin` ASC) VISIBLE,
  CONSTRAINT `fk_Customer_has_Vehicle_Customer`
    FOREIGN KEY (`Customer_idCustomer`)
    REFERENCES `mydb`.`Customer` (`idCustomer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Customer_has_Vehicle_Vehicle1`
    FOREIGN KEY (`Vehicle_idVehicle`)
    REFERENCES `mydb`.`Vehicle` (`idVehicle`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Rent_Employee1`
    FOREIGN KEY (`Employee_idEmployee` , `Employee_Login_idLogin`)
    REFERENCES `mydb`.`Employee` (`idEmployee` , `Login_idLogin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Contact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Contact` (
  `idContact` INT NOT NULL,
  `telNoContact` VARCHAR(15) NOT NULL,
  `emailContact` VARCHAR(50) NOT NULL,
  `typeAddressContact` VARCHAR(20) NOT NULL,
  `addressContact` VARCHAR(100) NOT NULL,
  `districtAddressContact` VARCHAR(15) NOT NULL,
  `postCodeAddressContact` VARCHAR(5) NOT NULL,
  `cityAddressContact` VARCHAR(45) NOT NULL,
  `countryAddressContact` VARCHAR(15) NOT NULL,
  `Customer_idCustomer` INT NOT NULL,
  PRIMARY KEY (`idContact`, `Customer_idCustomer`),
  INDEX `fk_Contact_Customer1_idx` (`Customer_idCustomer` ASC) VISIBLE,
  CONSTRAINT `fk_Contact_Customer1`
    FOREIGN KEY (`Customer_idCustomer`)
    REFERENCES `mydb`.`Customer` (`idCustomer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
